package isp.lab4.exercise4;

public class OrganizerApp implements TicketManager {
    private Organiser organiser;
    private UserApp scanTicket = new UserApp();

    public void scanTicket(User user, Organiser organiser1) {

        if (organiser1.getName() == "admin") {
            scanTicket.viewTicket();
            validateTicket();
        }
        System.out.println("Ticketul a fost scanat");
    }

    @Override
    public void generateTicket() {
    }

    @Override
    public void validateTicket() {
        System.out.println("Ticketul este valid");
    }

    public void checkIn(OrganizerApp organizerApp) {
        organizerApp.validateTicket();
    }


}
