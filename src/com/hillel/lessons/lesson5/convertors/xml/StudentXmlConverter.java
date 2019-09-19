package com.hillel.lessons.lesson5.convertors.xml;

import com.hillel.lessons.lesson5.convertors.interfaces.IStudentStringConverter;
import com.hillel.lessons.lesson5.student.Student;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StudentXmlConverter implements IStudentStringConverter {

    @Override
    public String convert(Student student) {
        StringBuilder builder = new StringBuilder();
        String[] names = getStringFieldNames(student);
        Method[] methods = getGetMethodByFieldName(student, names);
        String className = student.getClass().getSimpleName().toLowerCase();
        builder.append("<")
                .append(className)
                .append(">");
        for (int i = 0; i < names.length; i++) {
            builder.append("\n\t")
                    .append("<")
                    .append(names[i])
                    .append(">")
                    .append(myInvoke(methods[i], student))
                    .append("</")
                    .append(names[i])
                    .append(">");
        }
        builder.append("\n")
                .append("</")
                .append(className)
                .append(">");
        return builder.toString();
    }

    private String[] getStringFieldNames(Student student) {
        Field[] fields = student.getClass().getDeclaredFields();
        String[] names = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            names[i] = fields[i].getName().toLowerCase();
        }
        return names;
    }

    private Method[] getGetMethodByFieldName(Student student, String[] names) {
        Method[] methods = new Method[names.length];
        for (int i = 0; i < names.length; i++) {
            String methodName = "get" + (names[i].substring(0, 1).toUpperCase() + names[i].substring(1));
            try {
                methods[i] = student.getClass().getMethod(methodName);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
        return methods;
    }

    private String myInvoke(Method method, Student student) {
        StringBuilder builder = new StringBuilder();
        try {
            builder.append(method.invoke(student));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }
}
