import java.util.Scanner;

public class StreamSum {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int sum = 0;
    System.out.println("Enter positive Integers:");
    int num = sc.nextInt();
    
    do {
      num = sc.nextInt();
      sum += num;
    } while (num != -1);
    System.out.println("Sum: " +sum);
  }
}
