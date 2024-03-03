package isp.lab4.exercise2;

public class SmartWatch implements Chargeable {
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

            batteryLevel += 2; //smart watchul se incarca cu 2% pe minut
        }


        System.out.println("Smart Watchul este incarcat " + batteryLevel + "%");

    }
}
