package hashset;

import java.util.HashSet;

public class Basics {
    static void main() {
        HashSet<String> st = new HashSet<>();

        // Adding
        st.add("James");
        st.add("Scott");
        st.add("James");

        // Printing
        System.out.println(st);     // James, Scott

        // Checking if exists
        System.out.println(st.contains("James"));   // true
        System.out.println(st.contains("Mani"));    // false

        // Computing size
        System.out.println(st.size());              // 2

        // Removing
        st.remove("James");

        System.out.println(st.contains("James"));   // false
        System.out.println(st.size());              // 1
        System.out.println("Mark");

        // Traversing
        for (String s : st)
            System.out.println(s);
    }
}
