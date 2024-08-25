import java.util.ArrayList;
import java.util.Collections;

public class Sort {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(2);
        list.add(21);
        list.add(6);
        list.add(2003);
        list.add(2019);

        System.out.println("Original: " +list);

        Collections.sort(list); // no comparative means ascending order
        System.out.println("Ascending order: " +list);

        Collections.sort(list, Collections.reverseOrder()); // passing comparative to sort in descending order
        System.out.println("Descending order: " +list);

        list.sort(Collections.reverseOrder());  // enhanced method
        System.out.println("Descending order: " +list);

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("welcome");
        l1.add("to");
        l1.add("my");
        l1.add("java");
        l1.add("repository");

        System.out.println("Original: " +l1);
        Collections.sort(l1);   // Sorting in Lexicographical order
        System.out.println("Sorted in ascending order: " +l1);
        l1.sort(Collections.reverseOrder());
        System.out.println("Sorted in descending order: " +l1);
    }
}