package LinkedList.Problems;

public class Split {

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
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void splitOddEven(ListNode head) {
        if (head == null) {
            System.out.println("Empty List.");
            return;
        }
        if (head.next == null) {
            print(head);
            return;
        }
        ListNode temp = head;
        ListNode tempo = new ListNode(21);
        ListNode t1 = tempo;
        ListNode tempe = new ListNode(20);
        ListNode t2 = tempe;

        while (temp != null) {
            if (temp.data % 2 == 0) {
                tempe.next = new ListNode(temp.data);
                tempe = tempe.next;
            } else {
                tempo.next = new ListNode(temp.data);
                tempo = tempo.next;
            }
            temp = temp.next;
        }
        print(t1.next);
        print(t2.next);
    }

    static void splitOddEven2(ListNode head) {
        if (head == null) {
            System.out.println("Empty List.");
            return;
        }
        ListNode oddHead = null, oddTail = null;
        ListNode evenHead = null, evenTail = null;
        ListNode temp = head;

        while (temp != null) {

            if (temp.data % 2 == 0) {
                // even node
                if (evenHead == null) {
                    evenHead = temp;
                    evenTail = temp;
                } else {
                    evenTail.next = temp;
                    evenTail = evenTail.next;
                }
            } else {
                // odd node
                if (oddHead == null) {
                    oddHead = temp;
                    oddTail = temp;
                } else {
                    oddTail.next = temp;
                    oddTail = oddTail.next;
                }
            }

            temp = temp.next;
        }
        if (oddTail != null) oddTail.next = null;
        if (evenTail != null) evenTail.next = null;
        print(oddHead);
        print(evenHead);
    }

    static void main() {
        ListNode n1 = new ListNode(20);
        ListNode n2 = new ListNode(21);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(6);
        ListNode n5 = new ListNode(3);
        ListNode n6 = new ListNode(19);
        ListNode n7 = new ListNode(26);
        ListNode n8 = new ListNode(28);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        splitOddEven(n1);
        splitOddEven2(n1);
    }
}
