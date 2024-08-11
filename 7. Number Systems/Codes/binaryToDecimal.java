import java.util.Scanner;

public class binaryToDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter binary number:");
        int binary_num = sc.nextInt();

        int decimal_num = 0, power = 1;

        while (binary_num != 0) {
            int unit_digit = binary_num % 10;
            decimal_num += unit_digit * power;
            binary_num /= 10;
            power *= 2;
        }
        System.out.println("Decimal: " +decimal_num);
    }
}
