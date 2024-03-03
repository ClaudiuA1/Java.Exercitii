package isp.lab6.exercise2;

import java.util.Set;

public class VehicleRegistry {
    private Set<Vehicle> vehicleList;

    public VehicleRegistry(Set<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public void addVehicle(Set<Vehicle> vehicleList, Vehicle vehicle) {

        if (!vehicle.equals(vehicleList)) {
            vehicleList.add(vehicle);
        }

    }

    public void removeVehicle(String vin) {

        Vehicle vehicleRemove = null;
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getVin().equals(vin)) {
                vehicleRemove = vehicle;
                break;
            }
        }
        if (vehicleRemove != null) {
            vehicleList.remove(vehicleRemove);
        }
    }

    public String vinCheck(String vin) {

        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getVin().equals(vin)) {
                return "Vehiculul este in registru!";
            }
        }
        return "Vehiculul nu este in registru!";
    }

    @Override
    public String toString() {
        return "VehicleRegistry{" +
                "vehicleList=" + vehicleList +
                '}';
    }

    public int getSize(){
        return vehicleList.size();
    }
}
