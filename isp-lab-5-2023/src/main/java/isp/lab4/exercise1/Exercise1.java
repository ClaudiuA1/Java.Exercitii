package isp.lab4.exercise1;

import java.time.LocalDateTime;


public class Exercise1 {

    public static void main(String[] args) {

        Address address = new Address("Principala", "Alba");
        Customer customer = new Customer("123456", "Alexandru", "07911911", address);
        ProductCategory productCategory = ProductCategory.BEAUTY;
        Product product = new Product("7890", "Canapea", 15, productCategory, customer);
        LocalDateTime dateTime = LocalDateTime.of(2022, 4, 28, 12, 23, 43, 19);
        Order order = new Order("567890", dateTime, 14, product);

        System.out.println(order.toString());
        ;

    }
}
