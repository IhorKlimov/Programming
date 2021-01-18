package com.iklimov.lab9;

class Task8 {

    public static void main(String[] args) {
        String sentence = "The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago";

        System.out.println(findAmountOfNumbers(sentence));
    }

    private static int findAmountOfNumbers(String input) {
        int result = 0;

        String[] words = input.split(" ");
        for (String word : words) {
            try {
                int number = Integer.parseInt(word);
                result++;
            } catch (NumberFormatException e) {
                // noop
            }
        }

        return result;
    }
}