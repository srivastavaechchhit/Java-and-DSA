/*
                1
              1 2 1
            1 2 3 2 1
          1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
 */

import java.util.Scanner;

public class Palindrome {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of rows");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k+ " ");
            }

            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l+ " ");
            }
            System.out.println();
        }
    }
}
