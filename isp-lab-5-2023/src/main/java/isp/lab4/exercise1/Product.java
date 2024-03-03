package isp.lab4.exercise1;

public class Product {
    private String productId;
    private String name;
    private double price;
    private ProductCategory productCategory;
    private Customer customer;


    public Product(String productId, String name, double price, ProductCategory productCategory, Customer customer) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.productCategory = productCategory;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", productCategory=" + productCategory +
                ", customer=" + customer +
                '}';
    }
}
