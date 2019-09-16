package com.hillel.lessons.lesson3.processing;

import com.hillel.lessons.lesson3.persons.student.Student;
import com.hillel.lessons.lesson3.persons.teacher.Teacher;
import com.hillel.lessons.lesson3.unuversity_structure.subject.Subject;
import java.util.Random;

public class Factory {
    private Random random = new Random();
    private String[] names = new String[]{
            "Alex", "Alena", "Alan", "Aleksey", "Vanya", "Lena", "Luba", "Masha", "Kolya", "Anatoliy", "Nick", "Sergey",
            "Masha", "Polina", "Bogdan", "Boris", "Liybov", "Olga", "Viktoria", "Sveta"};
    private String[] subjects = new String[]{
            "Calligraphy", "Arithmetic", "Literature", "Zoology", "Latin", "Astronomy", "Cryptography",
            "Law", "Psychology", "MicroEconomy", "Chemistry", "Biology", "Math", "MacroEconomy", "Insurance",
            "State Audit", "Taxes And Taxation", "Digital Economy", "Data Science",
            "Accounting And Taxation Consulting", "Accounting And Taxation", "Brand-management", "Marketing Management",
            "Digital Marketing", "Marketing"
    };

    public Student[] createStudents(int count) {
        Student[] students = new Student[count];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[randomWithin(0, names.length - 1)], randomWithin(16, 50));
        }
        return students;
    }

    public Teacher[] createTeachers(int count){
        Teacher[] createdTeachers = new Teacher[count];
        for (int i = 0; i < createdTeachers.length; i++) {
            createdTeachers[i] = new Teacher(
                    names[randomWithin(0, names.length - 1)], randomWithin(25, 70), createSubjects(randomWithin(1, 5)));
        }
        return createdTeachers;
    }

    public Subject[] createSubjects(int count){
        Subject[] createdSubjects = new Subject[count];
        for (int i = 0; i < createdSubjects.length; i++) {
            createdSubjects[i] = new Subject(this.subjects[randomWithin(0, this.subjects.length - 1)]);
        }
        return createdSubjects;
    }

    private int randomWithin(int min, int max){
        return random.nextInt(max - min) + min;
    }
}
