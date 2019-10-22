package com.hillel.lessons.lesson11;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Class Product describes a product in a shop
 */
public class Product {
    /**
     * Field String for get and set name of product
     */
    private String name;
    /**
     * Field BigDecimal for get and set price of product
     */
    private BigDecimal price;
    /**
     * Field number for set and hold a unique descriptor of a product
     */
    private int id;
    /**
     * Field number for set and hold a unique descriptor for next product
     */
    private static int nextId = 0;

    private Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
        this.id = nextId;
        nextId++;
    }

    /**
     * Returns an instance of Product with given name and price
     *
     * @param name  String value of product name
     * @param price BigDecimal value of product price
     * @return a new instance of product
     */
    public static Product of(String name, BigDecimal price) {
        return new Product(name, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getId() == product.getId() &&
                Objects.equals(getName(), product.getName()) &&
                Objects.equals(getPrice(), product.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getId());
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
