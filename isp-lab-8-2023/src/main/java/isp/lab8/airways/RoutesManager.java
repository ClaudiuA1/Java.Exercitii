package isp.lab8.airways;

import com.fasterxml.jackson.databind.ObjectMapper;
import examples.files.FilesAndFoldersUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RoutesManager {
    private String rootName = "routes";

    public void addNewRoute(String name) {

        FilesAndFoldersUtil.createFolder(rootName + "/" + name);

    }

    public void addWaypoint(String routeName, Waypoint waypoint) throws IOException {
        FileUtils fileUtils = new FileUtils();
        File routeFolder = new File(rootName, routeName);
        fileUtils.writeWaypoint(waypoint, routeFolder);

    }

    public void displayRoutes() throws Exception {
        File routeFolder = new File("routes");
        File[] waypointsFiles = routeFolder.listFiles();
        if (waypointsFiles != null) {
            for (File name : waypointsFiles) {
                System.out.println(name.getName());
            }
        } else {
            System.out.println("Nu exista rute");
        }


    }

    public void routeTotalDistance(String Dir) throws IOException {
        FileUtils fileUtils = new FileUtils();
        File routeDir=new File(rootName,Dir);
        List<Waypoint> waypoints = fileUtils.getWaypoints(routeDir);

            for (Waypoint wp : waypoints) {
                System.out.println("index: " + wp.getIndex() + "\nname: " + wp.getName() + "\nlatitudine: " + wp.getLatitude() + "\nLongitudine: " + wp.getLongitude() + "\nAltitudine: " + wp.getAltitude());
            }
            double distance = 0;
            Waypoint waypoint = waypoints.get(0);
            for (Waypoint wp : waypoints) {
                distance += WaypointDistanceCalculator.calculateDistance(waypoint.getLatitude(), waypoint.getLongitude(), wp.getLatitude(), wp.getLongitude());
                waypoint = wp;
            }
            System.out.println("distanta= " + distance);

    }

    public void deleteRoute(String Dir) {

        File routeDir=new File(rootName,Dir);

        if (routeDir.exists()) {
            String[] entries = routeDir.list();
            if (entries != null) {
                for (String entry : entries) {
                    File currentFile = new File(routeDir.getPath(), entry);
                    currentFile.delete();
                }
                routeDir.delete();
            }
        }

        System.out.println("Fisierul a fost sters" + routeDir.getName());

    }
}
