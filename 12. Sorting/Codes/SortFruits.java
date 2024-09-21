public class SortFruits {

    static void printArray(String[] arr) {
        for (String strings : arr)
            System.out.print(strings+ " ");
        System.out.println();
    }

    static void swapInArray(String[] fruits, int i, int j) {
        String temp = fruits[i];
        fruits[i] = fruits[j];
        fruits[j] = temp;
    }

    static void sortFruits(String[] fruits) {
        int n = fruits.length;
        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if (fruits[j].compareTo(fruits[min_index]) < 0)
                    min_index = j;
            }
            if (min_index != i)
                swapInArray(fruits, i, min_index);
        }
    }

    public static void main(String[] args) {
        String[] fruits = {"papaya", "lime", "watermelon", "apple", "mango", "kiwi"};

        System.out.println("Original:");
        printArray(fruits);
        sortFruits(fruits);
        System.out.println("Sorted:");
        printArray(fruits);
    }
}
