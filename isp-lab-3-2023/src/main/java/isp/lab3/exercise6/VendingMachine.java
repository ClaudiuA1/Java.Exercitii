package isp.lab3.exercise6;

import java.util.ArrayList;
import java.util.Scanner;

public class SingletonVendingMachine {

    private static SingletonVendingMachine instance = null;
    private ArrayList<String> nume_produse;
    private int current_credit;
    private ArrayList<Integer> pret;

    private SingletonVendingMachine() {
        nume_produse = new ArrayList<String>();
        nume_produse.add(0, "Cipsuri");
        nume_produse.add(1, "Apa");
        nume_produse.add(2, "Suc");
        pret = new ArrayList<Integer>();
        pret.add(0, 7);
        pret.add(1, 5);
        pret.add(2, 4);
        this.current_credit = 0;
    }

    public static SingletonVendingMachine getInstance() {
        if (instance == null) {
            instance = new SingletonVendingMachine();
        }
        return instance;
    }

    public void displayProducts() {
        for (int i = 0; i < nume_produse.size(); i++) {
            System.out.println("Produs: " + nume_produse.get(i) + "\n" + "ID: " + i + "\nPret: " + pret.get(i));
        }
    }

    public String insertCoin(int value) {
        current_credit += value;
        return "Suma ta noua este: " + current_credit;
    }

    public String selectProduct(int id) {
        Scanner id_code = new Scanner(System.in);

        while ((id > nume_produse.size() - 1) || (id < 0)) {
            System.out.println("ERROR: ID-UL ESTE GRESIT");
            System.out.println("Introduceti un ?ID corect: ");
            id = id_code.nextInt();
        }
        if (current_credit < pret.get(id)) {
            return "Fonduri insuficiente";
        } else {
            current_credit -= pret.get(id);
            return "Ati ales produsul:" + nume_produse.get(id);
        }
    }

    public void displayCredit() {
        System.out.println("Suma pe care o aveti:" + current_credit);
    }

    public void userMenu() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Pentru a iesi din meniu apasati tasta 0\n" +
                "Pentru a vedea sortimentul de snacksuri apasati tasta 1\n " +
                "Pentru a vedea cati bani aveti in aparat apasati tasta 2\n" +
                "Pentru a aduaga o suma de bani in aparat apasati tasta 3\n" +
                "Pentru a alege un snack din aparat apasati tasta 4");

        while (true) {
            System.out.println("\nIntroduceti o tasta:");
            int nr_tasta = scn.nextInt();
            while ((nr_tasta > 4) || (nr_tasta < 0)) {
                System.out.println("ERROR:ATI INTRODUS O TASTA GRESITA!!INTRODUCETI O TASTA CORECTA!!");
                nr_tasta = scn.nextInt();
            }
            switch (nr_tasta) {
                case 0:
                    return;
                case 1:
                    displayProducts();
                    break;
                case 2:
                    displayCredit();
                    break;
                case 3:
                    System.out.println("Inroduceti o suma: ");

            }
        }
    }

    public static void main(String[] args) {
        SingletonVendingMachine machine = new SingletonVendingMachine();
        machine.userMenu();
    }
}
