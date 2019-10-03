package com.hillel.lessons.lesson7.comparator;

import java.util.Comparator;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Comparator<Student> compareByAge() {
        return ((o1, o2) -> o1.age - o2.age);
    }

    public static Comparator<Student> compareByName(){
        return (o1, o2) -> o1.name.compareTo(o2.name);
    }

    public static Comparator<Student> compareByNameByAge(){
        return (o1, o2) -> {
            int result = compareByName().compare(o1, o2);
            if (result == 0) {
                return compareByAge().compare(o1, o2);
            }
            return result;
        };
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
