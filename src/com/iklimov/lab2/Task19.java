package com.iklimov.lab2;

class Task19 {
    public static void main(String[] args) {
        double a = 1.234;
        double b = -3.12;
        double c = 5.45;
        double d = 2.0;

        double y = Math.pow((Math.tan(a)), 1.0 / c) / (1 + (Math.cosh(b) / Math.log(d + c)));
        System.out.println(y);
    }
}
