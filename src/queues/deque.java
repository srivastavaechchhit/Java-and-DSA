package queues;

import java.util.Deque;
import java.util.ArrayDeque;

public class deque {
    static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addLast(20);;
        dq.addLast(21);
        dq.addLast(2);
        dq.addLast(6);
        System.out.println(dq);             // 20, 21, 2, 6
        dq.addFirst(19);
        System.out.println(dq);             // 19, 20, 21, 2, 6
        dq.removeFirst();
        System.out.println(dq);             // 20, 21, 2, 6
        dq.removeLast();
        System.out.println(dq);             // 20, 21, 2
        System.out.println(dq.getFirst());  // 20
        System.out.println(dq.getLast());   // 2
    }
}
