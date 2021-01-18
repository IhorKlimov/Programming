package com.iklimov.lab3;

class Task2 {
    public static void main(String[] args) {
        printResults(5, 1.5, 2);
        printResults(20, 1.5, 2);
    }

    public static double axx(double k, double t, double s) throws IllegalAccessException {
        if (k < 2 || k > 25) {
            throw new IllegalAccessException("param k = " + k);
        }

        int result = 0;

        for (int i = 1; i <= k; i++) {
            result += Math.log(-t * i) * Math.cos(Math.sqrt(s * (1 / Math.pow(i, 2))));
        }

        return result;
    }

    private static void printResults(double k, double t, double s) {
        System.out.println("printResults() called with: k = [" + k + "], t = [" + t + "], s = [" + s + "]");

        try {
            System.out.println(axx(k, t, s));
        } catch (IllegalAccessException e) {
            System.out.printf("EXCEPTION! " + e.getMessage());
        }
    }
}
