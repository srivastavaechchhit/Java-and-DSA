import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int num = sc.nextInt();

        // The code inside the do-while loop is always executed at least once, irrespective of the given condition.
        do {
            System.out.println(num);
            num++;
        } while (num <= 1);
        // Here, if we input 5, the code will print 5 even though it does not satisfy the given condition i.e., 5 <= 1
    }
}
