/*
    This program contains three approaches of the program to find the Greatest Common Divisor of two numbers x and y.
    Brute force approach to intermediate and the recursive approach.
    Use the methods accordingly along with their respective method calls to avoid overlapping of outputs
 */

import java.util.Scanner;

public class GCD {

    static int iGCD1(int x, int y) {
        for (int i = Math.min(x, y); i > 1; i--) {
            if ((x % i == 0) && (y % i == 0))
                return i;
        }
        return 1;
    }

    static int iGCD2(int x, int y) {
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }

    static int findGCD(int x, int y) {
        if (y == 0) return x;
        return findGCD(y, x % y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x:");
        int x = sc.nextInt();
        System.out.println("Enter y:");
        int y = sc.nextInt();

        System.out.println("GCD: " + iGCD1(x, y));
        System.out.println("GCD: " + iGCD2(x, y));
        System.out.println("GCD: " + findGCD(x, y));
    }
}