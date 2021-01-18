package com.iklimov.lab6;


import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        short[] array = new short[]{2, 6, 3, 8, 9, 20, 27, 14};
        sort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void sort(short[] array) {
        int size = array.length;

        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++)
                if (array[j] < array[minIndex])
                    minIndex = j;

            short temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
