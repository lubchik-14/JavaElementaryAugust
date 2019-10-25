package com.hillel.lessons.lesson13;

import com.hillel.lessons.lesson13.converting.StringContactConverter;
import com.hillel.lessons.lesson13.writing.FileContactWriter;

import java.io.*;

public class Lesson13Writing {
    public static void main(String[] args) {
        try (PrintWriter out = new PrintWriter(new FileOutputStream("Contacts.txt"))) {
            FileContactWriter writer = new FileContactWriter(new StringContactConverter(), out);
            Data.writtenContacts.forEach(writer::out);
            System.out.println("Written successfully");
        } catch (FileNotFoundException e) {
            System.out.println("File not created!");
            e.printStackTrace();
        }
    }
}
