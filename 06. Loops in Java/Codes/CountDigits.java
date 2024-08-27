import java.util.Scanner;

public class CountDigits {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter the number:");
  int num = sc.nextInt();

  int numDup = num, count = 0;

  // Using while loop
  while (numDup != 0) {
      numDup /= 10;
      count++;
  }
  System.out.println("Number of digits in " +num+ " is: " +count);

  // Using for loop
  for (int i=0; i!=numDup; numDup/=10) {
      count++;
  }
  System.out.println("Number of digits in " +num+ " is: " +count);
  }
}
