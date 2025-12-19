/*
    Given the head of a linked list, remove the nth node from the end of the list and return its head.
    Input: head = [1,2,3,4,5], n = 2
    Output: [1,2,3,5]
 */

public class DeleteNthFromEnd {

    static class ListNode {
        int data;
        ListNode next;
        ListNode(int data) {
            this.data = data;
        }
    }

    static void print(ListNode head) {
        ListNode temp = head;
        if (temp == null) return;
        System.out.print(temp.data+ " ");
        print(temp.next);
    }

    static ListNode deleteNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 1; i <= n; i++)
            fast = fast.next;
        if (fast == null) {
            head = head.next;
            return head;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
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
        print(n1);
        System.out.println();
        print(deleteNthFromEnd(n1, 5));
    }
}
