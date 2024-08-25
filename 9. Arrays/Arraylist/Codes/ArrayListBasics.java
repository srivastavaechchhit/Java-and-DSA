import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {

        // Wrapper classes
        Integer in = 20;
        System.out.println(in);
        Float f = 20.2f;
        System.out.println(f);

        // Creating an Arraylist
        ArrayList<Integer> l1 = new ArrayList<>();

        // Adding new element
        l1.add(20); // 20
        l1.add(2);  // 20 2
        l1.add(21); // 20 2 21
        l1.add(6);  // 20 2 21 6

        // Get an element at random index
        System.out.println(l1.getFirst());  // 20
        System.out.println(l1.get(2));      // 21
        
        // Print with for loop
        for (int i = 0; i < l1.size(); i++)
            System.out.println(l1.get(i));  // 20 2 21 6

        // Print with foreach loop
        for (Integer integer : l1)
            System.out.println(integer);    // 20 2 21 6

        // Printing the array list directly
        System.out.println(l1);     // [20, 2, 21, 6]

        // Adding element at index i
        l1.add(2, 2003);
        System.out.println(l1);     // [20, 2, 2003, 21, 6]

        // Modifying element at index i
        l1.set(2, 2019);
        System.out.println(l1);     // [20, 2, 2019, 21, 6]

        // Removing an element at index i
        l1.remove(2);
        System.out.println(l1);     // [20, 2, 21, 6]

        // Removing an element e
        l1.remove(Integer.valueOf(2));
        l1.remove(Integer.valueOf(6));
        System.out.println(l1);     // [20, 21]

        // Checking if an element exists
        System.out.println(l1.contains(20));    // true
        System.out.println(l1.contains(6));     // false

        // Not specifying the arraylist class
        ArrayList list = new ArrayList();
        list.add("Mani");
        list.add(2019);
        list.add(20.2f);
        list.add(true);
        System.out.println(list);   // [Mani, 2019, 20.2, true]
    }
}
