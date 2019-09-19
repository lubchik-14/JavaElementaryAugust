package com.hillel.lessons.lesson4.room.people.person;

import com.hillel.lessons.lesson4.room.people.gender.Gender;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private int weight;
    private Gender gender;

    public Person(String name, int age, int weight, Gender gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    @Override
    public int hashCode(){
        return Objects.hash(age, weight, gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", weight=" + weight +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;

        if (!(obj instanceof Person)) return false;

        Person person = (Person) obj;
        return  Objects.equals(person.age, this.age) &&
                Objects.equals(person.weight, this.weight) &&
                Objects.equals(person.gender, this.gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
