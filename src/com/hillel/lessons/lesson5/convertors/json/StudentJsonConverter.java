package com.hillel.lessons.lesson5.convertors.json;

import com.hillel.lessons.lesson5.convertors.interfaces.IStudentStringConverter;
import com.hillel.lessons.lesson5.student.Student;

public class StudentJsonConverter implements IStudentStringConverter {

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
}
