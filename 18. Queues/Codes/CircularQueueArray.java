package Queues;

public class CircularQueueArray {

    static class CircularQueue {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];

        void add(int val) throws Exception {
            if (size == arr.length)
                throw new Exception("Queue is Full!");
            else if (size == 0) {
                front = rear = 0;
                arr[0] = val;
            }
            else if (rear < arr.length-1)
                arr[++rear] = val;
            else if (rear == arr.length-1) {
                rear = 0;
                arr[0] = val;
            }
            size++;
        }

        int poll() throws Exception {
            if (size == 0)
                throw new Exception("Queue is Empty!");
            else {
                int val = arr[front];
                if (front == arr.length-1) front = 0;
                else front++;
                size--;
                return val;
            }
        }

        int element() throws Exception {
            if (size == 0)
                throw new Exception("Queue is Empty!");
            else return arr[front];
        }

        boolean isEmpty() {
            return size == 0;
        }

        void print() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return;
            }
            else if (front <= rear) {
                for (int i = front; i <= rear; i++)
                    System.out.print(arr[i]+ " ");
            }
            else {
                for (int i = front; i < arr.length; i++)
                    System.out.print(arr[i]+ " ");
                for (int i = 0; i <= rear; i++)
                    System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }

    }

    static void main() throws Exception {
        CircularQueue cq = new CircularQueue();
        cq.print();     // Queue is Empty!
        cq.add(20);
        cq.add(21);
        cq.add(2);
        cq.add(6);
        cq.print();     // 20, 21, 2, 6
        cq.poll();
        cq.print();     //     21, 2, 6
        cq.add(19);
        cq.print();     //     21, 2, 6, 19
        cq.add(23);
        cq.print();     // 23, 21, 2, 6, 19 --> 21, 2, 6, 19, 23
    }
}
