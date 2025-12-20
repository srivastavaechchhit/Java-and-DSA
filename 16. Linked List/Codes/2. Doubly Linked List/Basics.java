package DoublyLinkedList;

public class Basics {

    static class ListNode {
        int data;
        ListNode next;
        ListNode prev;
        ListNode(int data) {
            this.data = data;
        }
    }

    static void printByHeadNode(ListNode head) {
        ListNode temp = head;
        while(temp != null) {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void printByTailNode(ListNode tail) {
        ListNode temp = tail;
        while(temp != null) {
            System.out.print(temp.data+ " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    static void printByRandomNode(ListNode random) {
        ListNode temp = random;
        while(temp.prev != null)
            temp = temp.prev;
        printByHeadNode(temp);
    }

    static void main(String[] args) {
        ListNode n1 = new ListNode(20);
        ListNode n2 = new ListNode(21);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(6);
        ListNode n5 = new ListNode(26);
        ListNode n6 = new ListNode(28);

        n1.prev = null;
        n1.next = n2;
        n2.prev = n1;
        n2.next = n3;
        n3.prev = n2;
        n3.next = n4;
        n4.prev = n3;
        n4.next = n5;
        n5.prev = n4;
        n5.next = n6;
        n6.prev = n5;
        n6.next = null;

        printByHeadNode(n1);
        printByTailNode(n6);
        printByRandomNode(n4);
    }
}
