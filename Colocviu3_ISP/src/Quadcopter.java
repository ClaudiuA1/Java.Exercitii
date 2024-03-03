public class Quadcopter extends Drone{
private String model;
private double maximumFligthRange;
    public Quadcopter(String model, double maximumFlightRange) {
        super(model, maximumFlightRange);
        this.model=model;
        this.maximumFligthRange=maximumFlightRange;
    }


    @Override
    void displayInfo() {
        System.out.println("Model: "+model+"\n"+"Maximum fly range: "+ maximumFligthRange);

    }
}
