package aut.isp.lab4.exercise6;

public abstract class Sensor {

    private String manufacturer;
    private String model;

    public Sensor(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public abstract int getTemp();
    public abstract float getLvl();
    public abstract float getPH();

    @Override
    public String toString() {
        return "Sensor{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
