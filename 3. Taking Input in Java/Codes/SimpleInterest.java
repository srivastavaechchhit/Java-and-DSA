import java.util.Scanner;

public class SimpleInterest {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking principal as input from the user
        System.out.println("Enter principal (in rupees):");
        float principal = sc.nextFloat();

        // Taking rate of interest as input from the user
        System.out.println("Enter the rate of interest (p.a.):");
        float rate = sc.nextFloat();

        // Taking time as input from the user
        System.out.println("Enter the time (in years):");
        float time = sc.nextInt();

        // Printing values input by the user
        System.out.println("Principal: " +principal);
        System.out.println("Rate of Interest: " +rate);
        System.out.println("Time: " +time);

        // Calculation of Simple Interest
        float simpleInterest = (principal*rate*time) / 100;
        System.out.println("Simple Interest: " +simpleInterest);
    }
}
