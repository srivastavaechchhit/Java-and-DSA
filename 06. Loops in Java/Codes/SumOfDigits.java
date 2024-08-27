import java.util.Scanner;

public class SumOfDigits {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter the number:");
  int num = sc.nextInt();

  int numDup = num, sum = 0;

  // Using while loop
  while (numDup != 0) {
      sum += numDup % 10;
      numDup /= 10;
  }
  System.out.println("Sum of digits of " +num+ " is: " +sum);

  // Using for loop
  for (int i=0; i!=numDup; numDup/=10) {
      sum += numDup % 10;
  }
  System.out.println("Sum of digits of " +num+ " is: " +sum);
  }
}
