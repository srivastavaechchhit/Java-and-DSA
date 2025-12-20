package DoublyLinkedList;

public class Implementation {

    static class ListNode {
        ListNode prev;
        int data;
        ListNode next;
        ListNode(int data) {
            this.data = data;
        }
    }

    static class DoublyLL {

        ListNode head = null;
        ListNode tail = null;
        int size = 0;

        void insertAtHead(int val) {
            ListNode temp = new ListNode(val);

            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
            size++;
        }

        void insertAtTail(int val) {
            ListNode temp = new ListNode(val);
            if(head == null) head = temp;
            else {
                tail.next = temp;
                temp.prev = tail;
            }
            tail = temp;
            size++;
        }

        void insertAt(int idx, int val) {
            if (idx < 0 || idx > size) {
                System.out.println("Index out of bounds.");
                return;
            }
            if (idx == 0) {
                insertAtHead(val);
                return;
            }
            if (idx == size) {
                insertAtTail(val);
                return;
            }
            ListNode t = new ListNode(val);
            ListNode temp = head;
            for (int i = 0; i < idx-1; i++)
                temp = temp.next;

            t.next = temp.next;
            t.prev = temp;

            temp.next.prev = t;
            temp.next = t;

            size++;
        }

        void deleteAt(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Index out of Bounds.");
                return;
            }
            if (size == 1) {
                head = tail = null;
                size--;
                return;
            }
            if (idx == 0) {
                head = head.next;
                head.prev = null;
                size--;
                return;
            }
            if (idx == size - 1) {
                tail = tail.prev;
                tail.next = null;
                size--;
                return;
            }
            ListNode temp = head;
            for (int i = 0; i < idx - 1; i++)
                temp = temp.next;

            temp.next = temp.next.next;
            temp.next.prev = temp;
            size--;
        }

        int getAt(int idx) {
            ListNode temp = head;
            if (idx < 0 || idx >= size) {
                System.out.println("Index out of Bounds.");
                return -1;
            }
            for (int i = 1; i <= idx; i++)
                temp = temp.next;
            return temp.data;
        }

        void print() {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void print2() {
            ListNode temp = tail;
            while (temp != null) {
                System.out.print(temp.data+ " ");
                temp = temp.prev;
            }
            System.out.println();
        }
   }

    static void main() {
        DoublyLL ll = new DoublyLL();
        ll.insertAtHead(2);
        ll.insertAtHead(20);
        ll.insertAtTail(26);
        ll.insertAtTail(28);
        ll.insertAt(1, 21);
        ll.insertAt(3, 6);
        ll.print();
        ll.deleteAt(2);
        ll.print();
        System.out.println(ll.getAt(4));
    }
}
