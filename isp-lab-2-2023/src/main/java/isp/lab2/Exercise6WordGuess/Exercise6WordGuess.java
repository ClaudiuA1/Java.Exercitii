package isp.lab2.Exercise6WordGuess;

import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercise6WordGuess {

    /**
     * This method will return the number of occurrences of a character in a word
     *
     * @param c
     * @param word
     * @return
     */
    public static int countOccurence(char c, char[] word) {
        int verificare = 0;
        int incercari = 0;
        int ok = 0;


        ArrayList<Character> aparitii = new ArrayList<Character>();
        System.out.println();

        System.out.println(word.length);
       // System.out.println(word);


        while (verificare != word.length) {

            Scanner s = new Scanner(System.in);
            System.out.println("Introdu o litera:");
            c = s.next().charAt(0);

            if (aparitii.contains(c)) {
                System.out.println("A-ti introdus aceasta litera deja");
            } else {
                for (int i = 0; i < word.length; i++) {
                    if (c == word[i]) {
                        System.out.println("Litera este in cuvant, pe pozitia:" + i);
                        ok = 1;
                        aparitii.add(c);
                        aparitii.add((char) i);
                        verificare++;
                    }
                }
            }
            if (ok == 0)
                System.out.println("Litera nu este in cuvant");

            System.out.print("Litere gasite pana acum: ");
            for (int i = 0; i < aparitii.size(); i += 2)
                System.out.print(aparitii.get(i) + "-" + (int) (aparitii.get(i + 1)) + " ");


            System.out.println();

            incercari++;
            ok = 0;

        }
        return incercari;

    }

    public static void main(String[] args) {

        String input = "walking,dog,cat,java,dictionary,me,idk";
        String[] words = input.split(",");
        Random rand = new Random();
        int randomNumber = rand.nextInt(words.length);
        char c = 'a';
        char[] word = new char[words[randomNumber].length()];

        for (int i = 0; i < words[randomNumber].length(); i++)
            word[i] = words[randomNumber].charAt(i);

        int result = countOccurence(c, word);
        System.out.print("Cuvantul era: ");
        System.out.println(word);


        System.out.println("Ati incercat de " + result + " ori!");


    }
}