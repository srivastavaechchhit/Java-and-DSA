import java.util.Scanner;

public class SumOfNumbers {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, count = 1;

        System.out.println("Enter n:");
        int num = sc.nextInt();

        while (count <= num) {
            sum += count;
            count++;
        }
        System.out.println("Sum of " +num+ " numbers is: " +sum);
    }
}
