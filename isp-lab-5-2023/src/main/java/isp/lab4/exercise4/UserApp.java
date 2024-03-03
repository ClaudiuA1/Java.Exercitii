package isp.lab4.exercise4;

public class UserApp implements TicketManager {

    private UserInfo user;

    public UserApp() {
    }

    public UserApp(UserInfo user) {
        this.user = user;
    }

    public void viewTicket() {
        System.out.println(" -------------- ");
        System.out.println("|             |");
        System.out.println("|      T      |");
        System.out.println("|      I      |");
        System.out.println("|      C      |");
        System.out.println("|      K      |");
        System.out.println("|      E      |");
        System.out.println("|      T      |");
        System.out.println("|             |");
        System.out.println(" -------------- ");
    }

    @Override
    public void generateTicket() {
        System.out.println("Se genereaza bilet!");

    }

    @Override
    public void validateTicket() {
    }

    public void buyTicket() {
        System.out.println("Biletul a fost cumparat");
        generateTicket();

    }


}
