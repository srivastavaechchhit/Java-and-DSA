package stacks;


public class ArrayImplementation {

    static class Stack {
        int[] arr = new int[5];
        int idx = 0;

        void push(int x) {
            if (isFull()) {
                System.out.println("Stack is Full.");
                return;
            }
            arr[idx++] = x;
        }

        int peek() {
            if (idx == 0) {
                System.out.println("Stack is Empty.");
                return -1;
            }
            return arr[idx-1];
        }

        int pop() {
            if (idx == 0) {
                System.out.println("Stack is Empty.");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }

        void print() {
            for (int i = 0; i <= idx-1; i++)
                System.out.print(arr[i]+ " ");
            System.out.println();
        }

        int size() {
            return idx;
        }

        boolean isEmpty() {
            return idx == 0;
        }

        boolean isFull() {
            return idx == arr.length;
        }
    }

    static void main() {
        Stack st = new Stack();
        st.push(20);
        st.print();         // 20
        st.push(21);
        st.print();         // 20, 21
        st.push(2);
        st.print();         // 20, 21, 2
        st.push(6);
        st.print();         // 20, 21, 2, 6
        st.push(19);
        st.print();         // 20, 21, 2, 6, 19
        System.out.println(st.isFull());    // true
        System.out.println(st.size());      // 5

        st.pop();
        st.print();         // 20, 21, 2, 6
        System.out.println(st.size());  // 4

        System.out.println(st.isEmpty());   // false
    }
}
