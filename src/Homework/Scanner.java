package Homework;

public class Scanner {
    public static void main(String[] args) {

        //1. Count Characters in a String
        String input = "Hello";
        char[] counts = input.toCharArray();
        int output = counts.length;
        System.out.println("The string has " + output + " characters.");

        //2Print Each Character on a New Line
        for (int i = 0; i < counts.length; i++) {
            System.out.println(counts[i]);
        }

        //3 String Repetition
        String repetition = (input.concat(input)).concat(input);
        System.out.println(repetition);
    }
}
