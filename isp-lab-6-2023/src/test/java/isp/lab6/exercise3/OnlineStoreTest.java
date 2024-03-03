package isp.lab6.exercise3;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineStoreTest {
    @Test
    public static void main(String[] args) {

        Map<String, ActiveSession> sessions=new HashMap<>();
        List<Product> products=new ArrayList<>();
        products.add(0,new Product("Bluza",25.99));
        products.add(1,new Product("Pantaloni",30.99));
        products.add(2,new Product("Motocultor",2500.99));

        OnlineStore onlineStore=new OnlineStore(products,sessions);
        LoginSystem loginSystem=new LoginSystem(onlineStore);
        List<Product> afisare=new ArrayList<>();
        afisare=onlineStore.getProducts();
        onlineStore.printProducts(afisare);
        UserInterface userInterface = new UserInterface(loginSystem,onlineStore);
        userInterface.loadInterface();

        assertEquals(true,loginSystem.login("","12345"));
        assertEquals("Totalul este:56.98",onlineStore.checkout(""));

    }
}
