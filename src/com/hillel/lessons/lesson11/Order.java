package com.hillel.lessons.lesson11;

import com.hillel.lessons.lesson11.services.Randomizer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;
import java.util.Objects;

/**
 * Class Order describes an order in a shop
 */
public class Order {
    /**
     * Field Map of Products and amount of the products for get and set products of an order
     */
    private Map<Product, Integer> products;
    /**
     * Field Customer for get and set a customer of an order
     */
    private Customer customer;
    /**
     * Field ShippingDetails for get and set a a shipping details of an order
     */
    private ShippingDetails shippingDetails;
    /**
     * Field LocalDate for get and set a creating date of an order
     */
    private LocalDate date;
    /**
     * Field OrderStatus for get and set an order status
     */
    private OrderStatus orderStatus;
    /**
     * Field number for set and hold a unique descriptor of a product
     */
    private int id;
    /**
     * Field number for set and hold a unique descriptor for next product
     */
    private static int nextId = 0;

    public Order(Cart cart) {
        this(cart, null);
    }

    public Order(Cart cart, ShippingDetails shippingDetails) {
        this.products = cart.getProductsToOrder();
        this.customer = cart.getCustomer();
        this.date = LocalDate.now().minusDays(Randomizer.randomInteger(0, 10));
        this.orderStatus = OrderStatus.PROCESSING;
        this.shippingDetails = shippingDetails;
        this.id = nextId;
        nextId++;
    }

    /**
     * Returns sum of an order
     *
     * @return sum of an order
     */
    public BigDecimal getSum() {
        return products.entrySet().stream()
                .map(entry -> entry.getKey().getPrice().multiply(BigDecimal.valueOf(entry.getValue())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    /**
     * Returns amount of products of an order
     *
     * @return amount of products of an order
     */
    public Integer getProductNumber() {
        return products.values().stream()
                .mapToInt(value -> value)
                .sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return getId() == order.getId() &&
                Objects.equals(getProducts(), order.getProducts()) &&
                Objects.equals(getCustomer(), order.getCustomer()) &&
                Objects.equals(getShippingDetails(), order.getShippingDetails()) &&
                Objects.equals(getDate(), order.getDate()) &&
                getOrderStatus() == order.getOrderStatus();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProducts(), getCustomer(), getShippingDetails(), getDate(), getOrderStatus(), getId());
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ShippingDetails getShippingDetails() {
        return shippingDetails;
    }

    public void setShippingDetails(ShippingDetails details) {
        this.shippingDetails = details;
    }

    public LocalDate getDate() {
        return date;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", customer=" + customer +
                ", orderStatus=" + orderStatus +
                ", shippingDetails=" + shippingDetails +
                ", products=" + products +
                '}';
    }
}
