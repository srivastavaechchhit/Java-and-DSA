import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int row = sc.nextInt();

        for (int i = 1; i <= row ; i++) {

            for (int j = 1; j <= i-1 ; j++)
                System.out.print("  ");
            for (int j = 1; j <= row; j++)
                System.out.print("* ");

            System.out.println();
        }
    }
}
