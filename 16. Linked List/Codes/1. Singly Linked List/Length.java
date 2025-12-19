public class Length {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    static int length(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    static int recursiveLength(Node head) {
        if (head == null) return 0;
        return 1 + recursiveLength(head.next);
    }

    static void main() {
        Node n1 = new Node(20);
        Node n2 = new Node(21);
        n1.next = n2;
        Node n3 = new Node(2);
        n2.next = n3;
        Node n4 = new Node(6);
        n3.next = n4;
        Node n5 = new Node(26);
        n4.next = n5;

        System.out.println("Length: " +length(n1));
        System.out.println("Length: " +recursiveLength(n1));
    }
}
