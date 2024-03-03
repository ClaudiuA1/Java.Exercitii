package isp.lab4.exercise3;

public abstract class Sensor {

    private String installLocation;
    private String name;
    private TemperatureSensor temperatureSensor;
    private PressureSensor pressureSensor;


    public Sensor(String installLocation, String name) {
        this.installLocation = installLocation;
        this.name = name;
    }

    public abstract double geValue();

}
