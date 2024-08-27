import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int row = sc.nextInt();

        /* to print the upper part
                *
               * *
              * * *
             * * * *
            * * * * *
         */
        for (int i = 1; i <= row; i++) {

             // to print initial spaces
            for (int j = 1; j <= row-i; j++)
                System.out.print(" ");
            // to print the stars
            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }

        /* to print the lower part
            * * * *
             * * *
              * *
               *
         */
        for (int i = 2; i <= row ; i++) {

            // to print the later spaces
            for (int j = 1; j <= i-1; j++)
                System.out.print(" ");
            // to print the stars
            for (int j = i; j <= row; j++)
                System.out.print("* ");

            System.out.println();
        }
    }
}
