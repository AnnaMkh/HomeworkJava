package Homework;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        //1. min max
        int[] minMaxArray = {10, 20, 558, 98, 2, -557, 5};
        int max = minMaxArray[0];
        int min = minMaxArray[0];
        for (int i : minMaxArray) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }  System.out.println("The maximum value in minMaxArray is " + max + ".");
        System.out.println("The minimum value in minMaxArray is " + min + ".");

//        //2. delete array member
//        int[] deleteMember = {1, 2, 3, 4};
//        int[] alreadyDeleted = new int[deleteMember.length - 1];
//        int j = 0;
//
//        for (int i : deleteMember) {
//            if (deleteMember[i] != 2) {
//                alreadyDeleted[j++] = deleteMember[i];
//            }
//        }
//        System.out.println(java.util.Arrays.toString(alreadyDeleted));
//
//        //3. sum of 4 values
//        int[] additives = new int[3];
//        int sum = new Scanner(System.in).nextInt();
//        int  additive0,  additive1,  additive2,  additive3;
    }
}