package isp.lab4.exercise4;

public class Exercise4 {

    public static void main(String[] args) {
        UserInfo userInfo = new User("George");
        UserInfo userInfo1 = new Organiser("Vasile");
        OrganizerApp organizerApp = new OrganizerApp();
        UserApp userApp = new UserApp(userInfo);

        userApp.buyTicket();
        userApp.viewTicket();
        organizerApp.checkIn(organizerApp);
        organizerApp.scanTicket((User) userInfo, (Organiser) userInfo1);
    }
}
