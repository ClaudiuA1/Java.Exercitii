package aut.isp.lab4.exercise4;

public class AquariumController {

    private String manufacturer;
    private String model;
    private float currenTime;
    private FishFeeder feeder;
    private float feedingTime;
    private float LightOnTime;
    private float LightOffTime;


    public AquariumController(String manuafcturer, String model, float currenTime, FishFeeder feeder, float feedingTime, float LightOffTime, float LightOnTime) {
        this.manufacturer = manuafcturer;
        this.model = model;
        this.currenTime = currenTime;
        this.feeder = feeder;
        this.feedingTime = feedingTime;
        this.LightOffTime = LightOffTime;
        this.LightOnTime = LightOnTime;
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


    @Override
    public String toString() {
        return "AquariumController{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", currenTime=" + currenTime +
                ", feeder=" + feeder +
                ", feedingTime=" + feedingTime +
                '}';
    }

    public void setFeedingTime(float feedingTime) {
        this.feedingTime = feedingTime;
    }

    public float getFeedingTime() {
        return feedingTime;
    }

    public static void main(String[] args) {

    }
}
