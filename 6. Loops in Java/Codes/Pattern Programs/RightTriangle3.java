/*
    * * * * *
      * * * *
        * * *
          * *
            *
 */

import java.util.Scanner;

public class RightTriangle3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of rows:");
        int row = sc.nextInt();

        // For traversing rows
        Outer: for (int i = 1; i <= row; i++) {

            // For printing spaces
            Inner1: for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }

            // For printing stars
            Inner2: for (int k = i; k <= row; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
