package isp.lab6.exercise3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ActiveSession {
    private String username;
    private Map<Product, Integer> shoppingChart=new HashMap<>();

    public String getUsername() {
        return username;
    }


    public void addToCart(Product product, int quantity) {

        shoppingChart.put(product, quantity);

    }

    public double sumValues() {
        double sum = 0;
        for (Map.Entry<Product, Integer> entry : shoppingChart.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            sum += quantity * product.getPrice();
        }
        return sum;
    }


}
