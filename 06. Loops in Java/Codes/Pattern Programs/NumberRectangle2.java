/*
    1 2 3 4 5 6
    1 2 3 4 5 6
    1 2 3 4 5 6
    1 2 3 4 5 6
 */

import java.util.Scanner;

public class NumberRectangle2 {
  
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the no. of rows:");
            int row = sc.nextInt();

            System.out.println("Enter the no. of columns:");
            int col = sc.nextInt();

            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= col; j++) {
                    System.out.print(j+ " ");
                }
                System.out.println();
            }
        }
    }
