public class Parameters {

    static void changeValue(int a) {
        a *= 100;
        System.out.println("Inside change value method: " +a);  // 2000
    }

    public static void main(String[] args) {
        int x = 20;

        System.out.println("Value before change: " +x); // 20
        changeValue(x);
        System.out.println("Value after change: " +x);  // 20
    }
}
// Java has a Pass by Value and not Pass by Reference
