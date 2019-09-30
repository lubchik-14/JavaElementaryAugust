package com.hillel.lessons.lesson7.inner_classes;

import java.util.Comparator;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Comparator<Student> compareByAge() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.age > o2.age) {
                    return 1;
                }
                else if (o1.age < o2.age) {
                    return -1;
                };
                return 0;
            }
        };
    }

    public static Comparator<Student> compareByName(){
        return new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        };
    }

    public static Comparator<Student> compareByNameByAge(){
        return new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = compareByName().compare(o1, o2);
                if (result == 0) {
                    return compareByAge().compare(o1, o2);
                }
                return result;
            }
        };
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
