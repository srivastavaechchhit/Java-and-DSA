import java.util.Scanner;
public class PresentQuery {
  
     static int[] makeFrequencyArray(int[] arr) {
          int[] freqArray = new int[100005];

          for (int nums : arr)
               freqArray[nums]++;
          return freqArray;
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter the size of array:");
          int size = sc.nextInt();

          int[] arr = new int[size];

          System.out.println("Enter " +size+ " elements in the array:");
          for (int i = 0; i < size; i++)
              arr[i] = sc.nextInt();

          int[] freq = makeFrequencyArray(arr);

          System.out.println("Enter number of queries:");
          int q = sc.nextInt();

          while (q > 0) {
               System.out.println("Enter number to be searched:");
               int num = sc.nextInt();
               if (freq[num] > 0)
                    System.out.println("Present");
               else
                    System.out.println("Not present");
               q--;
          }
     }
}
