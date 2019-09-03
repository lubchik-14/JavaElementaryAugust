package com.hillel.lessons.lesson2.worker;

import com.hillel.lessons.lesson2.student.Student;

import java.util.Arrays;

public class Teacher {
    private Student[] students;

    public Teacher(Student[] students) {
        this.students = students;
    }

    public void sortByAge(){
        for (int out = students.length - 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if(students[in].getAge() > students[in + 1].getAge())
                    toSwap(in, in + 1);
            }
        }
    }

    public void sortByName(){
        for (int out = students.length - 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if(students[in].getName().compareTo(students[in + 1].getName()) > 0)
                    toSwap(in, in + 1);
            }
        }
    }

    private void toSwap(int first, int second){
        Student dummy = students[first];
        students[first] = students[second];
        students[second] = dummy;
    }

    public Student findStudentBySubstring(String namePart){
        for (Student student : students) {
            if (student.getName().contains(namePart)) {
                return student;
            }
        }
        return null;
    }

    public Student[] findStudentsBySubstring(String namePart){
        Student[] foundStudents = {};
        for (Student student : this.students) {
            if (student.getName().contains(namePart)) {
                foundStudents = Arrays.copyOf(foundStudents, foundStudents.length + 1);
                foundStudents[foundStudents.length - 1] = student;
            }
        }
        return foundStudents;
    }
}
