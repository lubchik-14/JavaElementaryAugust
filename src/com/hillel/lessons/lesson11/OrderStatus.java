package com.hillel.lessons.lesson11;

/**
 * OrderStatus class describes a status of an order and their descriptions.
 */
public enum OrderStatus {
    PROCESSING("Getting picked and packed"),
    PACKED("Ready to deliver"),
    IN_DELIVERY("Delivery in progress"),
    DELIVERED("Delivered successfully"),
    CANCELED("Canceled with some problems");

    /**
     * Field String for get description of order status
     */
    private String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
