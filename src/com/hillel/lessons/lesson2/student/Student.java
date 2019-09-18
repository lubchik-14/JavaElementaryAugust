package com.hillel.lessons.lesson2.student;

/**
 * Class Student. Fields <b>id</b>, <b>name</b>, <b>age</b>.
 * @author milkyway
 * @version 1.0
 */
public class Student {
    /** Static field to have next id for new student
     * {@value nextId} initialized 1
     */
    private static int nextId = 1;

    /** Constant field contains id */
    private final int id;

    /** Student's name */
    private String name;

    /** Student's age */
    private int age;


    /**
     * Default constructor to create new object.
     * Initializing id and incrementing nextId.
     * @see Student#Student(String, int)
     * {@value nextId} incremented
     */
    public Student() {
        this.id = nextId;
        nextId++;
    }

    /**
     * Default constructor to create new object.
     * @see Student#Student()
     * @param name - student's name
     * @param age - student's age
     */
    public Student(String name, int age){
        this();
        this.name = name;
        this.age = age;
    }

    /**
     * Method for getting value of field {@link Student#name}
     * @return student's name
     */
    public String getName() {
        return name;
    }

    /**
     * Method for setting value of field {@link Student#name}
     * @param name - student's name
     */
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
