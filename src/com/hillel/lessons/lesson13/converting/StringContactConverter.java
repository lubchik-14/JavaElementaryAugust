package com.hillel.lessons.lesson13.converting;

import com.hillel.lessons.lesson13.Contact;

public class StringContactConverter implements IContactConverter {

    @Override
    public String convert(Contact contact, String delimiter) {
        return String.format("%s%s%s%s%s%s%s",
                contact.getFirstName(), delimiter, contact.getLastName(), delimiter,
                contact.getPhoneNumber(), delimiter, contact.getBirthYear());

    }
}
