package com.iklimov.lab9;


class Task1 {
    public static void main(String[] args) throws IllegalAccessException {
        System.out.println(intToHexString(51966));
    }

    private static String intToHexString(int number) throws IllegalAccessException {
        StringBuilder result = new StringBuilder();
        int quotient = number;

        while (quotient > 0) {
            int remainder = quotient % 16;
            result.insert(0, intToHex(remainder));
            quotient /= 16;
        }

        return result.toString();
    }

    private static String intToHex(int number) throws IllegalAccessException {
        if (number >= 0 && number <= 9) {
            return "" + number;
        } else if (number == 10) {
            return "A";
        } else if (number == 11) {
            return "B";
        } else if (number == 12) {
            return "C";
        } else if (number == 13) {
            return "D";
        } else if (number == 14) {
            return "E";
        } else if (number == 15) {
            return "F";
        } else {
            throw new IllegalAccessException("Invalid input. Number is " + number);
        }
    }
}
