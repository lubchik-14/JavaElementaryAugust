package com.hillel.lessons.lesson12;

public class ExceptionsMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(20);
//        student.setAge(0);
        student.setName("Vasya");
//        student.setName(null);

        //5
        System.out.println("5");
        try {
            Student.deserialize("");
        } catch (MyDomainException e) {
            System.out.println("Caught MyDomainException inside main");
            e.printStackTrace();
        }

        //6, 9
        System.out.println("6");
        try {
            student.throwingMethod("Something");
        } catch (MyDomainException e) {
            System.out.println("Caught MyDomainException inside main");
            e.printStackTrace();
        } finally {
            System.out.println("This string always shows");
        }

        //7, 8
        System.out.println("7");
        try {
            student.catchingMethod("Something");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException inside main");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Caught Exception inside main");
            e.printStackTrace();
        }

        System.out.println("Finish");
    }
}
