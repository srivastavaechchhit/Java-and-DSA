/*
    This program contains two approaches of the same problem.
    Use one at a time with the correct method call to avoid overlapping or errors
 */
import java.util.Scanner;

public class Power {

    static int pow(int p, int q) {
        if (q == 0) return 1;
        return pow(p, q-1) * p;
    }

    static int findPow(int p, int q) {
        if (q == 0) return 1;
        int smallAns = findPow(p, q / 2);
        if (q % 2 == 0) return smallAns * smallAns;
        return p * smallAns * smallAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter p:");
        int p = sc.nextInt();
        System.out.println("Enter q:");
        int q = sc.nextInt();
        System.out.println(pow(p, q));
        System.out.println(findPow(p, q));
    }
}
