import java.util.Scanner;

public class Sum {

    static int findSum(int num) {

        // Base case
        if (num >= 0 && num <= 9)
            return num;

        // Recursive work
        int smallAns = findSum(num/10);

        // Self work
        int finalAns = smallAns + (num % 10);
        return finalAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();

        System.out.println("Sum of digits: " +findSum(num));
    }
}
