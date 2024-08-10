public class UsingBreak {
  
    public static void main(String[] args) {

        int num = 5;

        // Using while loop
        while (true) {
            if (num%7 == 0) {
                System.out.println("Found answer: " +num);
                break;
            }
            num += 5;
        }

        // Using for loop
        for (int i = 5; ; i+=5) {
            if (i%7 == 0) {
                System.out.println("Found answer: " +i);
                break;
            }
        }
    }
}

// Use only one approach (either while loop or for loop) at a time.
