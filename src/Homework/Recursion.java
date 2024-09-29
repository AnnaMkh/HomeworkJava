package Homework;

public class Recursion {
    public static void main(String[] args) {

        //2 fibonacci
        int n = 5;
        //  System.out.println(fibonacci(n));

        //3 factorial
        int n1 = 6;
        //  System.out.println(factorial(n1));

        //4 power
        int n2 = 5;
        int k = 3;
        System.out.println(power(n, k));

        //5 Min max from array-recursion
        int[] arrayRecursion = {15, 20, 35, 1, -45, -80};
        System.out.println(findMinElement(arrayRecursion, arrayRecursion.length - 1));
        System.out.println(findMaxElement(arrayRecursion, arrayRecursion.length-1 ));
    }

    public static int findMinElement(int[] arrayRecursion, int nn) {
        if (nn == 0) {
            return arrayRecursion[nn];
        }
        int minOfArray = findMinElement(arrayRecursion, nn - 1);
        return Math.min(arrayRecursion[nn], minOfArray);
    }

    public static int findMaxElement(int[] arrayRecursion, int nn) {
        if (nn == 0) {
            return arrayRecursion[nn];
        }
        int maxOfArray = findMaxElement(arrayRecursion, nn - 1);
        return Math.max(arrayRecursion[nn], maxOfArray);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int nfib = fibonacci(n - 1) + fibonacci(n - 2);
        return nfib;
    }

    public static int factorial(int n1) {
        if (n1 <= 1) {
            return n1;
        }
        int fact = n1 * factorial(n1 - 1);
        return fact;
    }

    public static int power(int n2, int k) {
        if (k <= 1) {
            return k;
        }
        k--;
        int power = n2 * power(n2, k);
        return power;
    }
}
