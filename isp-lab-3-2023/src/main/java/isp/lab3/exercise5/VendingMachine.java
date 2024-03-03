package isp.lab3.exercise5;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class VendingMachine {

    public ArrayList<String> nume_produse;

    public int current_credit;
    public ArrayList<Integer> pret;

    public VendingMachine() {
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

    public void userMenu(VendingMachine obj) {
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
                    obj.displayProducts();
                    break;
                case 2:
                    obj.displayCredit();
                    break;
                case 3:
                    System.out.println("Inroduceti o suma: ");
                    int value = scn.nextInt();
                    if (value < 0) {
                        System.out.println("ERROR:SUMA INVALIDA!!");
                        break;
                    }
                    System.out.println(obj.insertCoin(value));
                    System.out.println("Suma a fost adaugat in cont");
                    break;
                case 4:
                    System.out.println("Introduceti Id-ul produsului:");
                    value = scn.nextInt();
                    System.out.println(obj.selectProduct(value));
                    break;
            }
        }

    }


    public static void main(String[] args) {
        VendingMachine e = new VendingMachine();
        e.userMenu(e);

    }
}
