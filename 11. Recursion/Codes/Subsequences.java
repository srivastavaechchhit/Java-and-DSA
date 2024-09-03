import java.util.ArrayList;
import java.util.Scanner;

public class Subsequences {

    static ArrayList<String> getSSQ(String str) {
        ArrayList<String> ans = new ArrayList<>();

        if (str.isEmpty()) {
            ans.add("");
            return ans;
        }

        char curr = str.charAt(0);

        for (String ss : getSSQ(str.substring(1))) {
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;
    }

    static void printSSQ(String str, String currAns) {

        if (str.isEmpty()) {
            System.out.println(currAns);
            return;
        }

        char curr = str.charAt(0);

        printSSQ(str.substring(1), currAns + curr);  // include current char
        printSSQ(str.substring(1), currAns);  // exclude current char
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word:");
        String str = sc.next();

        System.out.println(getSSQ(str));
        printSSQ(str, "");
    }
}
