package com.hillel.lessons.lesson4.room;

import com.hillel.lessons.lesson4.room.people.person.Person;
import com.hillel.lessons.lesson4.room.people.gender.Gender;

public class AbstractClasses {
    public static void main(String[] args) {
        Person person = new Person("Lida", 18, 45, Gender.FEMALE);
        Person person1 = new Person("Luda", 18, 45, Gender.FEMALE);
        Person person2 = person1;

        Person person3 = new Person("Sergey", 25, 65, Gender.MALE);

        System.out.println(person);
        System.out.println(person3);
        System.out.println(person.equals(person1));
        System.out.println(person.equals(person2));
        System.out.println(person.equals(person3));
        System.out.println(person2.equals(person3));
        System.out.println(person + " : " + person.hashCode());
        System.out.println(person1 + " : " + person1.hashCode());
        System.out.println(person2 + " : " + person2.hashCode());
        System.out.println(person3 + " : " + person3.hashCode());
    }
}