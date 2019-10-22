package com.hillel.lessons.lesson11;

import com.hillel.lessons.lesson11.services.Data;
import com.hillel.lessons.lesson11.services.OrderMaker;
import com.hillel.lessons.lesson11.services.OrderPrinter;
import com.hillel.lessons.lesson11.services.Randomizer;

public class ShopMain {
    public static void main(String[] args) {
        Shop shop = new Shop();

        //creating random carts with random products
        for (int i = 0; i < 10; i++) {
            //creating random number of carts
            int cardNumber = Randomizer.randomInteger(1, 30);
            for (int k = 0; k < cardNumber; k++) {

                //choosing a random customer
                Customer customer = Data.customers.get(Randomizer.randomInteger(0, Data.customers.size() - 1));
                Cart newCart = new Cart(customer);

                //adding random number of products and random amount of products
                int productNumber = Randomizer.randomInteger(1, 10);
                for (int j = 0; j < productNumber; j++) {

                    //choosing a random product
                    Product product = Data.products.get(Randomizer.randomInteger(0, Data.products.size() - 1));

                    //defining random amount of product
                    int productAmount = Randomizer.randomInteger(1, 10);
                    newCart.addProduct(product, productAmount);
                }
                shop.addCart(newCart);
            }

            //creating 80% orders from existing carts
            int orderNumber = (int) ((shop.getCarts().size() - 1) * 0.8);
            for (int l = 0; l < orderNumber; l++) {
                //changing Shipping Detail in random orders
                if (Randomizer.randomBoolean()) {
                    DeliveryMethod deliveryMethod = DeliveryMethod
                            .values()[Randomizer.randomInteger(0, DeliveryMethod.values().length - 1)];
                    String address = (deliveryMethod == DeliveryMethod.SELF_DELIVERY)
                            ? "SELF DELIVERY"
                            : (Data.cities.get(Randomizer.randomInteger(0, Data.cities.size() - 1)) + " №" + Randomizer.randomInteger(1, 15));
                    shop.createOrder(shop.getCarts().get(Randomizer.randomInteger(0, shop.getCarts().size() - 1)), new ShippingDetails(deliveryMethod, address));

                } else {
                    shop.createOrder(shop.getCarts().get(Randomizer.randomInteger(0, shop.getCarts().size() - 1)));
                }
            }
        }

        //changing order status in random orders
        shop.getOrders().forEach(order -> {
            if (Randomizer.randomBoolean() && order.getShippingDetails() != null) {
                int presentPosition = order.getOrderStatus().ordinal();
                int maxPosition = OrderStatus.values().length - 1;
                int newPosition = presentPosition + Randomizer.randomInteger(1, maxPosition - presentPosition);
                order.setOrderStatus(OrderStatus.values()[newPosition]);
            }
        });

        OrderMaker maker = new OrderMaker(shop);
        OrderPrinter printer = new OrderPrinter(maker);

        System.out.println("-------------------------------------------------------------------");
        printer.printCustomersAndOrders();

        System.out.println("-------------------------------------------------------------------");
        printer.printOrdersByOrderStatus(OrderStatus.PACKED);

        System.out.println("-------------------------------------------------------------------");
        printer.printProductsAndOrders();

        System.out.println("-------------------------------------------------------------------");
        printer.printOrderReport();
    }
}
