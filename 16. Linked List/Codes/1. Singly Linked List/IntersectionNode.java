/*
    Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect.
    If the two linked lists have no intersection at all, return null.
 */

public class IntersectionNode {

    static class linkedList {
        Node head;
        Node tail;

        void add(int val) {
            Node temp = new Node(val);
            if (head == null)
                head = temp;
            else
                tail.next = temp;
            tail = temp;
        }
    }

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node getIntersectionNode(Node headA, Node headB) {
        Node tempA = headA;
        Node tempB = headB;
        int lengthA = 0;
        while (tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }
        int lengthB = 0;
        while (tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if (lengthA > lengthB) {
            int steps = lengthA - lengthB;
            for (int i = 1; i <= steps; i++)
                tempA = tempA.next;
        } else {
            int steps = lengthB - lengthA;
            for (int i = 1; i<= steps; i++)
                tempB = tempB.next;
        }
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }

    static void main() {
        linkedList list1 = new linkedList();
        list1.add(20);
        list1.add(2);
        list1.add(17);

        linkedList list2 = new linkedList();
        list2.add(20);
        list2.add(2);

        Node intersectVal1 = new Node(19);
        intersectVal1.next = new Node(26);
        intersectVal1.next.next = new Node(28);

        list1.tail.next = intersectVal1;
        list2.tail.next = intersectVal1;

        print(list1.head);
        print(list2.head);

        Node ans = getIntersectionNode(list1.head, list2.head);
        if (ans != null)
            System.out.println("Intersected at '" +ans.data+ "'");
        else System.out.println("No intersection");
    }
}
