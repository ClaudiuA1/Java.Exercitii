package aut.isp.lab4.exercise6;



public class Alarm extends Actuator {

    @Override
    public String turnOn() {
        super.turnOn();
        return "Alarma a fost  pornita";
    }

    @Override
    public String turnOff() {
        super.turnOff();
        return "Alarma a fost oprita";
    }
}
