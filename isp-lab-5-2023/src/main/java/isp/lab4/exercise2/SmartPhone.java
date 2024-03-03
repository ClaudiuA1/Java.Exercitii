package isp.lab4.exercise2;

public class SmartPhone implements Chargeable {
    private int batteryLevel;

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void charge(int durationInMinutes) {
        for (int i = 0; i < durationInMinutes; i++) {
            if (batteryLevel >= 100) {
                batteryLevel = 100;
                break;
            }

            batteryLevel += 1.5; //telefonu se incarca cu 1.5% pe minut
        }
        System.out.println("Telefonul este incarcat " + batteryLevel + "%");
    }
}
