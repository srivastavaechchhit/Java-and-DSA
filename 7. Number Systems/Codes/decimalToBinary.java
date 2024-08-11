import java.util.Scanner;

public class decimalToBinary {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter decimal number:");
        int decimal_num = sc.nextInt();

        int binary_num = 0, power = 1;

        while (decimal_num != 0) {
            int parity = decimal_num % 2;
            binary_num += (parity * power);
            power *= 10;
            decimal_num /= 2;
        }
        System.out.println("Binary: " +binary_num);
    }
}
