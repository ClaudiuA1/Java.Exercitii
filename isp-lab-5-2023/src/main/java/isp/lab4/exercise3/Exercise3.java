package isp.lab4.exercise3;

import java.util.ArrayList;

public class Exercise3 {

    public static void main(String[] args) {

        Sensor sensor0 = new TemperatureSensor("SectorulA", "Cald", 30);
        Sensor sensor1 = new TemperatureSensor("SectorulB", "Telepfd", 20);
        Sensor sensor2 = new PressureSensor("SectorulC", "1226f", 25);
        Sensor sensor3 = new PressureSensor("SectorulA", "X12", 13);

        ArrayList<Sensor> sensorArrayList = new ArrayList<>();
        sensorArrayList.add(sensor0);
        sensorArrayList.add(sensor1);
        sensorArrayList.add(sensor2);
        sensorArrayList.add(sensor3);

        MonitoringService monitoringService = new MonitoringService(sensorArrayList);

        System.out.println(monitoringService.getAvarageTemperatureSensor());
        System.out.println(monitoringService.getAvarageAllSensors());

    }
}
