/*
    Write a program to delete the nth node from the given Linked List.
    You will only be provided with the node to be deleted and not the head.
    Also, the node to be deleted is not the last node.
 */

package LinkedList.Problems;

public class DeleteNode {

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

    static void deleteNode(ListNode node) {
        node.data = node.next.data;
        node.next = node.next.next;
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
        deleteNode(n4);
        print(n1);
    }
}
