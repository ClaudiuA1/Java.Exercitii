package isp.lab4.exercise1;

import java.time.LocalDateTime;

public class Order {
    private String orderId;
    private LocalDateTime date;
    private double totalPrice;
    private Product product;

    public Order(String orderId, LocalDateTime date, double totalPrice, Product product) {
        this.orderId = orderId;
        this.date = date;
        this.totalPrice = totalPrice;
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", date=" + date +
                ", totalPrice=" + totalPrice +
                ", product=" + product +
                '}';
    }
}
