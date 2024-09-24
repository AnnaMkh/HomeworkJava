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
        System.out.println("Please, input as many  numbers as you want or input 0, if you want to finish.");
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
            if (variable < min) {
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
            scanner.nextLine();
            System.out.print("Do you want to repeat? If not, plesae, enter 0");
            message = scanner.nextLine();
        }
        while (!message.equalsIgnoreCase("0"));
        System.out.println("Thank you for playing with me.");

        //4. calculating the Power of a Number
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int power = 1;
        for (int i = 1; i < k; i++) {
            power *= n;
        }
        System.out.println(power);

        //5. Armstrong numbers------------------
        for (int num = 1; num <= 500; num++) {
            if (isArmstrong(num)) {
                System.out.println(num);
            }
        }

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

        //7.-------------------------
        double ln2 = 0.0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                ln2 -= 1.0 / i; // subtract if even index
            } else {
                ln2 += 1.0 / i; // add if odd index
            }
        }
        System.out.println("The approximation of ln(2) with " + n + " terms is: " + ln2);

        //8. diamond
        System.out.println("Please, enter diamond metric");
        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= (i * 2 - 1); l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = size - 1; i >= 1; i--) {
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= (i * 2 - 1); l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        return sum == originalNumber;
    }
}

