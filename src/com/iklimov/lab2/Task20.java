package com.iklimov.lab2;

class Task20 {
    public static void main(String[] args) {
        double a = 3.56;
        double b = 1.02;
        double c = 3.0;
        double d = 2.43;

        double y = 2 * Math.log(Math.pow(b, a)) + Math.abs(Math.asin(-Math.sqrt(d / c)));
        System.out.println(y);
    }
}
