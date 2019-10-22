package com.hillel.lessons.lesson11.services;

import com.hillel.lessons.lesson11.OrderStatus;

import java.math.BigDecimal;

/**
 * Class OrderPrinter prints orders for special manner
 */
public class OrderPrinter {
    /**
     * Field OrderMaker for get orders data
     */
    private OrderMaker maker;

    public OrderPrinter(OrderMaker maker) {
        this.maker = maker;
    }

    /**
     * Prints to console orders with given OrderStatus-value
     *
     * @param orderStatus Order status for filtering
     */
    public void printOrdersByOrderStatus(OrderStatus orderStatus) {
        System.out.println("Orders with status " + orderStatus.toString());
        System.out.printf("%-10s | %-30s | %-30s | %s\n", "Order id#", "Customer", "Delivery Method", "Address");
        maker.getOrdersByOrderStatus(orderStatus)
                .forEach(order -> System.out.printf("%-10s | %-30s | %-30s | %s\n",
                        order.getId(),
                        order.getCustomer().getName(),
                        order.getShippingDetails() != null ? order.getShippingDetails().getDeliveryMethod() : "",
                        order.getShippingDetails() != null ? order.getShippingDetails().getAddress() : ""
                ));
    }

    /**
     * Prints to console information about customers and their orders, sums
     */
    public void printCustomersAndOrders() {
        System.out.println("Information about customer orders");
        System.out.printf("%-30s | %-30s | %-15s | %-15s | %-15s\n",
                "Customer", "E-mail", "Number of", "Total", "Total");
        System.out.printf("%-30s | %-30s | %-15s | %-15s | %-15s\n",
                "", "", "orders", "order sum", "shipping sum");

        maker.getCustomersAndOrders().forEach((customer, orders1) -> {
            System.out.printf(
                    "%-30s | %-30s | %-15s | %-15s | %-15s\n",
                    customer.getName(),
                    customer.getEmail(),
                    orders1.size(),
                    maker.getOrdersSum(orders1),
                    maker.getShippingSum(orders1));
        });
    }

    /**
     * Prints to console sorted ordered products with number of orders, sums
     */
    public void printProductsAndOrders() {
        System.out.println("Information about ordered products");
        System.out.printf("%-10s | %-60s | %-20s | %-20s | %-20s\n",
                "Product id", "Product", "Number of orders", "Product price", "Sum");
        maker.getOrderedProductsAmount().forEach((product, amount) -> System.out.printf("%-10s | %-60s | %-20s | %-20s | %-20s\n",
                product.getId(), product.getName(), amount, product.getPrice(),
                product.getPrice().multiply(BigDecimal.valueOf(amount))));
    }

    /**
     * Prints to console general order report with special sorting
     */
    public void printOrderReport() {
        System.out.println("General order report");
        System.out.printf("|%-7s | %-11s | %-12s | %-60s | %-7s | %-25s | %-7s | %-15s |\n",
                "Id", "Date", "Status", "First product", "Number", "Customer", "Sum", "Details");
        maker.getOrderReport().forEach(row -> System.out.println(String.format(
                "|%-7s | %-11s | %-12s | %-60s | %-7s | %-25s | %-7.2f | %-15s |",
                row.getOrderId(), row.getOrderDate(), row.getOrderStatus(), row.getFirstProduct().getName(),
                row.getProductNumber(), row.getCustomer().getName(), row.getOrderSum(),
                row.getShippingDetails() != null ? row.getShippingDetails().getDeliveryMethod() : "-"
        )));
    }
}
