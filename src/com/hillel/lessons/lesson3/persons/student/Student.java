package com.hillel.lessons.lesson3.persons.student;

public class Student {
    private static int nextId = 0;
    private int id;
    private String name;
    private int age;

    public Student(String name, int age){
        this.id = nextId;
        nextId++;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
