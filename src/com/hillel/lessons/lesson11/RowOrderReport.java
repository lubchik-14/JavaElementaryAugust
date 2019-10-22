package com.hillel.lessons.lesson11;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Comparator;

/**
 * The RowOrderReportDescribes class describes one row in a general order.
 * An object of type RowOrderReport contains fields needed for building the general report.
 */
public class RowOrderReport {
    /**
     * Field number for get and set indicating id of an order .
     */
    private final Integer orderId;
    /**
     * Field date for get and set indicating date of an order.
     */
    private final LocalDate orderDate;
    /**
     * Field enum of order statuses for get and set indicating status of an order.
     */
    private final OrderStatus orderStatus;
    /**
     * Field Product for get and set indicating first product in an order.
     */
    private final Product firstProduct;
    /**
     * Field number for get and set indicating amount of products of an order.
     */
    private final Integer productNumber;
    /**
     * Field Customer for get and set indicating customer name of an order.
     */
    private final Customer customer;
    /**
     * Field number for get and set indicating sum of order.
     */
    private final BigDecimal orderSum;
    /**
     * Field Shipping Details for get and set indicating details of shipping of an order.
     */
    private final ShippingDetails shippingDetails;

    /**
     * Constructs a new order report row.
     */
    public RowOrderReport(Integer orderId, LocalDate orderDate, OrderStatus orderStatus, Product firstProduct,
                          Integer productNumber, Customer customer, BigDecimal orderSum, ShippingDetails shippingDetails) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.firstProduct = firstProduct;
        this.productNumber = productNumber;
        this.customer = customer;
        this.orderSum = orderSum;
        this.shippingDetails = shippingDetails;
    }

    /**
     * Return a comparator that compares RowOrderReport objects by customer name
     * @return a comparator that compares by customer name
     */
    public static Comparator<RowOrderReport> compareByCustomerName() {
        return Comparator.comparing(row -> row.getCustomer().getName());
    }
    /**
     * Return a comparator that compares RowOrderReport objects by OrderStatus
     * @return a comparator that compares by OrderStatus
     */
    public static Comparator<RowOrderReport> compareByOrderStatus() {
        return Comparator.comparing(RowOrderReport::getOrderStatus);
    }
    /**
     * Return a comparator that compares RowOrderReport objects by order date
     * @return a comparator that compares by order date
     */
    public static Comparator<RowOrderReport> compareByOrderDate() {
        return (row1, row2) -> row2.getOrderDate().compareTo(row1.getOrderDate());
    }

    public Integer getOrderId() {
        return orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public Product getFirstProduct() {
        return firstProduct;
    }

    public Integer getProductNumber() {
        return productNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public BigDecimal getOrderSum() {
        return orderSum;
    }

    public ShippingDetails getShippingDetails() {
        return shippingDetails;
    }

    @Override
    public String toString() {
        return "RowOrderReport{" +
                "orderId=" + orderId +
                ", orderDate=" + orderDate +
                ", orderStatus=" + orderStatus +
                ", firstProduct=" + firstProduct +
                ", productNumber=" + productNumber +
                ", customer=" + customer +
                ", orderSum=" + orderSum +
                ", shippingDetails=" + shippingDetails +
                '}';
    }
}
