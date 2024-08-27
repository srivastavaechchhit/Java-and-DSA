public class UsingContinue {
  
    public static void main(String[] args) {
      int num = 1;

      // Using while loop
      while (num <= 50) {
        if (num%3 == 0) {
          num++;
          continue;
        }
        else {
          System.out.println(num);;
        }
        num++;
      }
      
      // Using for loop  
      for (int i=1; i<=50; i++) {
        if (i%3 == 0) {
          continue;
        }
        else {
          System.out.println(i);
        }
      }
    }
}
// Use only one approach (either while loop or for loop) at a time.
