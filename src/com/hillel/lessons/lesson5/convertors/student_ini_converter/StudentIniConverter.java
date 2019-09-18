package com.hillel.lessons.lesson5.convertors.student_ini_converter;

import com.hillel.lessons.lesson5.convertors.student_converter_interface.IStudentStringConverter;
import com.hillel.lessons.lesson5.student.Student;

public class StudentIniConverter implements IStudentStringConverter {

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
}
