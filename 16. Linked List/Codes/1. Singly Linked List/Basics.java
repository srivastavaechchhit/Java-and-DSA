public class Basics {

    static class Node {
        int data;       // value
        Node next;      // address of next node
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
        System.out.println(n1.next);
        System.out.println(n2.next);
        System.out.println(n3.next);
        System.out.println(n4.next);
        System.out.println(n5.next);
    }
}
