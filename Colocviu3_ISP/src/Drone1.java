import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class Drone1{
    private String model;
    private double maximumFlightRange;
    private String type;

    public Drone1(String model, double maximumFlightRange,String type) {
        this.model = model;
        this.maximumFlightRange = maximumFlightRange;
        this.type=type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMaximumFlightRange() {
        return maximumFlightRange;
    }

    public void setMaximumFlightRange(double maximumFlightRange) {
        this.maximumFlightRange = maximumFlightRange;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
