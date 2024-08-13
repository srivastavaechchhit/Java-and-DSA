public class SearchInArray {

    static void searchInArray() {

        int[] arr = {20, 21, 2, 6, 19};
        int value = 6;
        int ans = -1;

        for (int i = 0; i <arr.length; i++) {
            if (arr[i] == value)
                ans = i;
        }
        if (ans != -1)
            System.out.println("Found at Index " +ans);
        else System.out.println("Not found " +(-1));
    }

    public static void main(String[] args) {
        searchInArray();
    }
}