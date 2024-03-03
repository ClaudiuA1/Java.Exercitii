package aut.isp.lab4.exercise6;

public class PHSensor extends Sensor {
    private float value;
    public PHSensor(String manufacturer, String model,float value) {
        super(manufacturer, model);
        this.value=value;
    }

    public float getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int getTemp() {
        return 0;
    }

    @Override
    public float getLvl() {
        return 0;
    }

    @Override
    public float getPH() {
        return value;
    }

}

