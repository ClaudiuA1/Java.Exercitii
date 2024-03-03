package isp.lab7.safehome;

import java.util.List;
import java.util.Map;

public class DoorLockController implements ControllerInterface {
    private Map<Tenant, AccessKey> validAccess;
    public Door doorStatus=new Door(DoorStatus.CLOSE);
    private int pinTries = 0;


    public DoorLockController(Map<Tenant, AccessKey> validAccess) {
        this.validAccess = validAccess;
    }

    @Override
    public DoorStatus enterPin(String pin) throws Exception {
       // DoorStatus doorStatus1 = DoorStatus.CLOSE;
        AccessKey accessKey = new AccessKey(pin);


        boolean pinFound = false;

        for (Map.Entry<Tenant, AccessKey> entry : validAccess.entrySet()) {
            if (entry.getValue().getPin().equals(pin)) {
                pinFound = true;
                break;
            }
        }

        if (!pinFound) {

            pinTries++;
            if (pinTries >= 3) {
                this.doorStatus.LockDoor();
                throw new TooManyAttemptsException("Too many attempts, get and admin key to unlock");
            }
            throw new InvalidPinException("The pin is wrong");

        } else {
            if (pinTries >= 3) {
                this.doorStatus.LockDoor();
                throw new TooManyAttemptsException("Too many attempts, get and admin key to unlock");
            }
            if(doorStatus.getStatus()==DoorStatus.CLOSE){
                this.doorStatus.UnlockDoor();
            }
            else{
                doorStatus.LockDoor();
            }

            pinTries = 0;
        }

        return doorStatus.getStatus();

    }

    @Override
    public void addTenant(String pin, String name) throws Exception {
        if (name == null || name.trim().isEmpty()) {
            throw new EmptyTenantNameException("Wrong name");
        }
        Tenant tenant = new Tenant(name);
        AccessKey accessKey = new AccessKey(pin);
        if (validAccess.containsKey(tenant)) {
            throw new TenantAlreadyExistsException("Tenant already exists: " + name);
        } else {
            validAccess.put(tenant, accessKey);
        }

    }

    @Override
    public void removeTenant(String name) throws Exception {
        Tenant tenant = new Tenant(name);
        if (name == null || name.trim().isEmpty()) {
            throw new EmptyTenantNameException("Tenant is null");
        }

        if (!validAccess.containsKey(tenant)) {
            throw new TenantNotFoundException("The tenant does not exist");
        } else {
            validAccess.remove(tenant);
        }
    }

    @Override
    public List<AccessLog> getAccessLog() {
        return null;
    }

}
