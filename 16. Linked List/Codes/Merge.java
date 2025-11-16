/*
    You are given the heads of two sorted linked lists list1 and list2.
    Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
    Return the head of the merged linked list.
 */

package LinkedList.Problems;

public class Merge {
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    static void print(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static ListNode mergeTwoLists(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        ListNode head = new ListNode(100);
        ListNode temp = head;

        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                ListNode ans = new ListNode(temp1.data);
                temp.next = ans;
                temp = ans;
                temp1 = temp1.next;
            } else {
                ListNode ans = new ListNode(temp2.data);
                temp.next = ans;
                temp = ans;
                temp2 = temp2.next;
            }
        }
        if (temp1 == null)
            temp.next = temp2;
        else
            temp.next = temp1;
        return head.next;
    }

    static ListNode mergeTwoLists2(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        ListNode head = new ListNode(100);
        ListNode temp = head;

        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                temp.next = temp1;
                temp = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp = temp2;
                temp2 = temp2.next;
            }
        }
        if (temp1 == null) temp.next = temp2;
        else temp.next = temp1;
        return head.next;
    }

    static void main() {
        ListNode a1 = new ListNode(-3);
        ListNode a2 = new ListNode(1);
        ListNode a3 = new ListNode(2);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;

        ListNode b1 = new ListNode(-6);
        ListNode b2 = new ListNode(-1);
        ListNode b3 = new ListNode(0);
        ListNode b4 = new ListNode(3);
        b1.next = b2;
        b2.next = b3;
        b3.next = b4;

        ListNode ans = mergeTwoLists(a1, b1);
        print(ans);

        ListNode ans2 = mergeTwoLists2(a1, b1);
        print(ans2);
    }
}
