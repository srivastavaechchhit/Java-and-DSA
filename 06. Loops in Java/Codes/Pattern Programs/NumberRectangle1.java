/*
        1 2 3 4 5 6 7
        2 3 4 5 6 7 1
        3 4 5 6 7 1 2
        4 5 6 7 1 2 3
        5 6 7 1 2 3 4
        6 7 1 2 3 4 5
        7 1 2 3 4 5 6
 */

import java.util.Scanner;

public class NumberRectangle1 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of rows:");
        int row = sc.nextInt();

        //  For traversing rows
        Outer: for (int i = 1; i <= row; i++) {

            // To print up to 7
            Inner1: for (int j = i; j <= 7; j++) {
                System.out.print(j+ " ");
            }

            // To print from 1
            Inner2: for (int k = 1; k <= i-1; k++) {
                System.out.print(k+ " ");
            }
            System.out.println();
        }

    }
}
