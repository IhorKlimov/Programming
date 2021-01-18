package com.iklimov.lab6;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        short[] array = new short[]{2, 6, 3, 8, 9, 20, 27, 14};
        sort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void sort(short[] array) {
        int size = array.length;
        for (short i = 0; i < size - 1; i++)
            for (short j = 0; j < size - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    short temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }
}


