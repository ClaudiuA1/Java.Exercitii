package aut.isp.lab4.exercise6;

public class Controller extends Actuator{
    @Override
    public String turnOn() {
        super.turnOn();
        return "Controlul de PH a fost pornit";
    }

    @Override
    public String  turnOff() {
        super.turnOff();
        return "Controlul de PH a fost oprit";
    }
}
