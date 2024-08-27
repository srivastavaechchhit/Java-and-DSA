/*
    *             *
    * *         * *
    * * *     * * *
    * * * * * * * *
    * * *     * * *
    * *         * *
    *             *
 */

import java.util.Scanner;
public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int row = sc.nextInt();

        /*
            *             *
            * *         * *
            * * *     * * *
            * * * * * * * *
         */
        for (int i = 1; i <= row; i++) {
            // to print left side stars
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            // to print spaces in between
            for (int j = 1; j <= (row-i)*2; j++)
                System.out.print("  ");
            // to print right side stars
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }

        /*
            * * *   * * *
            * *       * *
            *           *
         */
        for (int i = 1; i < row; i++) {
            // to print left side stars
            for (int j = i+1; j <= row; j++)
                System.out.print("* ");
            // to print spaces in between
            for (int j = 1; j <= i*2; j++)
                System.out.print("  ");
            // to print right side stars
            for (int j = i+1; j <= row; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
