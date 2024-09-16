package Homework;
import java.util.ArrayList;
import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {

        //1. count digits of number
        System.out.println("Please, input positive number.");
        int number = new Scanner(System.in).nextInt();
        char[] numberChar = Integer.toString(number).toCharArray();
        int count = numberChar.length;
        System.out.println(number + "'s digit's count is " + count);

        //2. largesrt and smallest numbers
        System.out.println("Please, input number you want or input 0, if you want to finish.");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int number1;
        do {
            number1 = scanner.nextInt();
            if (number1 != 0) {
                numbers.add(number1);
            }
        } while (number1 != 0);
        numbers.add(number1);

        int max = numbers.get(0);
        int min = numbers.get(0);

        for (int variable : numbers) {
            if (variable > max) {
                max = variable;
            }
            if (variable > min) {
                min = variable;
            }
        }
        System.out.println("The minimum number is " + min + " and the maxinum is " + max);

        //3. sum up
        String message;
        do {
            System.out.println("Please, input 2 numbers.");

            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int sum = x + y;
            System.out.println("The sum of " + x + " and " + y + " is: " + sum);
            System.out.print("Do you want to repeat? If not, plesae, enter Finish");
            message = scanner.nextLine();
        }
        while (message.equals("Finish"));
        System.out.println("Thank you for playing with me.");

        //4. calculating the Power of a Number
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        for (int i = 1; i < k; i++) {
            int power = n;
            power = power * n;
        }

        //5. Armstrong numbers
//        ArrayList<Integer> armstrongNumbers = new ArrayList<Integer>();
//        for (int i = 1; i < 501; i++){
//           int digitsOfI = String.valueOf(i).length();
//           int firstNumber = i / 100;
//           int secondNumber  = i / 10;
//
//           if ()
//        }

        //6. Fibonacci
        System.out.println("Please enter positive number for calculating Fibonacci number");
        int fiboNumber = scanner.nextInt();
        int f1 = 0;
        int f2 = 1;
        for (int i = 1; i <= fiboNumber; i++) {
            int fiboMember = f1 + f2;
            f1 = f2;
            f2 = fiboMember;
        }
        System.out.println("Fibonacci sequence " + n + "-th  member is " + fiboNumber);

        //7.

        //8. diamond
        System.out.println("Please, enter diamond metric");
        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= (size * 2 + 1); l++) {
                System.out.print("*");
            }
        }
        for (int i = size - 1; i >= 1; i--) {
            for (int j = size; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= (size * 2 + 1); l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

