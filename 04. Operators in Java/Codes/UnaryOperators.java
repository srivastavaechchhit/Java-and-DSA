public class UnaryOperators {
  
    public static void main(String[] args) {
        int p = 5, q = 5;

        System.out.println(p++);    //5
        System.out.println(p);      //6

        System.out.println(++q);    //6
        System.out.println(q);      //6

        int a = p++;
        int b = ++q;

        System.out.println(a);  //6
        System.out.println(b);  //7

        System.out.println(p);  //7
        System.out.println(q);  //7
    }
}
