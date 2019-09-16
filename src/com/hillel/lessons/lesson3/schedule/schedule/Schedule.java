package com.hillel.lessons.lesson3.schedule.schedule;

import com.hillel.lessons.lesson3.schedule.lessonorder.LessonOrder;
import com.hillel.lessons.lesson3.building_structure.auditory.Auditorium;
import com.hillel.lessons.lesson3.persons.teacher.Teacher;
import com.hillel.lessons.lesson3.unuversity_structure.faculty.Faculty;
import com.hillel.lessons.lesson3.unuversity_structure.subject.Subject;
import com.hillel.lessons.lesson3.unuversity_structure.group.Group;

import java.time.DayOfWeek;

public class Schedule {
    private Faculty faculty;
    private Auditorium auditorium;
    private Subject subject;
    private Teacher teacher;
    private Group group;
    private DayOfWeek dayOfWeek;
    private LessonOrder lessonOrder;

    public Schedule(Faculty faculty, DayOfWeek dayOfWeek, LessonOrder lessonOrder, Group group, Auditorium auditorium, Teacher teacher, Subject subject) {
        this.faculty = faculty;
        this.auditorium = auditorium;
        this.subject = subject;
        this.teacher = teacher;
        this.group = group;
        this.dayOfWeek = dayOfWeek;
        this.lessonOrder = lessonOrder;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public Subject getSubject() {
        return subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Group getGroup() {
        return group;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public LessonOrder getLessonOrder() {
        return lessonOrder;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "auditorium=" + auditorium +
                ", subject=" + subject +
                ", teacher=" + teacher +
                ", group=" + group +
                ", dayOfWeek=" + dayOfWeek +
                ", lessonOrder=" + lessonOrder +
                '}';
    }
}
