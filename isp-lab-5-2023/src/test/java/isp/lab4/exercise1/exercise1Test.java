package isp.lab4.exercise1;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class exercise1Test {
    @Test
    public static void main(String[] args) {
        Address address = new Address("Principala", "Alba");
        Customer customer = new Customer("123456", "Alexandru", "07911911", address);
        ProductCategory productCategory = ProductCategory.BEAUTY;
        Product product = new Product("7890", "Canapea", 15, productCategory, customer);
        LocalDateTime dateTime = LocalDateTime.of(2022, 4, 28, 12, 23, 43, 19);
        Order order = new Order("567890", dateTime, 14, product);

        assertEquals("Alexandru", customer.getName());
        assertEquals("Order{orderId='567890', date=2022-04-28T12:23:43.000000019, totalPrice=14.0, product=Product{productId='7890', name='Canapea', price=15.0, productCategory=Machiaje & Ruj, customer=Alexandru}}\n",order.toString());

    }
}
