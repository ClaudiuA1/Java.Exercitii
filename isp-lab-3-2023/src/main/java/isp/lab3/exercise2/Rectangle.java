package isp.lab3.exercise2;

import java.util.Scanner;

public class Rectangle {
    private int length;
    private int width;
    private String color;

    public Rectangle() {
        length = 2;
        width = 1;
        color = "Red";
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    public String getColor() {
        return this.color;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return 2 * (length + width);
    }


    public static void main(String[] args) {

        Rectangle dreptunghi = new Rectangle();
        Rectangle dreptunghi2 = new Rectangle();

        System.out.println("\nLungimea dreptunghiului este: " + dreptunghi.getLength() + "\n" +
                "Latimea dreptunghiului este: " + dreptunghi.getWidth() + "\n" +
                "Culoarea dreptunghiului este: " + dreptunghi.getColor() + "\n" +
                "Aria dreptunghiului este: " + dreptunghi.getArea() + "\n" +
                "Perimetrul dreptunghiului este: " + dreptunghi.getPerimeter());

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nIntroduceti lungime: ");
        int lungime = scanner.nextInt();
        //scanner.nextLine();

        System.out.print("Introduceti latime: ");
        int latime = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Introduceti culoare: ");
        String input = scanner.nextLine();

        System.out.println("Daca doriti sa schimbati doar lungimea si latimea dreptunghiului introduceti 1 sau daca doriti sa schimbati si culoarea introduceti 2");
        int alegere = scanner.nextInt();

        if (alegere == 1) {
            dreptunghi2 = new Rectangle(lungime, latime);
        } else if (alegere == 2) {
            dreptunghi2 = new Rectangle(lungime, latime, input);
        }

        System.out.println("Lungimea dreptunghiului este: " + dreptunghi2.getLength() + "\n" +
                "Latimea dreptunghiului este: " + dreptunghi2.getWidth() + "\n" +
                "Culoarea dreptunghiului este: " + dreptunghi2.getColor() + "\n" +
                "Aria dreptunghiului este: " + dreptunghi2.getArea() + "\n" +
                "Perimetrul dreptunghiului este: " + dreptunghi2.getPerimeter());


    }
}
