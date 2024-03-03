package isp.lab4.exercise4;

public class User extends UserInfo {
    private String status;
    public String ticket;

    public User(String name) {
        super(name);
        this.status = "client";
    }

    @Override
    public String getName() {
        return this.status;
    }

    public String getTicket() {
        return ticket;
    }
}
