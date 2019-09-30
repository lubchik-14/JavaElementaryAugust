package com.hillel.lessons.lesson7.printer;

import com.hillel.lessons.lesson5.printers.IStudentPrinter;
import com.hillel.lessons.lesson5.student.Student;

public class StudentPrinterMain {
    public static void main(String[] args) {
        Student s1 = new Student("Alex", 28, "15");
        Student s2 = new Student("Alex", 20, "10");
        Student s3 = new Student("Alex", 30, "15");

        StudentConverter converter = new StudentConverter();

        System.out.println(converter.convertToIni().convert(s1));
        System.out.println(converter.convertToJson().convert(s2));
        System.out.println(converter.convertToXml().convert(s3));

        StudentPrinter printer = new StudentPrinter();
        printer.printToConsole(converter.convertToXml()).out(s2);

        System.out.printf("%s Delegation %s", "\n", "\n");
        printer.delegate(new IStudentPrinter[]{
                printer.printToConsole(converter.convertToXml()),
                printer.printToConsole(converter.convertToIni()),
                printer.printToConsole(converter.convertToJson()),
                printer.printToNull()
        }).out(s1);
    }
}
