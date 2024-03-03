package aut.isp.lab4.exercise6;

public class FishFeeder {

    private String manufacturer;
    private String model;
    private int meals;

    public FishFeeder(String manufacturer, String model, int meals) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.meals = meals;
    }

    public String  feed() {

        if (meals > 0) {
            meals--;
            return "PEstii au fost hraniti!!";
        } else {
            return "Nu este destuola mancare!!";
        }

    }

    public String fillUp() {
        meals = 14;
        return "Feederul a fost restocat!!";
    }

    @Override
    public String toString() {
        return "FishFeeder{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", meals=" + meals +
                '}';
    }



    public static void main(String[] args) {

    }
}

