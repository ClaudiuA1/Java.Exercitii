package isp.lab2.Exercise4StringSearch;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4StringSearch {
    /**
     * This method should return an array of strings that contain the substring.
     * @param input
     * @param substring what to search for
     * @return
     */
    public static String[] searchSubstrings(String input, String substring) {

        String[] temp_list=input.split(",");


        int j=0;

        for(int i=0;i<temp_list.length;i++)
            if (temp_list[i].contains(substring))
               j++;

        String [] result_list=new String[j];
        j=0;
        for(int i=0;i<temp_list.length;i++)
            if (temp_list[i].contains(substring))
                result_list[j++]=temp_list[i];
//no array list
        return result_list;
    }

    public static String readFromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line: ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String input = "apples,computer,bread,tea,car";
        String substring = "te";
        String[] result = searchSubstrings(input, substring);
        for (String string : result) {
            System.out.println(string);
        }
    }
}
