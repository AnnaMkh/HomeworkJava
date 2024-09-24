package Homework;

import java.util.Random;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        //3
        int randomNumber = new Random().nextInt(30);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input your guessed number between 0 and 29.");
        int guessNumber = scanner.nextInt();
        while (randomNumber != guessNumber) ;
        {
            System.out.println("Wrong number! Try again.");
            guessNumber = scanner.nextInt();
        }
        System.out.println("Congratulations! You guessed the random number " + guessNumber + ".");

        //2
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rows = array.length;
        int coloums = array[0].length;

        for (int i = coloums - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                for (int row = rows - 1; row >= 0; row--) {
                    System.out.print(array);
                }
            } else {
                for (int row = 0; row < rows; row++) {
                    System.out.print(array);
                }
            }
        }
    }
}
