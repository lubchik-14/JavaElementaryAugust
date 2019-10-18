package com.hillel.lessons.lesson9.actions;

import java.util.Calendar;
import java.util.Objects;

public abstract class Action {
    private String phoneNumber;
    private Calendar callDate;

    public Action(String phoneNumber, Calendar callDate) {
        this.phoneNumber = phoneNumber;
        this.callDate = callDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Calendar getCallDate() {
        return callDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Action)) return false;
        Action action = (Action) o;
        return Objects.equals(getPhoneNumber(), action.getPhoneNumber()) &&
                Objects.equals(getCallDate(), action.getCallDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPhoneNumber(), getCallDate());
    }

    @Override
    public String toString() {
        return "Action{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", callDate=" + callDate +
                '}';
    }
}
