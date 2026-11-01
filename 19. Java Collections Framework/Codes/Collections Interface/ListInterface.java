package JavaCollectionsFramework.CollectionsInterface;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Stack;

public class ListInterface {

    static void ArrayListExamples() {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(20);
        l.add(21);
        l.add(2);
        System.out.println(l);                  // 20 21 2
        l.add(6);
        l.add(19);
        System.out.println(l);                  // 20 21 2 6 19
        System.out.println(l.get(1));           // 21
        l.remove(2);
        System.out.println(l);                  // 20 21 6 19
        System.out.println(l.contains(21));     // true
        System.out.println(l.contains(26));     // false
        l.set(2, 2);
        System.out.println(l);                  // 20 21 2 19
        System.out.println(l.indexOf(20));      // 0
        System.out.println(l.size());           // 4
    }

    static void LinkedListExamples() {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(20);
        l.add(21);
        l.add(2);
        System.out.println(l);                  // 20 21 2
        l.add(6);
        l.add(19);
        System.out.println(l);                  // 20 21 2 6 19
        System.out.println(l.get(1));           // 21
        l.remove(2);
        System.out.println(l);                  // 20 21 6 19
        System.out.println(l.contains(21));     // true
        System.out.println(l.contains(26));     // false
        l.set(2, 2);
        System.out.println(l);                  // 20 21 2 19
        System.out.println(l.indexOf(20));      // 0
        System.out.println(l.size());           // 4
    }

    static void StackExamples() {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());       // true
        st.push(20);
        st.push(21);
        st.push(2);
        System.out.println(st);                 // 20 21 2
        System.out.println(st.peek());          // 2
        st.push(6);
        st.push(19);
        System.out.println(st);                 // 20 21 2 6 19
        System.out.println(st.size());          // 5
        st.pop();
        System.out.println(st);                 // 20 21 2 6
        System.out.println(st.isEmpty());       // false
    }

    static void main(String[] args) {
        ArrayListExamples();
        LinkedListExamples();
        StackExamples();
    }
}
