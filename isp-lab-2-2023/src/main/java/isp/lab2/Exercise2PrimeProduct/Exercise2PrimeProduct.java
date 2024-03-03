package isp.lab2.Exercise2PrimeProduct;

import java.util.Scanner;

public class Exercise2PrimeProduct {

    /**
     * This method should return the product of the first n prime numbers
     *
     * @param n
     * @param m
     * @return
     */
    public static long getPrimeProduct(int n, int m) {

        int flag = 0;
        long primm = 1;

        if (n > m) {
            System.out.println("n este mai mare ca m");
            return -1;
        }

        for (int i = n; i <= m; i++) {
            flag = 0;
            if (i == 1)
                flag = 1;
            if (i == 2)
                flag = 0;
            else if (i % 2 == 0)
                flag = 1;
            else {
                for (int j = 3; j * j <= i; j++) {
                    if (i % j == 0)
                        flag = 1;

                }
                if (flag == 0)
                    primm *= i;
            }
        }
        return primm;
    }


    /**
     * This method should read from the console a number
     *
     * @return the number read from the console
     */
    public static int readfromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        return number;
    }

    public static void main(String[] args) {
        System.out.println("The product of the first 10 prime numbers is: " + getPrimeProduct(1, 10));
        System.out.println("The product of prime numbers between m and n: " + getPrimeProduct(readfromConsoleInt(), readfromConsoleInt()));
    }

}
