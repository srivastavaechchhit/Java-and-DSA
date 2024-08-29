import java.util.Scanner;

public class Multiples {

    static void printMultiples(int num, int k) {
        if (k == 1) {
            System.out.println(num);
            return;
        }
        printMultiples(num, k-1);
        System.out.println(num * k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();
        System.out.println("How many multiples of " +num+ " you want to print ?");
        int k = sc.nextInt();

        printMultiples(num, k);
    }
}
