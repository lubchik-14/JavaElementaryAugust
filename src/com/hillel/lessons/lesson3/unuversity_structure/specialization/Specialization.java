package com.hillel.lessons.lesson3.unuversity_structure.specialization;

import com.hillel.lessons.lesson3.unuversity_structure.subject.Subject;
import com.hillel.lessons.lesson3.unuversity_structure.group.Group;

import java.util.Arrays;

public class Specialization {
    private static int nextId = 0;
    private int id;
    private String name;
    private Group[] groups = {};
    private Subject[] subjects;

    public Specialization(String name, Subject[] subjects) {
        this.id = nextId;
        nextId++;
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void addSubject(Subject subject) {
        this.subjects = Arrays.copyOf(this.subjects, this.subjects.length + 1);
        this.subjects[subjects.length - 1] = subject;
    }

    public void delSubject(Subject subject) {
        if (this.subjects.length > 0) {
            Subject[] newSubjects = new Subject[this.subjects.length - 1];
            int i = 0;
            for (Subject sub : subjects) {
                if (sub != subject) {
                    newSubjects[i] = sub;
                    i++;
                }
            }
            this.subjects= newSubjects;
        }
    }

    public Group[] getGroups() {
        return groups;
    }

    public void addGroups(Group[] groups){
        this.groups = Arrays.copyOf(this.groups, this.groups.length + groups.length);
        System.arraycopy(groups, 0, this.groups, this.groups.length - groups.length, groups.length);
    }

    @Override
    public String toString() {
        return "Specialization{" +
                "name='" + name + '\'' +
                ", groups=" + Arrays.toString(groups) +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}
