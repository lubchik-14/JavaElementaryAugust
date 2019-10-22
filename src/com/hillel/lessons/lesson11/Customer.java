package com.hillel.lessons.lesson11;

import java.util.Objects;

/**
 * Class Customer describes a customer
 */
public class Customer {
    /**
     * Field String for get and set a customer name
     */
    private String name;
    /**
     * Field String for get and set a customer e-mail
     */
    private String email;
    /**
     * Field number for set and hold a unique descriptor of a customer
     */
    private int id;
    /**
     * Field number for set and hold a unique descriptor for next customer
     */
    private static int nextId = 0;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.id = nextId;
        nextId++;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return getId() == customer.getId() &&
                Objects.equals(getName(), customer.getName()) &&
                Objects.equals(getEmail(), customer.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getEmail(), getId());
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
