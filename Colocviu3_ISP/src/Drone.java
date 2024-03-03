public abstract class Drone {
    private String model;
    private double maximumFlightRange ;
    public Drone(String model, double maximumFlightRange){
        this.model=model;
        this.maximumFlightRange=maximumFlightRange;
    }


    abstract void  displayInfo();



}