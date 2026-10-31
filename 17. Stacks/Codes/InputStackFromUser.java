package Stacks;
import java.util.Stack;
import java.util.Scanner;

public class InputStackFromUser {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the element: ");
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
    }
}
