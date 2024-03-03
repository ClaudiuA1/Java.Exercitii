package aut.isp.lab4.exercise4;
import org.junit.Test;

import static org.junit.Assert.*;
public class Exercitiu4Test {
@Test
    public static void main(String[] args) {
    FishFeeder peste=new FishFeeder("Munte","Som0on",12);
    AquariumController controler=new AquariumController("Japan","mx5",3,peste,6,10,2);



    assertEquals("Luminile sunt stinse", controler.setCurrenTime(12));
    System.out.println(controler.getFeedingTime());
    assertEquals("Luminile sunt aprinse", controler.setCurrenTime((float)6));
    System.out.println(controler.getCurrenTime());

    }
}
