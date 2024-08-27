public class LogicalOperators {
  
    public static void main(String[] args) {
        int p = 15, q = 10, r = 5;

        // Examples of && operator
        System.out.println((p>q) && (p>r)); // true
        System.out.println((p>q) && (p<r)); // false

        // Examples of || operator
        System.out.println((r<q) || (p<q)); //true
        System.out.println((p>q) || (q>r)); // true
        System.out.println((p<q) || (q<r)); // false

        // Examples of ! operator
        System.out.println(!(p==q));    //true
        System.out.println(!(p>q));     //false
    }
}
