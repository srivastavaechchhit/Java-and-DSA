class ArraysExample {

    void demoArrays() {

        int [] ages = new int[3];
        float [] weights = new float[3];
        String [] names = new String[3];

        ages[0] = 10;
        ages[1] = 12;
        ages[2] = 18;

        weights[0] = 24.6f;
        weights[1] = 35.9f;
        weights[2] = 55.4f;

        names[0] = "Rohan";
        names[1] = "Rahul";
        names[2] = "Aman";

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println(weights[0]);
        System.out.println(weights[1]);
        System.out.println(weights[2]);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }
}

public class Arrays {
  
    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
        obj.demoArrays();
    }
}
