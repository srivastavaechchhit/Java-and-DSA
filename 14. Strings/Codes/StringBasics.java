public class StringBasics {
    static void main() {

        String str = "Hello";

        System.out.println(str.charAt(0));                      // H
        System.out.println(str.length());                       // 5
        System.out.println(str.indexOf('e'));                   // 1
        System.out.println(str.compareTo("Mello"));             // -5
        System.out.println(str.contains("o"));                  // true
        System.out.println(str.startsWith("Hel"));              // true
        System.out.println(str.endsWith("low"));                // false
        System.out.println(str.toLowerCase());                  // hello
        System.out.println(str.toUpperCase());                  // HELLO
        System.out.println(str.concat("World"));                // HelloWorld
        System.out.println(str.substring(0, 3));                // Hel
        System.out.println(str.substring(3));                   // lo
        System.out.println("Hello" + 10);                       // Hello10
        System.out.println("Hello" + 'C');                      // HelloC
        System.out.println("Hello" + "World");                  // HelloWorld
        System.out.println(20 + 21 + "World");                  // 41World
        System.out.println("Hello" + 20 + 21);                  // Hello2021
        System.out.println("Hello" + (20 + 21));                // Hello41
        System.out.println("Hello" + "World" + 'C' + 10);       // HelloWorldC10
    }
}
