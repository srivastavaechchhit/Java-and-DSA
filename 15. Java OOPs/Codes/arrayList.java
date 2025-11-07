import java.util.Arrays;

public class arrayList {

    static class ArrayList {
        int[] arr = new int[5];
        int idx = 0;
        int size = 0;

        void add(int elt) {
            if (size == arr.length) {
                int[] brr = Arrays.copyOf(arr, arr.length * 2);
                arr = new int[brr.length];
                arr = Arrays.copyOf(brr, brr.length);
            }
            arr[idx] = elt;
            idx++;
            size++;
        }

        void set(int idx, int val) {
            arr[idx] = val;
        }
    }

    static void main() {
        ArrayList arr = new ArrayList();
        arr.add(20);
        arr.add(21);
        System.out.println(arr.size);
        arr.add(3);
        System.out.println(arr.size);
    }
}
