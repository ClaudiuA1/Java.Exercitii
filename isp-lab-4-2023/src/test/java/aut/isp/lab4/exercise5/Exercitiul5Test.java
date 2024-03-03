package aut.isp.lab4.exercise5;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercitiul5Test {

    @Test
    public static void main(String[] args) {
        FishFeeder fishFeeder = new FishFeeder("Germany", "RS-7",14);
        //clase tip Sensor
        LevelSensor sensorLvl = new LevelSensor("Bosch", "Like-A-Bosch", 90);
        TemperatureSensor sensorTemp = new TemperatureSensor("Michelin", "i8-2022", 23);
        //clase tip Actuator
        Heater heater = new Heater();
        Alarm alarm = new Alarm();

        AquariumController aquariumController = new AquariumController("China","New",(float)3.23,fishFeeder,
                9,(float)10.25,9,25,sensorTemp,sensorLvl,alarm,heater);

        assertEquals("Heaterul a fost pornit",aquariumController.checkTemperature());
        sensorLvl.setValue(-647);
        assertEquals("Alarma a fost  pornita",aquariumController.checkWaterLevel());
        sensorTemp.setValue(45);
        assertEquals("Heaterul a fost oprit",aquariumController.checkTemperature());

    }
}
