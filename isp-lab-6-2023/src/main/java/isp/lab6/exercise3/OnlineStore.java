package isp.lab6.exercise3;

import java.util.*;


public class OnlineStore {

    private List<Product> products;
    private Map<String, ActiveSession> sessions;

    public OnlineStore(List<Product> products, Map<String, ActiveSession> sessions) {
        this.products = products;
        this.sessions = sessions;
    }

    public OnlineStore() {
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Product> getSortedProducts() {

        List<Product> sortedProducts = new ArrayList<>(products);
        Collections.sort(sortedProducts, Comparator.comparing(Product::getName));
        return sortedProducts;

    }

    public static void addSession(String username,OnlineStore onlineStore) {

        ActiveSession activeSession = new ActiveSession();
       onlineStore.sessions.put(username, activeSession);

    }

    public static void removeSession(String username,OnlineStore onlineStore) {
        //OnlineStore onlineStore = new OnlineStore();
        onlineStore.sessions.remove(username);
    }

    public void addToChart(String username, Product product, int quantity) {
        sessions.get(username).addToCart(product, quantity);

    }

    public String checkout(String username) {


        if(sessions.containsKey(username)){
            return "Totalul este:" + sessions.get(username).sumValues();
        }
        else {
            return "Username-ul introdus nu este activ";
        }

    }
    public void printProducts(List<Product> products){
        for (Product product : products) {
            System.out.println(product.getName() + " " + product.getPrice());
        }
    }



}
