class ArraysExample {

    void multiArrays() {
        int [][] multiArray = {{56, 43}, {19, 6}, {68, 99}};

        System.out.println(multiArray[0][0]);
        System.out.println(multiArray[0][1]);

        System.out.println(multiArray[1][0]);
        System.out.println(multiArray[1][1]);

        System.out.println(multiArray[2][0]);
        System.out.println(multiArray[2][1]);
    }
}

public class Arrays {
    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
        obj.multiArrays();
    }
}
