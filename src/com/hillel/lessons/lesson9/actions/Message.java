package com.hillel.lessons.lesson9.actions;

import java.util.Calendar;
import java.util.Objects;

public class Message extends Action {
    private String messageText;

    public Message(Calendar callDate, String phoneNumber, String messageText) {
        super(phoneNumber, callDate);
        this.messageText = messageText;
    }

    public String getMessageText() {
        return messageText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        if (!super.equals(o)) return false;
        Message message = (Message) o;
        return Objects.equals(getMessageText(), message.getMessageText());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMessageText());
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageText='" + messageText + '\'' +
                '}';
    }
}
