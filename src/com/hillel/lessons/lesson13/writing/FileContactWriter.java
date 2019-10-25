package com.hillel.lessons.lesson13.writing;

import com.hillel.lessons.lesson13.Contact;
import com.hillel.lessons.lesson13.converting.IContactConverter;

import java.io.PrintWriter;

public class FileContactWriter implements IContactWriter {
    private IContactConverter converter;
    private PrintWriter out;

    public FileContactWriter(IContactConverter converter, PrintWriter out) {
        this.converter = converter;
        this.out = out;
    }

    @Override
    public void out(Contact contact) {
        out.println(converter.convert(contact, " / "));
    }
}
