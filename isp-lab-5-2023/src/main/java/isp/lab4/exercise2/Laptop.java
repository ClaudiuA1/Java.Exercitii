package isp.lab4.exercise2;

public class Laptop implements Chargeable {

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

            batteryLevel += 1; //telefonu se incarca cu 1% pe minut
        }


        System.out.println("Laptopul este incarcat " + batteryLevel + "%");
    }

}
