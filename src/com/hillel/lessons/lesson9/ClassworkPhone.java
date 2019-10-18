package com.hillel.lessons.lesson9;

import com.hillel.lessons.lesson9.actions.CallLog;
import com.hillel.lessons.lesson9.actions.Message;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;


public class ClassworkPhone {
    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Sergey", "+380500538221"));
        contacts.add(new Contact("Mom", "+380958335246"));
        contacts.add(new Contact("Dad", "+380958408584"));
        contacts.add(new Contact("SergeysMom", "+380995223262"));
        contacts.add(new Contact("SergeysDad", "+380995223263"));
        contacts.add(new Contact("Luba", "+380502851161"));
        contacts.add(new Contact("221", "+380501111111"));

        List<CallLog> calls = new ArrayList<>();
        calls.add(new CallLog(new GregorianCalendar(2019, Calendar.OCTOBER, 4), "+380500538221"));
        calls.add(new CallLog(new GregorianCalendar(2019, Calendar.OCTOBER, 4), "+380500538221"));
        calls.add(new CallLog(new GregorianCalendar(2019, Calendar.OCTOBER, 4), "+380958335246"));
        calls.add(new CallLog(new GregorianCalendar(2019, Calendar.OCTOBER, 4), "+380995223263"));
        calls.add(new CallLog(new GregorianCalendar(2019, Calendar.OCTOBER, 4), "+380995223263"));
        calls.add(new CallLog(new GregorianCalendar(2019, Calendar.OCTOBER, 4), "+380995223263"));
        calls.add(new CallLog(new GregorianCalendar(2019, Calendar.OCTOBER, 4), "+380995223263"));
        calls.add(new CallLog(new GregorianCalendar(2019, Calendar.OCTOBER, 3), "+380958335246"));
        calls.add(new CallLog(new GregorianCalendar(2019, Calendar.OCTOBER, 3), "+380958335240"));
        calls.add(new CallLog(new GregorianCalendar(2019, Calendar.OCTOBER, 2), "+380958335246"));
        calls.add(new CallLog(new GregorianCalendar(2019, Calendar.OCTOBER, 2), "+380502851161"));
        calls.add(new CallLog(new GregorianCalendar(2019, Calendar.OCTOBER, 2), "+380502851161"));
        calls.add(new CallLog(new GregorianCalendar(2019, Calendar.OCTOBER, 2), "+380995223262"));
        calls.add(new CallLog(new GregorianCalendar(2019, Calendar.OCTOBER, 2), "+380995223262"));
        calls.add(new CallLog(new GregorianCalendar(2019, Calendar.OCTOBER, 2), "+380502851161"));
        calls.add(new CallLog(new GregorianCalendar(2019, Calendar.OCTOBER, 2), "+380500538221"));
        calls.add(new CallLog(new GregorianCalendar(2019, Calendar.OCTOBER, 1), "+380958335246"));
        calls.add(new CallLog(new GregorianCalendar(2019, Calendar.OCTOBER, 1), "+380500538221"));
        calls.add(new CallLog(new GregorianCalendar(2019, Calendar.OCTOBER, 1), "+380500538221"));

        List<Message> messages = new ArrayList<>();
        messages.add(new Message(new GregorianCalendar(2019, Calendar.OCTOBER, 4), "380500538221", "I got fired"));
        messages.add(new Message(new GregorianCalendar(2019, Calendar.OCTOBER, 4), "380958335246", "please, call me back"));
        messages.add(new Message(new GregorianCalendar(2019, Calendar.OCTOBER, 4), "380958335246", "it's important"));
        messages.add(new Message(new GregorianCalendar(2019, Calendar.OCTOBER, 4), "380958335246", "!!!!!"));
        messages.add(new Message(new GregorianCalendar(2019, Calendar.OCTOBER, 4), "380958408584", "call Mom back"));
        messages.add(new Message(new GregorianCalendar(2019, Calendar.OCTOBER, 4), "380958335246", "don't ignore me!"));
        messages.add(new Message(new GregorianCalendar(2019, Calendar.OCTOBER, 1), "380500538221", "we will go to Paris tomorrow"));
        messages.add(new Message(new GregorianCalendar(2019, Calendar.OCTOBER, 2), "380958335246", "I hope you are alive"));
        messages.add(new Message(new GregorianCalendar(2019, Calendar.OCTOBER, 2), "380958335246", "I hope you are alive221"));
        messages.add(new Message(new GregorianCalendar(2019, Calendar.OCTOBER, 3), "380958335246", "wat's wrong with you?"));

        System.out.println("Found contacts with '221'");
        System.out.println(Phone.findContacts(contacts, "221").toString());

        System.out.println("Found messages with '221'");
        System.out.println(Phone.findMessages(messages, "221").toString());

        System.out.println("Group calls by contacts");
        System.out.println(Phone.groupActionsByContact(contacts, calls));

        System.out.println("Group calls by messages");
        System.out.println(Phone.groupActionsByContact(contacts, messages));

        System.out.println("Get top 5 contacts by calls using stream");
        System.out.println(Phone.getTop5(contacts, calls));

        System.out.println("Get top 5 contacts by messages using stream");
        System.out.println(Phone.getTop5(contacts, messages));

        System.out.println("Get top 3 contacts by calls");
        System.out.println(Phone.getTop3(contacts, calls));

        System.out.println("Get top 3 contacts by messages");
        System.out.println(Phone.getTop3(contacts, messages));
    }
}
