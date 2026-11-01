package queues;

import java.util.Queue;
import java.util.ArrayDeque;

public class Basics {
    static void main() {
        Queue<Integer> q = new ArrayDeque<>();
        System.out.println(q.isEmpty());    // true
        q.add(20);
        System.out.println(q.isEmpty());    // false
        q.add(21);
        q.add(2);
        q.add(6);
        q.add(19);
        System.out.println(q);              // 20, 21, 2, 6, 19
        System.out.println(q.size());       // 5
        q.remove();
        System.out.println(q);              // 21, 2, 6, 19
        q.poll();
        System.out.println(q);              // 2, 6, 19
        System.out.println(q.size());       // 3
        System.out.println(q.peek());       // 2
        System.out.println(q.element());    // 2
    }
}
