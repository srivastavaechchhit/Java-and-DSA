import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking first number as input from the user
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        // Taking second number as input from the user
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        // Calculating the sum of the given numbers and printing the output
        int sum = num1 + num2;
        System.out.println("Sum of the given numbers is: " +sum);
    }
}
