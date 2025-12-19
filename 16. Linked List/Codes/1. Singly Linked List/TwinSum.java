package LinkedList.Problems;

public class TwinSum {

    static class ListNode {
        int data;
        ListNode next;
        ListNode(int data) {
            this.data = data;
        }
    }

    static ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode after = null;

        while (curr != null) {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }

    static int maxTwinSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverse(slow.next);
        ListNode p1 = head;
        ListNode p2 = slow.next;
        int maxSum = Integer.MIN_VALUE;

        while (p2 != null) {
            int sum = p1.data + p2.data;
            if (sum > maxSum) maxSum = sum;
            p1 = p1.next;
            p2 = p2.next;
        }
        return maxSum;
    }

    static void main() {
        ListNode n1 = new ListNode(20);
        ListNode n2 = new ListNode(21);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(19);
        ListNode n5 = new ListNode(6);
        ListNode n6 = new ListNode(26);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        int ans = maxTwinSum(n1);
        System.out.println("Maximum twin sum: " +ans);
    }
}
