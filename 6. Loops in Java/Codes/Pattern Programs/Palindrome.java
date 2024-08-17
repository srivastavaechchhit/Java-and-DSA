import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {

            // to print spaces
            for (int j = 1; j <= row-i ; j++)
                System.out.print("  ");

            /* to print the first pattern
                        1
                      2 1
                    3 2 1
                  4 3 2 1
                5 4 3 2 1
             */
            for (int j = i; j >= 1 ; j--)
                System.out.print(j+ " ");

            /* to print the second pattern
                2
                2 3
                2 3 4
                2 3 4 5
                from the second line
             */
            for (int j = 2; j <= i ; j++)
                System.out.print(j+ " ");
            
            System.out.println();
        }
    }
}
