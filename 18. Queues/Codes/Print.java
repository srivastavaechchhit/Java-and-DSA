package Queues;
import java.util.Queue;
import java.util.ArrayDeque;

public class Print {
    static void main() {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(20);
        q.add(21);
        q.add(2);
        q.add(6);
        q.add(19);

        Queue<Integer> helper = new ArrayDeque<>();
        while (!q.isEmpty()) {
            System.out.print(q.element()+ " ");
            helper.add(q.poll());
        }
        while (!helper.isEmpty())
            q.add(helper.poll());
    }
}
