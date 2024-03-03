package isp.lab4.exercise2;
import org.junit.Test;

import static org.junit.Assert.*;
public class exercise2Test {
    @Test
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        SmartPhone smartPhone = new SmartPhone();
        SmartWatch smartWatch = new SmartWatch();

        laptop.charge(-12);
        assertEquals(0,laptop.getBatteryLevel(),0.001);

        smartWatch.charge(6);
        assertEquals(12,smartWatch.getBatteryLevel(),0.01);
    }
}
