package coreJava;

import java.util.Arrays;

public class FindElement {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 6, 8};
        int j = 5;

        // if j is available in the array
        for (int i : a) {

            if (i == j) {
                System.out.println(j + " is in the array");
            }
        }

        //print only even numbers
        for (int i : a) {

            if (i == j) {
                System.out.println(j + " is in the array");
            }
        }

        //find the lowest number.
        Arrays.sort(a);
        System.out.println("Lowest number is "+ a[0]);
        //find highest number
        int m = a.length;
        System.out.println("Highest number is "+ a[m-1]);



        String[] s = {"Abul", "Babul", "Chinmoy", "Don"};
        String k = "Abul";

        for (String i : s) {
            if (k.equalsIgnoreCase(i)) {
                System.out.println(k + " is in the array");
            }
        }

    }
}
