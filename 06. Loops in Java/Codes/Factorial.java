import java.util.Scanner;

public class Factorial {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt(), factorial = 1;

        for (int i=1; i<=n; i++) {
            factorial *= i;
            System.out.println("Factorial of " +i+ " is: " +factorial);
        }
    }
}
