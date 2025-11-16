package LinkedList;

public class Implementation {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    static class linkedList {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) head = temp;
            else tail.next = temp;
            tail = temp;
        }
        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) head = tail = temp;   // empty list
            else {  // non-empty list
                temp.next = head;
                head = temp;
            }
        }
        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (idx == size()) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                insertAtHead(val);
                return;
            } else if (idx < 0 || idx > size()) {
                System.out.println("Index out of Bounds.");
                return;
            }
            for (int i = 1; i <= idx - 1; i++)
                temp = temp.next;
            t.next = temp.next;
            temp.next = t;
        }
        int getAt(int idx) {
            Node temp = head;
            if (idx < 0 || idx >= size()) {
                System.out.println("Index out of Bounds.");
                return -1;
            }
            for (int i = 1; i <= idx; i++)
                temp = temp.next;
            return temp.data;
        }
        void deleteAt(int idx) {
            if (idx == 0) {
                head = head.next;
                return;
            }
            Node temp = head;
            if (idx < 0 || idx > size()) {
                System.out.println("Index out of Bounds.");
                return;
            }
            for (int i = 1; i <= idx-1; i++)
                temp = temp.next;
            temp.next = temp.next.next;
            if (idx == size()-1)
                tail = temp;
        }
        void printLL() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    static void main() {
        linkedList ll = new linkedList();
        ll.insertAtHead(26);
        ll.insertAtHead(2);
        ll.insertAtEnd(21);
        ll.insertAt(1, 20);
        ll.insertAt(4, 6);
        ll.printLL();
        ll.deleteAt(4);
        ll.printLL();}
}
