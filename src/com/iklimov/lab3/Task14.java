package com.iklimov.lab3;

class Task14 {
    public static void main(String[] args) {
        long result = 0;

        for (int i = 0; ; i++) {
            result += Math.pow(-2, i) / factorial(i) * (i + 1);
            if (Math.abs(result) < Math.E) {
                break;
            }
        }
        System.out.println(result);
    }

    private static long factorial(int number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result += factor;
        }

        return result;
    }
}
