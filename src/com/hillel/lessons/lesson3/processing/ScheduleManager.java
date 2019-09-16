package com.hillel.lessons.lesson3.processing;

import com.hillel.lessons.lesson3.schedule.lessonorder.LessonOrder;
import com.hillel.lessons.lesson3.schedule.schedule.Schedule;
import com.hillel.lessons.lesson3.unuversity_structure.faculty.Faculty;

import java.time.DayOfWeek;

public class ScheduleManager {

    public void printSchedule(Faculty faculty, Schedule... schedules) {
        System.out.println(faculty.getName() + "faculty");
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            if ((dayOfWeek != DayOfWeek.SATURDAY) && (dayOfWeek != DayOfWeek.SUNDAY)){
                System.out.println(dayOfWeek);
                for (LessonOrder lessonOrder : LessonOrder.values()) {
                    System.out.printf("%s (%s - %s)%n", lessonOrder, lessonOrder.getStart(), lessonOrder.getEnd());
                    System.out.println("---------------------------------------------------------------------");
                    System.out.printf("%-10s| %-10s| %-35s| %-10s%n", "Auditorium", "Group", "Subject", "Teacher");
                    System.out.println("---------------------------------------------------------------------");
                    for (Schedule schedule : schedules) {
                        if ((schedule.getLessonOrder() == lessonOrder) && (schedule.getDayOfWeek() == dayOfWeek)
                                && (schedule.getFaculty() == faculty)) {
                            System.out.printf("%-10s| %-10s| %-35s| %-10s%n",
                                    schedule.getAuditorium().getNumber(),
                                    schedule.getGroup().getName(),
                                    schedule.getSubject().getName(),
                                    schedule.getTeacher().getName());
                        }
                    }
                    System.out.println("---------------------------------------------------------------------");
                }
            }
        }
    }
}
