import java.util.Scanner;

public class StreamSum {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int sum = 0;
    System.out.println("Enter positive Integers:");
    int num = sc.nextInt();
    
    do {
      sum += num;
      num = sc.nextInt();
    } while (num != -1);
    System.out.println("Sum: " +sum);
  }
}
