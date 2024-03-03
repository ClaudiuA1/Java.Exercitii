package isp.lab10.raceapp;


import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Timer extends Observable implements Runnable {

    private Long lock;
    private boolean running;

    public Timer() {
        lock = new Long(0);
        running = true;
    }

    public void start() {
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        long k = 0;
        while (running) {
            k++;
            setChanged();
            notifyObservers("" + k);
            if (!running) {
                synchronized (lock) {
                    try {
                        lock.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Timpul e:" + k + " milisecunde");
    }

    public void end() {
        running = false;
    }
}
