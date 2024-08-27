public class AssignmentOperators {
  
    public static void main(String[] args) {
        int p = 10, q;

        // Use of '='
        q = p;
        System.out.println(q);  //10

        // Use of '+='
        p += q; // p = p + q, p = 10, q = 10, p = 20
        System.out.println(p);  //20

        // Use of '-='
        p -= q; // p = p - q, p = 20, q = 10, p = 10
        System.out.println(p);  //10

        // Use of '*='
        p *= q; //p = p * q, p = 10, q = 10, p = 100
        System.out.println(p);  //100

        // Use of '/='
        p /= q; // p = p / q, p = 100, q = 10, p = 10
        System.out.println(p);  //10

        // Use of '%='
        p %= q; // p = p % q, p = 10, q = 10, p = 0
        System.out.println(p);  //0
    }
}
