package queues;


public class ArrayImplementation {
    static class Queue {
        int r = -1;
        int f = -1;
        int size = 0;
        int[] arr = new int[100];

        void add(int val) {
            if (r == arr.length-1){
                System.out.println("Queue is Full!");
                return;
            }
            if (f == -1) {
                f = r = 0;
                arr[0] = val;
            }
            else arr[++r] = val;
            size++;
        }

        int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }

        int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[f];
        }

        boolean isEmpty() {
            return size == 0;
        }

        void print() {
            if (size == 0)
                System.out.println("Queue is Empty!");
            else {
                for (int i = f; i <= r; i++)
                    System.out.print(arr[i]+ " ");
                System.out.println();
            }
        }
    }
    static void main() {
        Queue q = new Queue();
        q.print();      // Queue if Empty!
        q.add(20);;
        q.add(21);;
        q.add(2);;
        q.add(6);;
        q.add(19);
        q.print();      // 20 21 2 6 19
        q.remove();
        q.print();      // 21 2 6 19
    }
}
