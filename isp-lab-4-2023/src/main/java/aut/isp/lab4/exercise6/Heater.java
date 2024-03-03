package aut.isp.lab4.exercise6;



public class Heater extends Actuator {

    @Override
    public String turnOn() {
        super.turnOn();
        return "Heaterul a fost pornit";
    }

    @Override
    public String  turnOff() {
        super.turnOff();
        return "Heaterul a fost oprit";
    }
}
