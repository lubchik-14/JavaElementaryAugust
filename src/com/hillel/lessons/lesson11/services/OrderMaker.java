package com.hillel.lessons.lesson11.services;

import com.hillel.lessons.lesson11.*;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * The OrderMaker makes some orders according to data of Shop field.
 */
public class OrderMaker {
    private Shop shop;

    public OrderMaker(Shop shop) {
        this.shop = shop;
    }

    /**
     * Groups to a Map all of customers and all of their orders.
     *
     * @return a Map containing Customer-keys and List of Orders-values belong the keys
     */
    public Map<Customer, List<Order>> getCustomersAndOrders() {
        return shop.getOrders().stream().collect(Collectors.groupingBy(Order::getCustomer));
    }

    /**
     * Returns List of Orders with the given OrderStatus {@link OrderStatus}.
     *
     * @param orderStatus the OrderStatus by which exist orders are filtered
     * @return List of Orders that consist the given OrderStatus
     */
    public List<Order> getOrdersByOrderStatus(OrderStatus orderStatus) {
        return shop.getOrders().stream()
                .filter(order -> order.getOrderStatus().equals(orderStatus))
                .collect(Collectors.toList());
    }

    /**
     * Returns a specified sorted List of RowOrderReport {@link RowOrderReport}.
     *
     * @return a specified sorted List of RowOrderReport
     */
    public List<RowOrderReport> getOrderReport() {
        return shop.getOrders().stream()
                .map(order -> new RowOrderReport(order.getId(),
                        order.getDate(), order.getOrderStatus(), order.getProducts().keySet().iterator().next(),
                        order.getProductNumber(), order.getCustomer(), order.getSum(), order.getShippingDetails()))
                .sorted(RowOrderReport.compareByOrderDate()
                        .thenComparing(RowOrderReport.compareByOrderStatus())
                        .thenComparing(RowOrderReport.compareByCustomerName()))
                .collect(Collectors.toList());
    }

    /**
     * Returns a descending sorted Map that contains Product-keys and total amount of the product from all of orders.
     *
     * @return a sorted Map of products and ordered amount of these products
     */
    public Map<Product, Integer> getOrderedProductsAmount() {
        return shop.getOrders().stream()
                .flatMap(order -> order.getProducts().entrySet().stream())
                .collect(Collectors.collectingAndThen(
                        Collectors.groupingBy(Map.Entry::getKey, Collectors.summingInt(Map.Entry::getValue)),
                        productIntegerMap -> productIntegerMap.entrySet().stream()
                                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                        (integer, integer2) -> integer, LinkedHashMap::new))));
    }

    /**
     * Returns a total sum of given Orders
     *
     * @param orderList Orders to sum their sums
     * @return a total sum of given Orders
     */
    public BigDecimal getOrdersSum(List<Order> orderList) {
        return orderList.stream()
                .map(Order::getSum)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    /**
     * Returns a total shipping sum of given Orders
     *
     * @param orderList Orders to sum their shipping sums
     * @return a total shipping sum of given Orders
     */
    public BigDecimal getShippingSum(List<Order> orderList) {
        return orderList.stream()
                .filter(o -> o.getShippingDetails() != null)
                .map(o -> o.getShippingDetails().getPrice())
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
