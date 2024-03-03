package isp.lab7.safehome;

public class Door {
    private DoorStatus status;

    public Door(DoorStatus status) {
        this.status = status;
    }

    public void LockDoor(){
        status=DoorStatus.CLOSE;

    }
    public void UnlockDoor(){

      status=  DoorStatus.OPEN;
    }

    public DoorStatus getStatus() {
        return status;
    }
}
