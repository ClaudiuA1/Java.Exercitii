package aut.isp.lab4.exercise4;


public class Exercise4 {
    public static void main(String[] args) {

        FishFeeder peste=new FishFeeder("Munte","Som0on",12);
        AquariumController toyota=new AquariumController("Japan","mx5",3,peste,6,10,2);

        System.out.println(toyota.toString());

        //toyota.setFeedingTime((float)7.60);
        System.out.println(toyota.getFeedingTime());

        toyota.setCurrenTime((float)4.5);
        System.out.println(toyota.getCurrenTime());
        System.out.println(toyota.setCurrenTime(6));
        System.out.println(toyota.getCurrenTime());
        System.out.println(toyota.getFeedingTime());


    }
}
