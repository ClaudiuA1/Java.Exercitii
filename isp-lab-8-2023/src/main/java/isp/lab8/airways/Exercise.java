package isp.lab8.airways;

import com.fasterxml.jackson.databind.ObjectMapper;
import examples.files.FilesAndFoldersUtil;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) throws Exception {

        Waypoint waypoint1 = new Waypoint(1, "Cluj-Napoca International Airport", 46.7852, 23.6862, 415);
        FileUtils fileUtils = new FileUtils();
        RoutesManager routesManager = new RoutesManager();

        int n=0;
        Scanner scanner=new Scanner(System.in);
        while (n<=5&&n>=0){
            System.out.println("Introduceti 0 pentru a inchde programul!\n" +
                    "Introduceti 1 pentru a adauga a rutya noua!\n" +
                    "Introduceti 2 pentru a adauga un waypoint nou!\n" +
                    "Introduceti 3 pentru a a afisa rutele!\n" +
                    "Introduceti 4 pentru a calcula distanta dintre toate waypointurile dintr-o ruta!\n" +
                    "Introduceti 5 pentru a sterge o ruta!\n" +
                    "");
            n= scanner.nextInt();
            scanner.nextLine();
            String name;
            String wpName;
            int i;
            double lat;
            double lon;
            int alt;

            switch(n){
                case 0:
                    return;
                case 1:
                    System.out.println("Introdu numele rutei:");
                    name=scanner.nextLine();
                    routesManager.addNewRoute(name);

                    break;
                case 2:
                    System.out.println("introdu numele rutei in care se va introduce waypointu: ");
                    name=scanner.nextLine();
                    System.out.println("Introduceti index: ");
                    i= scanner.nextInt();
                    System.out.println("introduceti numele:");
                    scanner.nextLine();
                    wpName= scanner.nextLine();
                    System.out.println("Introduceti latitudine:");
                    lat= scanner.nextDouble();
                    System.out.println("Introduceti longitudine: ");
                    lon= scanner.nextDouble();
                    System.out.println("Introduceti altitudine:");
                    alt= scanner.nextInt();

                    routesManager.addWaypoint(name,new Waypoint(i,wpName,lat,lon,alt));
                    break;
                case 3:
                    routesManager.displayRoutes();
                    break;
                case 4:
                    System.out.println("Introdu numele rutei:");
                    name=scanner.nextLine();
                    routesManager.routeTotalDistance(name);
                    break;
                case 5:
                    System.out.println("Introdu numele rutei:");
                    name=scanner.nextLine();
                    routesManager.deleteRoute(name);
                    break;

            }
        }



    }
}
