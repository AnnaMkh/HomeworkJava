package Homework;

import java.util.Random;
import java.util.Scanner;

public class Branching {
    public static void main(String[] args) {

        //increasing, decreasing,  niether
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 3 numbers, please.");
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();

        if (a1 < a2 && a2 < a3) {
            System.out.println("Increasing");
        } else if (a1 > a2 && a2 > a3) {
            System.out.println("Decreasing");
        } else System.out.println("Niether");

        //leapYear
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else System.out.println("Non-leap year");

        //calculate
        System.out.println("Enter the character");
        String character = scanner.next();
        int result;
        switch (character) {
            case "*":
                result = a1 * a2;
                System.out.println(result);
                break;
            case ":":
                result = a1 % a3;
                System.out.println(result);
                break;
            case "+":
                result = a1 + a2;
                System.out.println(result);
                break;
            case "-":
                result = a1 - a2;
                System.out.println(result);
                break;
            default:
                System.out.println("Character is not an operator");
        }

        // class list

        String[] semesters = {"Fall", "Spring"};
        String semester = semesters[new Random().nextInt(semesters.length)];

        String[] courses = {"CS", "ES"};
        String course = courses[new Random().nextInt(courses.length)];

        String[] programs = {"Introduction to Computer Science", "English literature", "OOP", "Introduction to journalism"};

        System.out.println(semester + " " + course);
        switch (semester) {
            case ("Fall"):
                switch (course) {
                    case ("CS"):
                        String programFallCS = programs[0];
                        System.out.println("In fall CS's program is " + programFallCS);
                        break;
                    case ("ES"):
                        String programFallES = programs[2];
                        System.out.println("In fall ES's program is " + programFallES);
                        break;
                }
            case ("Spring"):
                switch (course) {
                    case ("CS"):
                        String programSpringCS = programs[1];
                        System.out.println("In spring CS's program is " + programSpringCS);
                        break;
                    case ("ES"):
                        String prograSpringES = programs[3];
                        System.out.println("In spring ES's program is " + prograSpringES);
                        break;
                }
        }
    }
}