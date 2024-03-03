package isp.lab6.exercise3;

import java.util.Scanner;

public class UserInterface {

    private LoginSystem loginSystem;
    private OnlineStore store;

    private String username;
    private String password;

    public UserInterface(LoginSystem loginSystem, OnlineStore store) {
        this.loginSystem = loginSystem;
        this.store = store;
    }

    public void loadInterface() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Apasati 1 pentru a va face cont!\n" +
                    "Apasati 2 pentru a va loga in cont!\n" +
                    "Apasati 3 pentru a va deloga!\n"+
                    "Apasati 4 pentru a contiunua cumparaturile in contul curent\n"+
                    "Apasati 5 pentru checkout\n");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Introduceti un username:");
                    username = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Introduceti o parola:");
                    password = scanner.nextLine();
                    loginSystem.register(username, password);
                    break;
                case 2:
                    System.out.println("Introduceti username-ul contului:");
                    username = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Introduceti parola:");
                    password = scanner.nextLine();
                    loginSystem.login(username, password);
                    break;
                case 3:
                    System.out.println("Introduceti username-ul contului:");
                    username = scanner.nextLine();
                    scanner.nextLine();
                    loginSystem.logout(username);
                    break;
                case 4:
                    System.out.println("Aduga in cos produsul cu id-ul:");
                   int choice1= scanner.nextInt();
                    store.addToChart(username,store.getProducts().get(choice1), 1);
                    break;
                case 5:
                    System.out.println(store.checkout(username));


            }
        } while ((choice < 5) && (choice > 0));

    }
}
