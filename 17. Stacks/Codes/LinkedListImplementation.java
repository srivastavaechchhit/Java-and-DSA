package Stacks;

public class LinkedListImplementation {

    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    static class LLStack {
        Node head = null;
        int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is Empty!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is Empty!");
                return -1;
            }
            return head.val;
        }

        void printUsingRecursion(Node h) {
            if (h == null) return;
            printUsingRecursion(h.next);
            System.out.print(h.val+ " ");
        }

        void print() {
            printUsingRecursion(head);
            System.out.println();
        }

        void printReverse() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            return size;
        }

        boolean isEmpty() {
            return size == 0;
        }

    }

    static void main() {
        LLStack st = new LLStack();
        st.push(20);
        st.print();         // 20
        st.push(21);
        st.print();         // 20, 21
        st.push(2);
        st.print();         // 20, 21, 2
        st.push(6);
        st.print();         // 20, 21, 2, 6
        st.push(19);
        st.print();         // 20, 21, 2, 6, 19
        System.out.println(st.size());      // 5

        st.pop();
        st.print();         // 20, 21, 2, 6
        System.out.println(st.size());  // 4

        System.out.println(st.isEmpty());   // false
    }
}
