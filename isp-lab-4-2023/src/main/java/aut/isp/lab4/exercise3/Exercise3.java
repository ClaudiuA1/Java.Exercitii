package aut.isp.lab4.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        FishFeeder pes=new FishFeeder("Pastrav","Munte",14);

        AquariumController peste=new AquariumController("Crap","Lac",(float)2.38,pes,15);

        System.out.println(peste.toString());
        peste.setCurrenTime(15);
        System.out.println(pes.feed());

    }
}
