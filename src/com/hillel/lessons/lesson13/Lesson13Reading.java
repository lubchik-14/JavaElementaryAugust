package com.hillel.lessons.lesson13;

import com.hillel.lessons.lesson13.reading.FileContactReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Lesson13Reading {
    public static void main(String[] args) {
        List<Contact> readContact = new ArrayList<>();
        try (Scanner in = new Scanner(new FileInputStream("Contacts.txt"))) {
            FileContactReader reader = new FileContactReader(in, " / ");
            readContact = reader.read();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }

        readContact.stream()
                .sorted(Comparator.comparingInt(Contact::getBirthYear))
                .limit(5)
                .forEach(contact -> System.out.printf("%s %s (%s) %s year\n",
                        contact.getFirstName(), contact.getLastName(),
                        contact.getPhoneNumber(), contact.getBirthYear()));
    }
}
