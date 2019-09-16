package com.hillel.lessons.lesson3.schedule.lessonorder;

public enum LessonOrder {
    FIRST("8:30", "10:00"),
    SECOND("10:15", "10:45"),
    THIRD("12:15", "12:45"),
    FOURTH("14:00", "15:30"),
    FIFTH("15:40", "17:10"),
    SIXTH("17:15", "18:45"),
    SEVENTH("18:20", "20:20"),
    EIGHTH("20:25", "21:55");

    private String start;
    private String end;

    LessonOrder(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }
}
