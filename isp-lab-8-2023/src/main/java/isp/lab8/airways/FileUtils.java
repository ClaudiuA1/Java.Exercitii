package isp.lab8.airways;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public  void writeWaypoint(Waypoint waypoint, File waypointDir) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        objectMapper.writeValue(new FileWriter(new File(waypointDir, waypoint.getName()+".json")),waypoint);
    }

    public  List<Waypoint> getWaypoints(File routeDir) throws IOException {
        List<Waypoint> waypoints= new ArrayList<>();
        ObjectMapper objectMapper=new ObjectMapper();
        File[] waypointsFiles= routeDir.listFiles();
        for(File wp: waypointsFiles){
            Waypoint waypoint=objectMapper.readValue(wp,Waypoint.class);
            waypoints.add(waypoint);
        }
        return  waypoints;
    }

}
