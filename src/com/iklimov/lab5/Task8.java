package com.iklimov.lab5;


public class Task8 {
    public static void main(String[] args) {
        int[][] matrixA = new int[4][10];
        int[][] matrixB = new int[4][10];

        int[][] result = multiply(matrixA, matrixB);
    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int aHeight = a.length;
        int aWidth = a[0].length;
        int bHeight = b.length;
        int bWidth = b[0].length;

        if (aWidth != bHeight) {
            throw new IllegalArgumentException("a:Rows: " + aWidth + " did not match b:Columns " + bHeight + ".");
        }

        int[][] result = new int[aHeight][bWidth];
        for (int i = 0; i < aHeight; i++) {
            for (int j = 0; j < bWidth; j++) {
                result[i][j] = 0;
            }
        }

        for (int i = 0; i < aHeight; i++) { // aRow
            for (int j = 0; j < bWidth; j++) { // bColumn
                for (int k = 0; k < aWidth; k++) { // aColumn
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }
}
