import java.util.ArrayList;
import java.util.Collections;

public class Reverse {

    static void swapInList(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    static void reverseList(ArrayList<Integer> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            swapInList(list, left, right);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        // Using self-created method
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(20);
        list1.add(2);
        list1.add(21);
        list1.add(6);
        list1.add(2003);
        list1.add(2019);

        System.out.println("Original list-1: " + list1);
        reverseList(list1);
        System.out.println("Reversed list-1: " + list1);

        // Using built-in method
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(20);
        list2.add(2);
        list2.add(21);
        list2.add(6);
        list2.add(2003);
        list2.add(2019);

        System.out.println("Original list-2: " +list2);
        Collections.reverse(list2);
        System.out.println("Reversed list-2: " +list2);
    }
}