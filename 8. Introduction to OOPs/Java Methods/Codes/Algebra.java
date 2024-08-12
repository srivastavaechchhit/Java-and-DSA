import java.util.Scanner;

public class Algebra {
    int a, b;

    Algebra(int x, int y) {
        System.out.println("Constructor of Algebra class is called");
        a = x;
        b = y;
    }

    int add() {
        return a + b;
    }

    int sub() {
        return a-b;
    }

    int prod() {
        return a * b;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        Algebra obj1 = new Algebra(num1, num2);

        System.out.println("Sum: " + obj1.add());
        System.out.println("Difference: " + obj1.sub());
        System.out.println("Product: " + obj1.prod());

        Algebra obj2 = new Algebra(10,6);
        System.out.println("Sum: " + obj2.add());
        System.out.println("Difference: " + obj2.sub());
        System.out.println("Product: " + obj2.prod());
    }
}
