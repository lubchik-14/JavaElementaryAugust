package com.hillel.lessons.lesson12;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    //1
    public void setName(String name) throws IllegalArgumentException {
        if ((name == null) || name.isEmpty()) {
            throw new IllegalArgumentException("Name must have some characters");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    //1
    public void setAge(int age) throws IllegalArgumentException {
        if (age == 0) {
            throw new IllegalArgumentException("Age must be > " + age);
        }
        this.age = age;
    }

    //2, 4
    public static Student deserialize(String string) throws MyDomainException {
        throw new MyDomainException("MyDomainException thrown from deserialize(String)", null);
    }

    public void throwingMethod(String string) throws MyDomainException {
        try {
            deserialize(string);
        } catch (MyDomainException e) {
            System.out.println("Caught MyDomainException inside throwingMethod");
            e.printStackTrace();
            System.out.println("ReThrew MyDomainException inside throwingMethod");
            throw e;
        }
    }

    public void catchingMethod(String string) {
        try {
            deserialize(string);
        } catch (MyDomainException e) {
            System.out.println("Caught MyDomainException inside catchingMethod");
            e.printStackTrace();
            System.out.println("ReThrew new RuntimeException inside catchingMethod");
            throw new RuntimeException();
        }
    }
}
