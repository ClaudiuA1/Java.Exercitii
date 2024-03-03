package isp.lab6.exercise3;

import java.util.HashSet;
import java.util.Set;


public class LoginSystem {

    private Set<User> user=new HashSet<>();
    private OnlineStore store;

    public LoginSystem(OnlineStore store) {
        this.store = store;
    }

    public void register(String username, String password) {
        User user1 = new User(username, password);
        user.add(user1);
        System.out.println("contul a fost inregistrat");

    }

    public boolean login(String username, String password) {
        for (User users : user) {
            if (users.getUsername().equals(username) && users.getPassword().equals(password)) {
                System.out.println("Contul este bun!!");
                OnlineStore.addSession(username,store);
                return true;
            }
        }
        System.out.println("Username-ul sau parola gresita!");
        return false;

    }

    public boolean logout(String username) {

        for (User users : user) {
            if (users.getUsername().equals(username)) {
                OnlineStore.removeSession(username,store);
                return true;
            }
        }
        System.out.println("Usernameul nu a fost inregistrat!!");

        return false;
    }

}
