package aut.isp.lab4.exercise5;

public abstract class Actuator {

    private String manufacturer;
    private String model;

    public String turnOff() {

        return "Actuatorul a fost oprit";
    }

    public String turnOn() {
        return "Actuatorul este pornit";
    }

    @Override
    public String toString() {
        return "Actuator{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
