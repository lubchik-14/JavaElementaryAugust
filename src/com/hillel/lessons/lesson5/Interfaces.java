package com.hillel.lessons.lesson5;

import com.hillel.lessons.lesson5.convertors.student_ini_converter.StudentIniConverter;
import com.hillel.lessons.lesson5.convertors.student_json_converter.StudentJsonConverter;
import com.hillel.lessons.lesson5.convertors.student_converter_interface.IStudentStringConverter;
import com.hillel.lessons.lesson5.convertors.student_xml_converter.StudentXmlConverter;
import com.hillel.lessons.lesson5.printers.delegation_printer.DelegationPrinter;
import com.hillel.lessons.lesson5.printers.student_printer_interface.IStudentPrinter;
import com.hillel.lessons.lesson5.printers.console_printer.ConsolePrinter;
import com.hillel.lessons.lesson5.printers.nowhere_printer.NowherePrinter;
import com.hillel.lessons.lesson5.student.Student;

public class Interfaces {
    public static void main(String[] args) {
        Student student1 = new Student("Luba", 18, "JavaElementary");
        Student student2 = new Student("Vera", 19, "DevOps");

        IStudentStringConverter iniStringConverter = new StudentIniConverter();
        IStudentStringConverter jsonStringConverter = new StudentJsonConverter();
        IStudentStringConverter xmlStringConverter = new StudentXmlConverter();

        ConsolePrinter consolePrinter = new ConsolePrinter(xmlStringConverter);
        consolePrinter.out(student1);

        IStudentPrinter delegationPrinter = new DelegationPrinter(new IStudentPrinter[] {
                new ConsolePrinter(iniStringConverter),
                new ConsolePrinter(jsonStringConverter),
                new ConsolePrinter(xmlStringConverter),
                new NowherePrinter()
        });

        delegationPrinter.out(student1);
        delegationPrinter.out(student2);

    }
}