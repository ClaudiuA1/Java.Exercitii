package aut.isp.lab4.exercise3;
import org.junit.Test;

import static org.junit.Assert.*;
public class test_ex3 {
    @Test
    public static void main(String[] args) {
        FishFeeder pes=new FishFeeder("Pastrav","Munte",-16);

        AquariumController peste=new AquariumController("Crap","Lac",(float)2.38,pes,15);

        assertEquals("AquariumController{manufacturer='Crap', model='Lac', currenTime=2.38, " +
                "feeder=FishFeeder{manufacturer='Pastrav', model='Munte', meals=-16}, feedingTime=15.0}",peste.toString());
        assertEquals("Nu este destuola mancare!!",pes.feed());




    }

}
