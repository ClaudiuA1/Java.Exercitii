package aut.isp.lab4.exercise6;


public class AquariumController {

    private String manufacturer;
    private String model;
    private float currenTime;
    private FishFeeder feeder;
    private float feedingTime;
    private float LightOnTime;
    private float LightOffTime;
    private int temperature;
    private Sensor sensorTemp;
    private Sensor sensorLvl;
    private Actuator actuatorAlarm;
    private Actuator actuatorHeater;

    private Sensor PHsens;
    private Actuator PHcontrol;


    public AquariumController(String manuafcturer, String model, float currenTime, FishFeeder feeder, float feedingTime, float LightOffTime, float LightOnTime, int temperature,
                              Sensor sensorTemp, Sensor sensorLvl, Actuator actuatorAlarm, Actuator actuatorHeater, Sensor PHsens, Actuator PHcontrol) {
        this.manufacturer = manuafcturer;
        this.model = model;
        this.currenTime = currenTime;
        this.feeder = feeder;
        this.feedingTime = feedingTime;
        this.LightOffTime = LightOffTime;
        this.LightOnTime = LightOnTime;
        this.temperature = temperature;
        this.actuatorAlarm = actuatorAlarm;
        this.sensorLvl = sensorLvl;
        this.actuatorHeater = actuatorHeater;
        this.sensorTemp = sensorTemp;
        this.PHsens = PHsens;
        this.PHcontrol = PHcontrol;
    }

    public String setCurrenTime(float currenTime) {
        if (currenTime > 0)
            this.currenTime = currenTime;
        else
            this.currenTime = 0;

        if (currenTime == this.feedingTime) {
            System.out.println(feeder.feed());
        }

        if (currenTime >= LightOnTime && currenTime < LightOffTime) {
            return "Luminile sunt aprinse";
        } else {
            return "Luminile sunt stinse";
        }

    }

    public float getCurrenTime() {
        return currenTime;
    }

    public void setFeedingTime(float feedingTime) {
        this.feedingTime = feedingTime;
    }

    public float getFeedingTime() {
        return feedingTime;
    }

    public String checkTemperature() {
        System.out.println("Tempeeratura actuala este:" + temperature);
        temperature = sensorTemp.getTemp();

        if (temperature >= 24 && temperature <= 27) {
            return actuatorHeater.turnOff();
        } else if (temperature > 27) {
            return actuatorHeater.turnOff();
        } else {
            return actuatorHeater.turnOn();
        }
    }

    public String checkWaterLevel() {
        System.out.println("Nivelul apei este:" + sensorLvl.getLvl());

        if ((sensorLvl.getLvl() > 100) || (sensorLvl.getLvl() < 70)) {
            return actuatorAlarm.turnOn();
        } else {
            return actuatorAlarm.turnOff();
        }

    }

    public String PHMonitoring() {
        System.out.println("nivelul ph-ului este:" + PHsens.getPH());
        if (PHsens.getPH()<7.5||PHsens.getPH()>8.5){
            return "Este nevoie de control de PH";
        }else {
            return "Totul este in regula";
        }

    }

    public String PHControl() {
      return PHcontrol.turnOn();
    }

    @Override
    public String toString() {
        return "AquariumController{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", currenTime=" + currenTime +
                ", feeder=" + feeder +
                ", feedingTime=" + feedingTime +
                ", LightOnTime=" + LightOnTime +
                ", LightOffTime=" + LightOffTime +
                ", temperature=" + temperature +
                ", sensorTemp=" + sensorTemp +
                ", sensorLvl=" + sensorLvl +
                ", actuatorAlarm=" + actuatorAlarm +
                ", actuatorHeater=" + actuatorHeater +
                ", PHsens=" + PHsens +
                ", PHcontrol=" + PHcontrol +
                '}';
    }

    public static void main(String[] args) {

    }
}