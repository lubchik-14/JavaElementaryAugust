package com.hillel.lessons.lesson7.printer;

import com.hillel.lessons.lesson5.convertors.IStudentStringConverter;
import com.hillel.lessons.lesson5.student.Student;
import com.hillel.lessons.lesson5.printers.IStudentPrinter;

public class StudentPrinter {

    public IStudentPrinter printToConsole(IStudentStringConverter converter) {
        return new IStudentPrinter() {
            @Override
            public void out(com.hillel.lessons.lesson5.student.Student student) {
                System.out.println(converter.convert(student));
            }
        };
    }

    public IStudentPrinter printToNull() {
        return new IStudentPrinter() {
            @Override
            public void out(Student student) {
            }
        };
    }

    public IStudentPrinter delegate(IStudentPrinter[] printers) {
        return new IStudentPrinter() {
            @Override
            public void out(Student student) {
                for (IStudentPrinter printer : printers) {
                    printer.out(student);
                }
            }
        };
    }

}
