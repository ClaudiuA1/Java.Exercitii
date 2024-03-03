package isp.lab6.exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class VehicleTest {
    @Test
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("456", "AB 07 28", "Volswagen", "Passat", 2009);

        Set<Vehicle> vehiclesSet = new HashSet<>();
        vehiclesSet.add(vehicle1);

        VehicleRegistry vehicleList = new VehicleRegistry(vehiclesSet);
        vehicleList.addVehicle(vehiclesSet, new Vehicle("123", "AC9278", "BMW", "M5", 2001));

        assertEquals(2, vehicleList.getSize());


        assertEquals("Vehiculul este in registru!", vehicleList.vinCheck("123"));

        vehicleList.removeVehicle("123");
        vehicleList.removeVehicle("456");
        vehicleList.removeVehicle("123");
        assertEquals(0, vehicleList.getSize());
        System.out.println(vehicleList.toString());
    }
}
