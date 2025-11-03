/*
    Find the square root of a given non-negative value x. Round it off to the nearest floor integer.

    Input: x = 4
    Output: 2

    Input: 11
    Output: 3
 */

import java.util.Scanner;

public class FindSquareRoot {

    static int sqrt (int x) {
        int st = 0, end = x;
        int ans = -1;

        while (st <= end) {
            int mid = st + (end-st)/2;
            int val = mid * mid;

            if (val == x) return mid;
            else if (val < x) {
                ans = mid;
                st = mid + 1;
            } else end = mid - 1;
        }
        return ans;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.println("Square root: " +sqrt(x));
    }
}
