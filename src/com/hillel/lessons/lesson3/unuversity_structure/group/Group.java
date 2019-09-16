package com.hillel.lessons.lesson3.unuversity_structure.group;

import com.hillel.lessons.lesson3.persons.student.Student;

import java.util.Arrays;

public class Group {
    private String name;
    private Student[] students = {};

    public Group(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public void addStudent(Student student){
        students = Arrays.copyOf(students, students.length + 1);
        students[students.length - 1] = student;
    }

    public void delStudent(){

    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
