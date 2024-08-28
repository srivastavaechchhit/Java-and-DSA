import java.util.Scanner;

public class Factorial {

    static int printFactorial(int n) {

        // Base case
        if (n == 0)
            return 1;

        // Smaller problem → Recursive work
        int smallAns = printFactorial(n-1);

        // main problem → Self work
        int finalAns = n * smallAns;

        return finalAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++)
            System.out.println(i+ "! = " +printFactorial(i));
    }
}
