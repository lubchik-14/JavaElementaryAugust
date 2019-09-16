package com.hillel.lessons.lesson3.persons.teacher;

import com.hillel.lessons.lesson3.unuversity_structure.subject.Subject;

import java.util.Arrays;

public class Teacher {
    private static int nextId = 1;
    private int id;
    private String name;
    private int age;
    private Subject[] subjects;

    public Teacher(String name, int age, Subject[] subjects) {
        this.id = nextId;
        nextId++;
        this.name = name;
        this.age = age;
        this.subjects = subjects;
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

    public Subject[] getSubjects() {
        return subjects;
    }

    public void addSubject(Subject subject) {
        this.subjects = Arrays.copyOf(this.subjects, this.subjects.length + 1);
        this.subjects[subjects.length - 1] = subject;
    }

    public void delSubject(Subject subject) {
        if (this.subjects.length > 1) {
            Subject[] newSubject = new Subject[this.subjects.length - 1];
            int i = 0;
            for (Subject sub : subjects) {
                if (sub != subject) {
                    newSubject[i] = sub;
                    i++;
                }
            }
            this.subjects = newSubject;
        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}
