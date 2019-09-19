package com.hillel.lessons.lesson5.printers.console;

import com.hillel.lessons.lesson5.convertors.interfaces.IStudentStringConverter;
import com.hillel.lessons.lesson5.printers.interfaces.IStudentPrinter;
import com.hillel.lessons.lesson5.student.Student;

public class ConsolePrinter implements IStudentPrinter {
    private IStudentStringConverter converter;

    public ConsolePrinter(IStudentStringConverter converter) {
        this.converter = converter;
    }

    @Override
    public void out(Student student) {
        System.out.println(this.converter.convert(student));
    }
}
