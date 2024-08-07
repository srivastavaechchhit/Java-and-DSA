import java.util.Scanner;

public class OddEven {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();
        
        if (num % 2 == 0) {
           System.out.println("Number is even");
       } else {
           System.out.println("Number is odd");
       }
        
        String ans;
        ans = (num % 2 == 0) ? "Number is even" : "Number is odd";
        System.out.println(ans);
    }
}
