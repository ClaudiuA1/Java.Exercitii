package isp.lab4.exercise2;

public class Exercise2 {

    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        SmartPhone smartPhone = new SmartPhone();
        SmartWatch smartWatch = new SmartWatch();

        laptop.charge(43);
        smartWatch.charge(10);
        smartPhone.charge(12);
        System.out.println(smartPhone.getBatteryLevel());
    }
}
