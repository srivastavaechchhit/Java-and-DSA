package Queues;

public class LinkedlistImplementation {

    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    static class Queue {
        Node head = null;
        Node tail = null;
        int size = 0;

        void add(int x) {
            Node temp = new Node(x);
            if (size == 0)
                head = tail = temp;
            else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        int peek() {
            if (size == 0) {
                System.out.print("Queue is Empty!");
                return -1;
            }
            return head.val;
        }

        int poll() {
            if (size == 0) {
                System.out.print("Queue is Empty!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        void print() {
            if (size == 0) {
                System.out.print("Queue is Empty!");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val+ " ");
                temp = temp.next;
            }
            System.out.println();
        }

        boolean isEmpty() {
            return size == 0;
        }
    }

    static void main() {
        Queue q = new Queue();
        q.print();                          // Queue is Empty!
        System.out.println(q.isEmpty());    // true
        q.add(20);
        q.add(21);
        System.out.println(q.isEmpty());    // false
        q.add(2);
        q.add(6);
        q.add(19);
        q.print();                          // 20 21 2 6 19
        System.out.println(q.peek());       // 20
        q.poll();
        q.print();                          // 21 2 6 19
        System.out.println(q.peek());       // 21
        System.out.println(q.size);
    }
}
