package com.hillel.lessons.lesson13.reading;

import com.hillel.lessons.lesson13.Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileContactReader implements IContactReader {
    private Scanner scanner;
    private String delimiter;

    public FileContactReader(Scanner scanner, String delimiter) {
        this.scanner = scanner;
        this.scanner.useDelimiter(" / ");
        this.delimiter = delimiter;
        this.scanner.useDelimiter(delimiter);
    }

    @Override
    public List<Contact> read() {
        List<Contact> contacts = new ArrayList<>();
        while (scanner.hasNextLine()) {
            Scanner s = new Scanner(scanner.nextLine()).useDelimiter(" / ");
            while (s.hasNext()) {
                contacts.add(new Contact(s.next(), s.next(), s.next(), s.nextInt()));
            }
        }
        return contacts;
    }
}
