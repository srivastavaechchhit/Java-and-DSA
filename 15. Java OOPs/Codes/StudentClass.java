public class StudentClass {

    static class Student {
        String name;
        int rollNo;
        double percent;
    }

    static class Car {
        String name;
        String type;
        int price;
    }
    static void main() {

        Student s1 = new Student();     // Declaration
        // Initialization
        s1.name = "Mani";
        s1.rollNo = 20;
        s1.percent = 96.72;
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.percent);

        Student s2 = new Student();     // Declaration
        // Initialization
        s2.name = "Bandar";
        s2.rollNo = 21;
        s2.percent = 64.21;
        System.out.println(s2.name);
        System.out.println(s2.rollNo);
        System.out.println(s2.percent);

        Car c1 = new Car();
        c1.name = "Alto";
        c1.type = "Hatchback";
        c1.price = 400000;
        System.out.println(c1.name);
        System.out.println(c1.type);
        System.out.println(c1.price);

        Car c2 = new Car();
        c2.name = "Verna";
        c2.type = "Sedan";
        c2.price = 1000000;
        System.out.println(c2.name);
        System.out.println(c2.type);
        System.out.println(c2.price);
    }
}
