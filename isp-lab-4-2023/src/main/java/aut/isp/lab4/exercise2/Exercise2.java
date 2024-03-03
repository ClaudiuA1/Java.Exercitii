package aut.isp.lab4.exercise2;

public class Exercise2 {

    public static void main(String[] args) {
        FishFeeder fish = new FishFeeder("BMW", "X-EA12", 1);

        System.out.println(fish.toString());
        System.out.println(fish.fillUp());
        System.out.println(fish.feed());


    }
}
