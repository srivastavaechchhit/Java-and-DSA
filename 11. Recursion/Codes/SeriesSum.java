import java.util.Scanner;

public class SeriesSum {

    static int findSum(int n) {
        if (n == 0) return 0;
        if (n % 2 == 0) return findSum(n-1) - n;
        return findSum(n-1) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println(findSum(n));
    }
}
