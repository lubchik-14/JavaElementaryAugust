package com.hillel.lessons.lesson11;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Shop describes a shop
 */
public class Shop {
    /**
     * Field list of Orders for get and set orders in a shop
     */
    private List<Order> orders;
    /**
     * Field list of Carts for get and set carts in a shop
     */
    private List<Cart> carts;

    public Shop() {
        this.orders = new ArrayList<>();
        this.carts = new ArrayList<>();
    }

    /**
     * Returns true and creates a new cart if a given cart is absent in carts {@link Shop#carts},
     * otherwise returns false and does nothing.
     *
     * @param cart Cart to add
     * @return true if a given cart was created, otherwise false
     */
    public boolean addCart(Cart cart) {
        if (carts.stream().noneMatch(c -> c.getCustomer() == cart.getCustomer())) {
            carts.add(cart);
            return true;
        }
        return false;
    }

    /**
     * Removes a given cart from a list of carts {@link Shop#carts}
     *
     * @param cartToDelete Cart to delete
     */
    public void removeCart(Cart cartToDelete) {
        carts.removeIf(cart -> cart.getCustomer() == cartToDelete.getCustomer());
    }

    /**
     * Creates a new order from a given cart in carts {@link Shop#orders}, otherwise does nothing.
     * If the creating is successful, the cart will be deleted
     *
     * @param cart Cart value to create an order
     */
    public void createOrder(Cart cart) {
        createOrder(cart, null);
    }

    /**
     * Creates a new order from a given cart in carts {@link Shop#carts}, otherwise does nothing.
     * If the creating is successful, the cart will be deleted
     *
     * @param cart Cart value to create an order
     * @param shippingDetails ShippingDetails value to create an order
     */
    public void createOrder(Cart cart, ShippingDetails shippingDetails) {
        if (!cart.getProductsToOrder().isEmpty()) {
            orders.add(new Order(cart, shippingDetails));
            removeCart(cart);
        }
        System.out.println("Product list is empty! Order wasn't created");
    }

    /**
     * Adds a given order to orders in a shop
     *
     * @param order order to add
     */
    public void addOrder(Order order) {
        orders.add(order);
    }

    /**
     * Returns list of exist orders.
     *
     * @return all exist orders
     */
    public List<Order> getOrders() {
        return orders;
    }

    /**
     * Returns list of exist carts.
     *
     * @return all exist carts
     */
    public List<Cart> getCarts() {
        return carts;
    }
}