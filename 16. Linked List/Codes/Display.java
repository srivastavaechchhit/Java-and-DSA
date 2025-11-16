package LinkedList;

public class Display {
    static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }
    static void recursiveDisplayLL(Node head) {
        if (head == null) return;
        System.out.print(head.data+ " ");
        recursiveDisplayLL(head.next);
    }
    static void printReverseLL(Node head) {
        if (head == null) return;
        printReverseLL(head.next);
        System.out.print(head.data+ " ");
    }
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    static void main() {
        Node n1 = new Node(20);
        Node n2 = new Node(21);
        Node n3 = new Node(2);
        Node n4 = new Node(6);
        Node n5 = new Node(26);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        recursiveDisplayLL(n1);
        System.out.println();
        printReverseLL(n1);
    }
}
