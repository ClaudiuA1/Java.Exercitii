package isp.lab4.exercise4;

public class Organiser extends UserInfo {

    private String status;

    public Organiser(String name) {
        super(name);
        this.status = "admin";
    }

    @Override
    public String getName() {
        return status;
    }
}
