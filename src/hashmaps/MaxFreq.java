package hashmaps;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class MaxFreq {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " +n+ " elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Map<Integer, Integer> freq = new HashMap<>();
        for (int val : arr) {
            if (freq.containsKey(val))
                freq.put(val, freq.get(val)+1);
            else freq.put(val, 1);
        }

        int maxFreq = 0;
        int ansKey = -1;

        for (var i : freq.entrySet()) {
            if (i.getValue() > maxFreq) {
                maxFreq = i.getValue();
                ansKey = i.getKey();
            }
        }
        System.out.printf("Maximum frequency is %s of the element %d",maxFreq, ansKey);
        System.out.println();

        for (var key : freq.keySet()) {
            if (freq.get(key) > maxFreq) {
                maxFreq = freq.get(key);
                ansKey = key;
            }
        }
        System.out.printf("Maximum frequency is %s of the element %d",maxFreq, ansKey);
    }
}
