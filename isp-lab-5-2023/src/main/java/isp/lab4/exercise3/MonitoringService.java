package isp.lab4.exercise3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MonitoringService {
    private ArrayList<Sensor> sensors;

    public MonitoringService() {
    }

    public MonitoringService(ArrayList<Sensor> sensors) {
        this.sensors = sensors;
    }

    public double getAvarageTemperatureSensor() {

        double sum = 0;
        int count = 0;

        for (int i = 0; i < sensors.size(); i++) {
            if (sensors.get(i) instanceof TemperatureSensor) {
                TemperatureSensor temperatureSensor = (TemperatureSensor) sensors.get(i);
                sum = sum + temperatureSensor.geValue();
                count++;

            }
        }
        if (sum > 0) {
            return sum / count;
        } else {
            return 0;
        }

    }

    public double getAvarageAllSensors() {
        double sum = 0;

        for (int i = 0; i < sensors.size(); i++) {
            if (sensors.get(i) instanceof TemperatureSensor) {
                TemperatureSensor temperatureSensor = (TemperatureSensor) sensors.get(i);
                sum = sum + temperatureSensor.geValue();
            } else if (sensors.get(i) instanceof PressureSensor) {
                PressureSensor pressureSensor = (PressureSensor) sensors.get(i);
                sum += pressureSensor.geValue();
            }
        }
        if (sum > 0) {
            return sum / sensors.size();
        } else {
            return 0;
        }
    }
}
