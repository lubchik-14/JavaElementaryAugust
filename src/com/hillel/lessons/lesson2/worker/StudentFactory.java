package com.hillel.lessons.lesson2.worker;

import com.hillel.lessons.lesson2.student.Student;

import java.util.Random;

public class StudentFactory {

    private String[] names = new String[]{"Alex", "Alena", "Alan", "Aleksey", "Vanya", "Lena", "Luba", "Masha", "Kolya", "Alex", "Nick", "Sergey"};

    public Student createStudent() {
        Student student = new Student();
        Random random = new Random();
        student.setName(names[random.nextInt(names.length - 1)]);
        student.setAge(random.nextInt(55 - 16) + 16);
        return student;
    }
}
