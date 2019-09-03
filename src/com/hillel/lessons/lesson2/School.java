package com.hillel.lessons.lesson2;

import com.hillel.lessons.lesson2.student.Student;
import com.hillel.lessons.lesson2.worker.StudentFactory;
import com.hillel.lessons.lesson2.worker.Teacher;

import java.util.Arrays;

public class School {
    public static void main(String[] args) {
        Student[] students = new Student[10];

        StudentFactory studentFactory = new StudentFactory();
        for (int i = 0; i < students.length; i++) {
            students[i] = studentFactory.createStudent();
        }
        System.out.println("Created array");
        System.out.println(Arrays.toString(students));
        System.out.println();

        Teacher teacher = new Teacher(students);
        System.out.println("Sorted array by age");
        teacher.sortByAge();
        System.out.println(Arrays.toString(students));
        System.out.println();

        System.out.println("Sorted array by name");
        teacher.sortByName();
        System.out.println(Arrays.toString(students));
        System.out.println();

        System.out.println("Found student containing 'Van'");
        System.out.println(
                teacher.findStudentBySubstring("Van") == null ? "Not found!" : teacher.findStudentBySubstring("Van"));
        System.out.println();

        System.out.println("Found students containing 'Ale'");
        System.out.println(
                Arrays.toString(teacher.findStudentsBySubstring("Ale")));
        System.out.println();
    }
}
