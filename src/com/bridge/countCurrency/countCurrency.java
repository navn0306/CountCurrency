package com.bridge.countCurrency;

import java.util.*;
import java.lang.*;

public class countCurrency {

    public static void Currency(int amount) {
        int[] notes = new int[]{2000, 500, 200, 100, 50, 20, 10, 5, 1};
        int[] noteCounter = new int[9];

        for (int i = 0; i < 9; i++)
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        System.out.println("Currency Count ->");
            int noteCount = 0;
        for (int i = 0; i < 9; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : " + noteCounter[i]);
                noteCount += noteCounter[i];

            }
        }
        System.out.println("Total notes -> " +noteCount);
    }

    public static void main(String argc[]) {

        Scanner input = new Scanner(System.in);
        int amount;
        System.out.println("Enter the amount");
        amount = input.nextInt();
        Currency(amount);

    }
}
