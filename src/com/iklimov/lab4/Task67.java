package com.iklimov.lab4;

import java.util.Random;

public class Task67 {
    private static Random random = new Random();

    public static void main(String[] args) {
        int arraySize = 10_000;

        int[] array1 = new int[arraySize];
        int[] array2 = new int[arraySize];
        int[] array3 = new int[arraySize * 2];

        populateArray(array1);
        populateArray(array2);

        for (int i = 0; i < array3.length; i++) {
            array3[i] = i % 2 == 0 ? array1[i / 2] : array2[i / 2];
        }
    }

    private static void populateArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1_000_000);
        }
    }
}
