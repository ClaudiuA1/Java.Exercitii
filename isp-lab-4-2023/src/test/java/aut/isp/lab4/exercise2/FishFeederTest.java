package aut.isp.lab4.exercise2;


import org.junit.Test;

import static org.junit.Assert.*;

public class FishFeederTest {
    @Test
    public static void main(String[] args) {
        FishFeeder fish = new FishFeeder("BMW", "X-EA12", -25);

        assertEquals("FishFeeder{manufacturer='BMW', model='X-EA12', meals=-25}",fish.toString());
        assertEquals("Nu este destuola mancare!!",fish.feed());

    }
}
