/* 
  S = 1 - 2 + 3 - 4 + 5 - 6...n
*/

import java.util.Scanner;

public class SumSeries {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        int sum = 0;

        for (int i=1; i<=n; i++) {
            if (i % 2 == 0) {
                sum -= i;
            }
            else {
                sum += i;
            }
        }
        System.out.println("Sum is " +sum);
    }
}
