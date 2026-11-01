package hashset;

import java.util.HashSet;
import java.util.Scanner;

public class MaxNumbers {

    static int maxNumbersOnTable(int[] bag) {
        HashSet<Integer> table = new HashSet<>();
        int max = 0;
        for (int i = 0; i < bag.length; i++) {
            int num = bag[i];
            if (table.contains(num))
                table.remove(num);
            else {
                table.add(num);
                max = Math.max(max, table.size());
            }
        }
        return max;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();

        int[] bag = new int[size];
        System.out.printf("Enter %d elements: ", size);

        for (int i = 0; i < size; i++)
            bag[i] = sc.nextInt();

        System.out.println(maxNumbersOnTable(bag));
    }
}
