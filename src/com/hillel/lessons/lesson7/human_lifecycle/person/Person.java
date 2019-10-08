package com.hillel.lessons.lesson7.human_lifecycle.person;

import com.hillel.lessons.lesson7.human_lifecycle.factory.Factory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {
    /**
     * The name of a person
     */
    private String name;
    /**
     * The tolerant gender of a person
     */
    private String gender;
    /**
     * The birthday of a person
     */
    private LocalDate birthday;
    /**
     * The spouse of a person
     */
    private Person spouse;
    /**
     * The list of children of a person
     */
    private List<Person> children;
    /**
     * The list of grandchildren of a person
     */
    private List<Person> grandChildren;

    /**
     * The private constructor of the class that creates an instance of the class.
     *
     * @param birthday The birthday of a person
     * @param gender The tolerant gender of a person
     * @param name The tolerant gender of a person
     */
    private Person(LocalDate birthday, String gender, String name) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        children = new ArrayList<>();
        grandChildren = new ArrayList<>();
    }

    /**
     * @return A Person with randomly parameters
     */
    public static Person of() {
        LocalDate birthday = Factory.getDate();
        Factory.Gender gender = Factory.getGender();
        String name = Factory.getName(gender);
        return new Person(birthday, gender.toString(), name);
    }

    /**
     * @param birthday The birthday of human
     * @return A Person with randomly parameters expect birthday
     */
    public static Person of(LocalDate birthday) {
        Factory.Gender gender = Factory.getGender();
        String name = Factory.getName(gender);
        return new Person(birthday, gender.toString(), name);
    }

    /**
     * Sets the given not-null name to a name-value
     * @param name The not-null name of a human
     */
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    /**
     * Sets the given not-null gender to a gender-value
     * @param gender The not-null gender of a human
     */
    public void setGender(String gender) {
        if (gender != null) {
            this.gender = gender;
        }
    }

    /**
     * Changes the present birthday-value with the given not-null birthday.
     * @param birthday The new not-null birthday of a human
     */
    public void changeBirthday(LocalDate birthday) {
        if (birthday != null) {
            this.birthday = birthday;
        }
    }

    /**
     * Sets the given not-null spouse to a spouse-value
     * @param spouse The not-null spouse of a human
     */
    public void setSpouse(Person spouse) {
        if (spouse != null) {
            this.spouse = spouse;
        }
    }

    /**
     * Adds the given not-null child to a list of children
     * @param child The not-null child of a human
     */
    public void addChildren(Person child) {
        if (child != null) {
            this.children.add(child);
        }
    }

    /**
     * Adds the given not-null grandchild to a list of grandchildren
     * @param grandChild The not-null grandchild of a human
     */
    public void addGrandChild(Person grandChild) {
        if (grandChild != null) {
            this.grandChildren.add(grandChild);
        }
    }

    /**
     * @return The name of a human
     */
    public String getName() {
        return name;
    }

    /**
     * @return The gender of a human
     */
    public String getGender() {
        return gender;
    }

    /**
     * @return The LocalDate of birthday of a human.
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     * If spouse is present, returns the spouse, otherwise returns null.
     * @return Spouse of a human
     */
    public Person getSpouse() {
        return spouse;
    }

    /**
     * If children are present, returns the list of children of a human, otherwise returns null.
     * @return List of children of a human
     */
    public List<Person> getChildren() {
        return children;
    }

    /**
     * If grandchildren are present, returns the list of grandchildren of a human, otherwise returns null.
     * @return List of grandchildren of a human
     */
    public List<Person> getGrandChildren() {
        return grandChildren;
    }
}

