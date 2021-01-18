package com.iklimov.lab5;

public class Task1 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][10];

        try {
            int minElement = minElementInLargestColumn(matrix);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private static int minElementInLargestColumn(int[][] matrix) throws IllegalAccessException {
        if (matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalAccessException("matrix is too small");
        }

        int matrixWidth = matrix[0].length;
        int matrixHeight = matrix.length;
        int result = 0;
        int largestColumnSum = 0;

        for (int col = 0; col < matrixWidth; col++) {
            int sum = 0;

            for (int row = 0; row < matrixHeight; row++) {
                sum += Math.abs(matrix[row][col]);
            }
            if (sum >= largestColumnSum) {
                largestColumnSum = sum;

                for (int row = 0; row < matrixHeight; row++) {
                    if (result < matrix[row][col]) {
                        result = matrix[row][col];
                    }
                }
            }
        }

        return result;
    }
}
