package isp.lab10.raceapp;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        CarRace carRace=new CarRace();

        JFrame frame = new JFrame("Semaphore");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        SemaphorePanel semaphorePanel = new SemaphorePanel();

        frame.getContentPane().add(semaphorePanel);
        frame.pack();
        frame.setVisible(true);

        SemaphoreThread semaphoreThread = new SemaphoreThread(semaphorePanel);
        semaphoreThread.start();

        JFrame frameCar = new JFrame("Car Race");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CarPanel carPanel = new CarPanel();

        frameCar.getContentPane().add(carPanel);
        frameCar.pack();
        frameCar.setSize(500,300);
        frameCar.setVisible(true);

        Car car1 = new Car("Red car", carPanel);
        Car car2 = new Car("Blue car", carPanel);
        Car car3 = new Car("Green car", carPanel);
        Car car4 = new Car("Yellow car", carPanel);
        PlaySound playSound=new PlaySound();
        semaphoreThread.join();

        playSound.playSound();
        car1.start();
        car2.start();
        car3.start();
        car4.start();
Timer timer=new Timer();
timer.start();
        car1.join();
        car2.join();
        car3.join();
        car4.join();

        playSound.stopSound();
        timer.end();

    }
}
