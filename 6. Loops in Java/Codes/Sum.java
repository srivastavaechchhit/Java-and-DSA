/* This program contains two approaches to find the sum of first n natural numbers -
   Using while loop and using for loop
   Use only one block of code at once in order to avoid errors
*/

import java.util.Scanner;

public class SumOfNumbers {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, count = 1;

        System.out.println("Enter n:");
        int num = sc.nextInt();

      // Using while loop
        while (count <= num) {
            sum += count;
            count++;
        }
        System.out.println("Sum of " +num+ " numbers is: " +sum);

      // Using for loop
      for (int count = 1; count <=num; count++) {
            sum += count;
        }
        System.out.println("Sum of " +num+ " numbers is: " +sum);
    }
}
