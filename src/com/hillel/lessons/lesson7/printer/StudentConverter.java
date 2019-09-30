package com.hillel.lessons.lesson7.printer;

import com.hillel.lessons.lesson5.convertors.IStudentStringConverter;
import com.hillel.lessons.lesson5.student.Student;

public class StudentConverter {

    public IStudentStringConverter convertToIni() {
        return new IStudentStringConverter() {
            @Override
            public String convert(Student student) {
                StringBuilder builder = new StringBuilder();
                builder.append("name=")
                        .append(student.getName())
                        .append("\n")

                        .append("age=")
                        .append(student.getAge())
                        .append("\n")

                        .append("group=")
                        .append(student.getGroup());
                return builder.toString();
            }
        };
    }

    public IStudentStringConverter convertToJson() {
        return new IStudentStringConverter() {
            @Override
            public String convert(Student student) {
                StringBuilder builder = new StringBuilder();
                builder.append("{\n")
                        .append("\t\"name\"")
                        .append(":\"")
                        .append(student.getName())
                        .append("\",\n")

                        .append("\t\"age\"")
                        .append(":")
                        .append(student.getAge())
                        .append(",\n")

                        .append("\t\"group\"")
                        .append(":\"")
                        .append(student.getGroup())
                        .append("\"\n")
                        .append("}");
                return builder.toString();
            }
        };
    }

    public IStudentStringConverter convertToXml() {
        return new IStudentStringConverter() {
            @Override
            public String convert(Student student) {
                StringBuilder builder = new StringBuilder();
                String className = student.getClass().getSimpleName().toLowerCase();
                builder.append("<")
                        .append(className)
                        .append(">");
                builder.append("\n\t")
                        .append("<")
                        .append("name")
                        .append(">")
                        .append(student.getName())
                        .append("</")
                        .append("name")
                        .append(">");
                builder.append("\n\t")
                        .append("<")
                        .append("age")
                        .append(">")
                        .append(student.getAge())
                        .append("</")
                        .append("age")
                        .append(">");
                builder.append("\n\t")
                        .append("<")
                        .append("group")
                        .append(">")
                        .append(student.getGroup())
                        .append("</")
                        .append("group")
                        .append(">");
                builder.append("\n")
                        .append("</")
                        .append(className)
                        .append(">");
                return builder.toString();
            }
        };
    }
}
