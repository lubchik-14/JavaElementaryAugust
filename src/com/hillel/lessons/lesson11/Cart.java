package com.hillel.lessons.lesson11;

import java.util.HashMap;
import java.util.Map;

/**
 * Class Cart describes a shopping cart to manage order products
 */
public class Cart {
    /**
     * Field Map for get and set chosen products to order
     */
    private Map<Product, Integer> productsToOrder;
    /**
     * Field Customer for get a customer for this cart
     */
    private Customer customer;
    /**
     * Field number for set and hold a unique descriptor of a cart
     */
    private int id;
    /**
     * Field number for set and hold a unique descriptor for next cart
     */
    private static int nextId = 0;

    public Cart(Customer customer) {
        this.customer = customer;
        this.productsToOrder = new HashMap<>();
        this.id = nextId;
        nextId++;
    }

    /**
     * Adds amount of product to the cart. If given product is absent in the cart the product will be added.
     *
     * @param product Product to add
     * @param amount amount of the product to add
     */
    public void addProduct(Product product, int amount) {
        productsToOrder.merge(product, amount, (v, v2) -> v + v2);
    }

    /**
     * Removes the mapping for a key from this map if it is present.
     *
     * @param product key whose mapping is to be removed from the map
     * @return the previous value associated with key, or null if there was no mapping for key.
     */
    public int removeProduct(Product product) {
        return productsToOrder.remove(product);
    }

    /**
     * Returns Map products and amount of products that are chosen to order
     *
     * @return products to order
     */
    public Map<Product, Integer> getProductsToOrder() {
        return productsToOrder;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "productsToOrder=" + productsToOrder +
                ", customer=" + customer +
                ", id=" + id +
                '}';
    }
}