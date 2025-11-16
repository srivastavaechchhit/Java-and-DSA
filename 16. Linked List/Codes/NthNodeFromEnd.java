package LinkedList.Problems;

public class NthNodeFromEnd {

    static ListNode nthNodeFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int m = size-n+1;
        temp = head;
        for (int i = 1; i<=m; i++)
            temp = temp.next;
        return temp;
    }

    static ListNode nthNodeFromEnd2(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;

        for (int i = 1; i <= n; i++)
            fast = fast.next;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    static class ListNode {
        int data;
        ListNode next;
        ListNode(int data) {
            this.data = data;
        }
    }

    static void main() {
        ListNode n1 = new ListNode(20);
        ListNode n2 = new ListNode(21);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(6);
        ListNode n5 = new ListNode(26);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        System.out.println(nthNodeFromEnd(n1, 2));
        System.out.println(nthNodeFromEnd2(n1, 1));
    }
}
