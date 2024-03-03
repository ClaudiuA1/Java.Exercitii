package isp.lab10.exercise1;

import java.util.ArrayList;
import java.util.List;

public class ATC {
    private List<Aircraft> acList= new ArrayList<>();

    public void addAircraft(String id){
        acList.add(new Aircraft(id));

        System.out.println("Aircraft with id " + id + " added");
    }

    public void sendCommand(String id, AtcCommand command){

        System.out.println("Aircraft with id " + id + " received command " + command);
    }

    public void showAircrafts(){
        for(Aircraft ac: acList){
            System.out.println(ac.toString());
        }
    }
}

class AtcCommand {
    String command;

    public AtcCommand(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "AtcCommand{" +
                "command='" + command + '\'' +
                '}';
    }

}

class TakeOffCommand extends AtcCommand{
    private int altitude;

    public TakeOffCommand(String command) {
        super(command);
    }

}

class LandCommand extends AtcCommand{

    public LandCommand(String command) {
        super(command);
    }
}
