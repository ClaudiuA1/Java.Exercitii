package aut.isp.lab4.exercise1;

import org.junit.Test;
import static org.junit.Assert.*;
public class AquariumControllerTest {
    @Test
    public static void main(String[] args) {
        AquariumController peste2=new AquariumController("God","Pastrav",(float)8.46);
        assertEquals("Model: Pastrav\n" +
                "Manufacturer: God\n" +
                "Data curenta: 8.46",peste2.toString());
        peste2.setCurrenTime(12);
        assertEquals(12,peste2.getCurrenTime(),0.001);
    }
}
