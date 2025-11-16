/*
    Given the head of a singly linked list, return the middle node of the linked list.
    If there are two middle nodes, return the second middle node.
 */

public class MiddleNode {

    static class ListNode {
        int data;
        ListNode next;
        ListNode(int data) {
            this.data = data;
        }
    }
    static ListNode getMiddleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static void main() {
        ListNode n1 = new ListNode(20);
        ListNode n2 = new ListNode(21);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(6);
        ListNode n5 = new ListNode(26);
        ListNode n6 = new ListNode(19);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        ListNode ans = getMiddleNode(n1);
        System.out.println("Middle element: " +ans.data);
    }
}
