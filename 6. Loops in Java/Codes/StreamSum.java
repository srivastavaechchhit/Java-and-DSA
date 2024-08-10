import java.util.Scanner;

public class StreamSum {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, num;
        System.out.println("Enter positive Integers:");

        do {
            num = sc.nextInt();
            sum += num;
        } while (num > 0);
        System.out.println("Sum: " +sum);
    }
}
