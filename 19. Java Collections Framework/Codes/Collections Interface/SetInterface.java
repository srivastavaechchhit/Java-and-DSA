package JavaCollectionsFramework.CollectionsInterface;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.HashSet;

public class SetInterface {

    static void HashSetExamples() {
        HashSet<Integer> st = new HashSet<>();
        st.add(20);
        st.add(21);
        st.add(2);
        st.add(6);
        st.add(19);
        System.out.println(st);                 // 2 19 20 21 6
        st.add(20);
        st.add(21);
        System.out.println(st);                 // 2 19 20 21 6
        st.remove(6);
        System.out.println(st.contains(6));     // false
        System.out.println(st.contains(19));    // true
        System.out.println(st.size());          // 4
    }

    static void LinkedHashSetExamples() {
        LinkedHashSet<Integer> st = new LinkedHashSet<>();
        st.add(20);
        st.add(21);
        st.add(2);
        st.add(6);
        st.add(19);
        System.out.println(st);                 // 20 21 2 6 19
        st.add(20);
        st.add(21);
        System.out.println(st);                 // 20 21 2 6 19
        st.remove(6);
        System.out.println(st.contains(6));     // false
        System.out.println(st.contains(19));    // true
        System.out.println(st.size());          // 4
    }

    static void TreeSetExamples() {
        TreeSet<Integer> st = new TreeSet<>();
        st.add(20);
        st.add(21);
        st.add(2);
        st.add(6);
        st.add(19);
        System.out.println(st);                 // 2 6 19 20 21
        st.add(20);
        st.add(21);
        System.out.println(st);                 // 2 6 19 20 21
        st.remove(6);
        System.out.println(st.contains(6));     // false
        System.out.println(st.contains(19));    // true
        System.out.println(st.size());          // 4
    }

    static void main(String[] args) {
        HashSetExamples();
        LinkedHashSetExamples();
        TreeSetExamples();
    }
}
