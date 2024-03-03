package aut.isp.lab4.exercise6;



public class Exercise6 {
    public static void main(String[] args) {
        FishFeeder fishFeeder = new FishFeeder("Germany", "RS-7",14);
        //clase tip Sensor
       LevelSensor sensorLvl = new LevelSensor("Bosch", "Like-A-Bosch", 90);
       TemperatureSensor sensorTemp = new TemperatureSensor("Michelin", "i8-2022", 23);
        //clase tip Actuator
        Heater heater = new Heater();
        Alarm alarm = new Alarm();
        //
        Controller controller=new Controller();
        PHSensor phSensor=new PHSensor("Spania","w92",(float)7.8);


        AquariumController aquariumController = new AquariumController("China","New",(float)3.23,fishFeeder,
                9,(float)10.25,9,25,sensorTemp,sensorLvl,alarm,heater,phSensor,controller);


        System.out.println("\n"+aquariumController.toString());

        System.out.println(aquariumController.checkTemperature());
        System.out.println(aquariumController.checkWaterLevel());
        System.out.println(aquariumController.PHMonitoring());
    }
}
