package isp.lab7.safehome;

import java.util.HashMap;

public class SafeHome {

    public static void main(String[] args) throws Exception {
        ControllerInterface ctrl= new DoorLockController(new HashMap<>());
         ctrl.addTenant("1234","Geore");
         ctrl.addTenant("5678","Mihai");

         ctrl.enterPin("Mihai");
        System.out.println();
    }
}
