package isp.lab2.Exercise5EvenOddSearch;

public class Exercise5EvenOddSearch {

    public static int[] findEvenOdd(String input) {

        String[] array = input.split(",");
        int[] temp_result = new int[array.length];
        int[] result = new int[4];

        for (int i = 0; i < array.length; i++)
            temp_result[i] = Integer.parseInt(array[i]);

        result[2] = temp_result[0];

        for (int i = 0; i < array.length; i++) {
            if (temp_result[i] > result[0] && temp_result[i] % 2 == 0) {
                result[0] = temp_result[i];
                result[1] = i;
            }

            if (temp_result[i] < result[0] && temp_result[i] % 2 != 0) {
                result[2] = temp_result[i];
                result[3] = i;
            }

        }

        if ((result[2] == 0 && result[1] == 0) || (result[0] == 0 && result[1] == 0))
            System.out.println("Nu avem numere pare sau impare");


        return result;

    }

    public static void main(String[] args) {
        String input = "1,2,3,4,5,6,7,8,9,10";
        int[] result = findEvenOdd(input);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
