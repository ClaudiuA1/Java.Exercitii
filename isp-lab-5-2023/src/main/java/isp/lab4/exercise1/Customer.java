package isp.lab4.exercise1;

public class Customer {
    private String curstomerId;
    private String name;
    private String phone;
    private Address address;

    public Customer(String curstomerId, String name, String phone, Address address) {
        this.curstomerId = curstomerId;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }
}
