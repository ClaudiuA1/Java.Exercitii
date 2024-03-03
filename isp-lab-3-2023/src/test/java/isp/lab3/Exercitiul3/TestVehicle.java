package isp.lab3.Exercitiul3;

import static org.junit.Assert.*;
import isp.lab3.exercise3.Vehicle;
import org.junit.Test;

public class TestVehicle {


    @Test
    static public void main(String[] args) {
        Vehicle vehicul1 = new Vehicle("BMW", "M5", 250, 'B');

        assertEquals("BMW (M5) speed 250 fueltype B", vehicul1.toString());
    }
}
