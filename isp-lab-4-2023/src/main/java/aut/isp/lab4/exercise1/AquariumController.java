package aut.isp.lab4.exercise1;

public class AquariumController {

    private String manufacturer;
    private String model;
    private float currenTime;

    public AquariumController(String manuafcturer, String model, float currenTime) {
        this.manufacturer = manuafcturer;
        this.model = model;
        this.currenTime = currenTime;
    }

    public void setCurrenTime(int currenTime) {
        this.currenTime = currenTime;
    }

    public float getCurrenTime() {
        return currenTime;
    }

    @Override
    public String toString() {
        return "Model: "+model+"\nManufacturer: "+manufacturer+"\nData curenta: "+currenTime;
    }
}
