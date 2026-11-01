package JavaCollectionsFramework.CollectionsInterface;
import java.util.*;

public class QueueInterface {

    static void QueueExamples() {
        Queue<Integer> q = new LinkedList<>();
        q.offer(20);
        q.offer(21);
        q.offer(2);
        System.out.println(q.peek());       // 20
        System.out.println(q.isEmpty());    // false
        System.out.println(q);              // 20 21 2
        q.offer(6);
        q.offer(19);
        System.out.println(q);              // 20 21 2 6 19
        q.remove();
        System.out.println(q);              // 21 2 6 19
        q.poll();
        System.out.println(q);              // 2 6 19
        System.out.println(q.size());       // 3
    }

    static void PriorityQueueExamples() {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();  // by default --> min priority
        pq1.add(20);
        pq1.add(21);
        pq1.add(2);
        pq1.add(6);
        pq1.add(19);
        System.out.println(pq1);            // 2 6 20 21 19
        System.out.println(pq1.peek());     // 2 (minimum element)
        System.out.println(pq1.poll());     // 2 will be removed
        System.out.println(pq1);            // 6 19 20 21
        System.out.println(pq1.peek());     // 6 (minimum after removing 2)
        System.out.println(pq1.poll());     // 6 will be removed
        System.out.println(pq1);            // 19 21 20

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());    // max priority
        pq2.add(20);
        pq2.add(21);
        pq2.add(2);
        pq2.add(6);
        pq2.add(19);
        System.out.println(pq2);            // 21 20 2 6 19
        System.out.println(pq2.peek());     // 21 (minimum element)
        System.out.println(pq2.poll());     // 21 will be removed
        System.out.println(pq2);            // 20 19 2 6
        System.out.println(pq2.peek());     // 20 (minimum after removing 2)
        System.out.println(pq2.poll());     // 20 will be removed
        System.out.println(pq2);            // 19 6 2
    }

    static void DequeExamples() {
        Deque<Integer> dq = new ArrayDeque<Integer>();
        dq.addLast(2);
        dq.addLast(6);
        dq.addLast(19);
        System.out.println(dq.isEmpty());   // false
        System.out.println(dq);             // 2 6 19
        dq.addFirst(21);
        dq.addFirst(20);
        System.out.println(dq);             // 20 21 2 6 19
        System.out.println(dq.peekFirst()); // 20
        System.out.println(dq.peekLast());  // 19
        dq.pollFirst();
        System.out.println(dq);             // 21 2 6 19
        dq.removeLast();
        System.out.println(dq);             // 21 2 6
    }

    static void main(String[] args) {
        QueueExamples();
        PriorityQueueExamples();
        DequeExamples();
    }
}
