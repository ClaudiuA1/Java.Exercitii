package isp.lab10.exercise1;

public class Aircraft implements Runnable {
    private String id;
    private int altitude;

    public Aircraft(String id) {
        this.id = id;
        this.altitude=0;
    }

    public void receiveAtcMessage(AtcCommand msg){

    }

    @Override
    public void run() {

    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "id='" + id + '\'' +
                ", altitude=" + altitude +
                '}';
    }
}
