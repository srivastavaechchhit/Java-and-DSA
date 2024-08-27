import java.util.Scanner;
public class Swap {

    static void usingSumAndDifference(int a, int b) {
        System.out.println("Values before swapping:");
        System.out.println("a: " +a);
        System.out.println("b: " +b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Values after swapping:");
        System.out.println("a: " +a);
        System.out.println("b: " +b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = sc.nextInt();

        System.out.println("Enter b:");
        int b = sc.nextInt();

        usingTemp(a, b);
        usingSumAndDifference(a, b);
    }
}
