package LinkedList.Problems;

public class CopyRandomList {

    static class ListNode {
        int data;
        ListNode next;
        ListNode random;

        ListNode(int data) {
            this.data = data;
            this.next = null;
            this.random = null;
        }
    }

    static ListNode copyRandomList(ListNode head) {
        ListNode head2 = new ListNode(0);
        ListNode temp2 = head2;
        ListNode temp1 = head;

        // creating deep copy
        while (temp1 != null) {
            ListNode t = new ListNode(temp1.data);
            temp2.next = t;
            temp2 = t;
            temp1 = temp1.next;
        }
        head2 = head2.next;
        temp2 = head2;
        temp1 = head;

        // connecting alternatively
        ListNode temp = new ListNode(-1);
        while (temp1 != null) {
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;

            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }
        temp2 = head2;
        temp1 = head;

        // assigning the random pointers
        while (temp1 != null) {
            if (temp1.random == null) temp2.random = null;
            else temp2.random = temp1.random.next;
            temp1 = temp2.next;
            if (temp1 != null) temp2 = temp1.next;
        }
        temp2 = head2;
        temp1 = head;

        // separating the two lists
        while (temp1 != null) {
            temp1.next = temp2.next;
            temp1 = temp1.next;
            if (temp1 == null) break;
            temp2.next = temp1.next;
            if (temp2.next == null) break;
            temp2 = temp2.next;
        }
        return head2;
    }

    static void print(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void main() {

        // Step 1: Create all ListNodes
        ListNode n1 = new ListNode(7);
        ListNode n2 = new ListNode(13);
        ListNode n3 = new ListNode(11);
        ListNode n4 = new ListNode(10);
        ListNode n5 = new ListNode(1);

        // Step 2: Set next pointers
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        // Step 3: Set random pointers
        n1.random = null;
        n2.random = n1;
        n3.random = n5;
        n4.random = n3;
        n5.random = n1;

        System.out.println("Original List:");
        print(n1);

        System.out.println("Copied List:");
        print(copyRandomList(n1));
    }
}
