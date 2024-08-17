import java.util.Scanner;

public class NumberTriangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row-i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
