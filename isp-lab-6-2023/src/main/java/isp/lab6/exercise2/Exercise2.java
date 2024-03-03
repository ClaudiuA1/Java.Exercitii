package isp.lab6.exercise2;

import java.util.*;

public class Exercise2 {


    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("456", "AB 07 28", "Volswagen", "Passat", 2009);

        Set<Vehicle> vehiclesSet = new HashSet<>();
        vehiclesSet.add(vehicle1);

        VehicleRegistry vehicleList = new VehicleRegistry(vehiclesSet);
        vehicleList.addVehicle(vehiclesSet, new Vehicle("123", "AC9278", "BMW", "M5", 2001));

        // vehicleList.removeVehicle("123");

        System.out.println(vehicleList.vinCheck("123"));
        ;

        System.out.println(vehicleList.toString());
        ;


    }
}
