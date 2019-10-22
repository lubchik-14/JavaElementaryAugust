package com.hillel.lessons.lesson11;

import java.math.BigDecimal;

/**
 * DeliveryMethod consists methods of delivery and their costs.
 */
public enum DeliveryMethod {
    NOVAPOSHTA(new BigDecimal("40")),
    UKRPOSHTA(new BigDecimal("25")),
    SELF_DELIVERY(new BigDecimal("0"));

    /**
     Field BigDecimal for get price of delivery method
     */
    private BigDecimal price;

    DeliveryMethod(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }
}