package com.iklimov.lab4;


public class Task37 {
    public static void main(String[] args) {
        int numOfEvenNumbers = checkArrayForIndexes(new int[10_000] );
        System.out.println(numOfEvenNumbers);

        numOfEvenNumbers = checkArrayForIndexes(new int[566]);
        System.out.println(numOfEvenNumbers);
    }

    private static int checkArrayForIndexes(int[] array) {
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 3 == 0) {
                result++;
            }
        }

        return result;
    }
}
