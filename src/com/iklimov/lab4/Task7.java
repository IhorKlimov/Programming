package com.iklimov.lab4;

public class Task7 {
    public static void main(String[] args) {
        int numOfEvenNumbers = findNumberOfEvenNumbersBetween(0, 1025);
        System.out.println(numOfEvenNumbers);

        numOfEvenNumbers = findNumberOfEvenNumbersBetween(254, 2674);
        System.out.println(numOfEvenNumbers);
    }

    private static int findNumberOfEvenNumbersBetween(int start, int end) {
        int result = 0;

        for (int i = start; i < end; i++) {
            if (i % 2 == 0) {
                result++;
            }
        }

        return result;
    }
}
