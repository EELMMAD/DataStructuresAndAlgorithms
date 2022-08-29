package se.codewithMosh.elmira.theBigONotation.Arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
       //Lookup O(1)
        // Insert O(n)
        // Delete O(n)

        int[] numbersI = new int[3];
        numbersI[0] = 10;
        numbersI[1] = 20;
        numbersI[2] = 30;
        System.out.println(Arrays.toString(numbersI));

        int[] numbersII = {10, 20, 30};
        System.out.println(numbersII.length);
        System.out.println(Arrays.toString(numbersII));
    }
}
