package isp.lab3.exercise3;

import java.util.Objects;

public class Vehicle {

    private String model;
    private String type;
    private int speed;
    private char fuelType;
    static int nr;

    public Vehicle(String model, String type, int speed, char fuelType) {
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fuelType = fuelType;
        nr++;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setFuelType(char fuelType) {
        this.fuelType = fuelType;
    }

    public String getModel() {
        return this.model;
    }

    public String getType() {
        return this.type;
    }

    public int getSpeed() {
        return this.speed;
    }

    public char getFuelType() {
        return this.fuelType;
    }

    @Override
    public String toString() {
        return model + " (" + type + ")" + " speed " + speed + " fueltype " + fuelType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return speed == vehicle.speed && fuelType == vehicle.fuelType && model.equals(vehicle.model) && type.equals(vehicle.type);
    }


    public static void main(String[] args) {
        Vehicle bemveu = new Vehicle("BMW", "M5", 250, 'B');
        Vehicle golan = new Vehicle("Dacia", "Sandero", 120, 'D'); //new Vehicle("BMW", "M5", 250, 'B')
        System.out.println(bemveu.getFuelType());
        // bemveu.setFuelType('D');
        System.out.println(bemveu.getSpeed());
        System.out.println(bemveu.toString());

        //golan.setType("M5");
        System.out.println(golan.getModel());
        //golan.setModel("BMW");
        // golan.setSpeed(250);
        System.out.println(golan.toString());

        if (bemveu.equals(golan)) {
            System.out.println("Vehiculele sunt la fel");
        } else {
            System.out.println("Vehiculele sunt diferite");
        }

        System.out.println("Numarul de obiecte creeate: " + Vehicle.nr);


    }
}
