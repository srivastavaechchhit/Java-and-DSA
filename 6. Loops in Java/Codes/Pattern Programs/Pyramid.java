/*
            *
          * * *
        * * * * *
      * * * * * * *
 */

import java.util.Scanner;

public class Pyramid {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of rows:");
        int row = sc.nextInt();

        // Outer loop for traversing no. of rows
        for (int i = 1; i <= row; i++) {

            // Inner loop 1 to print spaces
            for (int j = 1; j <= row-i; j++) {
                System.out.print("  ");
            }

            // Inner loop 2 to print stars
            for (int k = 1; k <= (2*i)-1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
