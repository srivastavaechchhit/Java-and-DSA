/* This program contains two approaches - Using while loop and using for loop
   Use only one block of code at once in order to avoid errors
*/

import java.util.Scanner;

public class ReverseDigits {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = sc.nextInt();

        int numDup = num, revNum = 0;

        // Using while loop
        while (numDup != 0) {
            revNum = (revNum * 10) + (numDup % 10);
            numDup /= 10;
        }
        System.out.println("Original:" +num+ ", Reversed: " + revNum);

        // Using for loop
        for (; numDup!=0; numDup/=10) {  // Initialization is optional
            revNum = (revNum *10) + (numDup % 10);
        }
        System.out.println("Original:" +num+ ", Reversed: " + revNum);
    }
}
