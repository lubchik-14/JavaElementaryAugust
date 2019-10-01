package com.hillel.lessons.lesson7.comparator;

public class Comparator {
    public static void main(String[] args) {
        Student s1 = new Student("Alex", 28);
        Student s2 = new Student("Alex", 20);
        Student s3 = new Student("Alex", 30);
        Student s5 = new Student("August", 19);

        System.out.println(Student.compareByName().compare(s1, s2));
        System.out.println(Student.compareByName().compare(s1, s5));
        System.out.println(Student.compareByAge().compare(s5, s3));
        System.out.println(Student.compareByNameByAge().compare(s1, s2));
    }
}