package isp.lab4.exercise3;

import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;

public class exercise3Test {
    @Test
    public static void main(String[] args) {
        Sensor sensor0 = new TemperatureSensor("SectorulA", "Cald", -30);
        Sensor sensor1 = new TemperatureSensor("SectorulB", "Telepfd", -20);
        Sensor sensor2 = new PressureSensor("SectorulC", "1226f", -25);
        Sensor sensor3 = new PressureSensor("SectorulA", "X12", -13);

        ArrayList<Sensor> sensorArrayList = new ArrayList<>();
        sensorArrayList.add(sensor0);
        sensorArrayList.add(sensor1);
        sensorArrayList.add(sensor2);
        sensorArrayList.add(sensor3);
        MonitoringService monitoringService = new MonitoringService(sensorArrayList);

        assertEquals(0,monitoringService.getAvarageTemperatureSensor(),0.0001);
        assertEquals(0,monitoringService.getAvarageTemperatureSensor(),0.01);

    }
}
