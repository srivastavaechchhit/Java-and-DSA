// Program to print numbers from 1 to n

import java.util.Scanner;
public class WhileLoop {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 1;

        System.out.println("Enter n:");
        int num = sc.nextInt();

        while (count <= num) {
            System.out.println(count);
            count++;    // count = count +1
        }
    }
}
