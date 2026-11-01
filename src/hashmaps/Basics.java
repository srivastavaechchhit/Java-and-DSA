package hashmaps;

import java.util.Map;
import java.util.Scanner;
import java.util.LinkedHashMap;

public class Basics {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> mp = new LinkedHashMap<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter " +i+ ": ");
            mp.put(sc.next(), sc.nextInt());
        }

        for (var i : mp.entrySet())
            System.out.println("Age of " +i.getKey()+ " is " +i.getValue());

        for (String key : mp.keySet())
            System.out.printf("Age of %s is %d\n", key, mp.get(key));

        for (Map.Entry<String, Integer> e : mp.entrySet())
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());

        for (var e : mp.entrySet())
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
    }
}
