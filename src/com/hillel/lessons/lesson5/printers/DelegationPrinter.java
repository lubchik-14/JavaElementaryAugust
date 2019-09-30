package com.hillel.lessons.lesson5.printers;

import com.hillel.lessons.lesson5.student.Student;

public class DelegationPrinter implements IStudentPrinter {
    private final IStudentPrinter[] printers;

    public DelegationPrinter(IStudentPrinter[] printers) {
        this.printers = printers;
    }

    @Override
    public void out(Student student) {
        for (IStudentPrinter printer : printers) {
            printer.out(student);
        }
    }
}
