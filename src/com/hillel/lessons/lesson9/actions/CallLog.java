package com.hillel.lessons.lesson9.actions;

import java.util.Calendar;
import java.util.Objects;

public class CallLog extends Action {

    public CallLog(Calendar callDate, String phoneNumber) {
        super(phoneNumber, callDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CallLog)) return false;
        CallLog callLog = (CallLog) o;
        return Objects.equals(getPhoneNumber(), callLog.getPhoneNumber()) &&
                Objects.equals(getCallDate(), callLog.getCallDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPhoneNumber(), getCallDate());
    }

}
