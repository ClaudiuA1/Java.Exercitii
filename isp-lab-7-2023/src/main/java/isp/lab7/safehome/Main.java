package isp.lab7.safehome;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {

        ControllerInterface ctrl =new DoorLockController(new HashMap<>());
        ctrl.addTenant("1234","Marcel");
        ctrl.addTenant("345","Costel");
       // ctrl.addTenant("1234","Marcel");
        ctrl.addTenant("1234","");

    }
}
