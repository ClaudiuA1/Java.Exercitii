package isp.lab6.exercise2;

import java.util.HashMap;
import java.util.Objects;

public class Vehicle {

    private String vin;
    private String licPlate;
    private String make;
    private String model;
    private int year;

    public Vehicle(String vin, String licPlate, String make, String model, int year) {
        this.vin = vin;
        this.licPlate = licPlate;
        this.make = make;
        this.model = model;
        this.year = year;
    }


    public String getLicPlate() {
        return licPlate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getVin() {
        return vin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(vin, vehicle.vin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin);
    }
}
