package isp.lab3.exercise1;

import java.util.Scanner;

    public class Tree {

        private int height;

        public Tree() {
            this.height = 15;
        }

        public int grow(int meters) {
            if (meters >= 1)
                height += meters;
            return height;
        }

        @Override
        public String toString() {
            return "Tree height is " + height;
        }

    public static void main(String[] args) {
            Tree copac1=new Tree();
            Tree copac2=new Tree();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti metrii: ");
        int metrii = scanner.nextInt();

            copac1.grow(metrii);
        System.out.println(copac1.toString());

        System.out.print("Introduceti metrii: ");
         metrii = scanner.nextInt();
            copac2.height=25;
            copac2.grow(metrii);
        System.out.println(copac2.toString());

    }



}
