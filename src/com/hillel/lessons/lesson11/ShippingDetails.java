package com.hillel.lessons.lesson11;

import java.math.BigDecimal;

/**
 * ShippingDetails class describes details of shipping
 */
public class ShippingDetails {

    private BigDecimal price;
    private DeliveryMethod deliveryMethod;
    private String address;

    public ShippingDetails(DeliveryMethod deliveryMethod, String address) {
        this.price = deliveryMethod.getPrice();
        this.deliveryMethod = deliveryMethod;
        this.address = address;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public DeliveryMethod getDeliveryMethod() {
        return deliveryMethod;
    }

    public String getAddress() {
        return address;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ShippingDetails{" +
                "deliveryMethod=" + deliveryMethod.toString() +
                ", price=" + price.toString() +
                ", address='" + address + '\'' +
                '}';
    }
}
