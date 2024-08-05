import java.util.Scanner;   // importing scanner class from the package java.util

public class TestInput {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // creating an object of the Scanner class

        // Taking integer input
        System.out.println("Enter your lucky number:");
        int num = sc.nextInt(); // nextInt() is a method of Scanner class used to take an integer as input from the user
        // num variable is used to store the input entered by user
        System.out.println("Your lucky number is: " +num);

        // Taking String input
        System.out.println("Enter your name:");
        String name = sc.next();    // next() is a method of Scanner class used to take a String as an input from the user
        // name variable is used to store the input entered by user
        System.out.println("Name: " +name);

        //Taking a sentence as an input
        System.out.println("Enter a sentence:");
        String sen = sc.nextLine(); // nextLine() is used to read String after a whitespace too
        System.out.println("Your sentence: " +sen);

        // Try running only one block of code at a time for better understanding.
    }
}
