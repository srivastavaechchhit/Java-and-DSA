package JavaCollectionsFramework.MapInterface;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.TreeMap;

public class MapInterface {

    static void HashMapExamples() {
        HashMap<Integer, String> mp = new HashMap<>();
        mp.put(3, "Mani");
        mp.put(1, "Baby");
        mp.put(2, "Love");
        System.out.println(mp);                         // 1.Baby 2.Love 3.Mani
        System.out.println(mp.get(1));                  // Baby
        System.out.println(mp.containsKey(4));          // false
        System.out.println(mp.containsValue("Love"));   // true
        mp.putIfAbsent(2, "Fight");
        System.out.println(mp);                         // 1.Baby 2.Love 3.Mani
        mp.putIfAbsent(4, "Fight");
        System.out.println(mp);                         // 1.Baby 2.Love 3.Mani 4.Fight
        System.out.println(mp.keySet());                // 1 2 3 4
        System.out.println(mp.values());                // Baby, Love, Mani, Fight
        System.out.println(mp.entrySet());              // 1.Baby 2.Love 3.Mani 4.Fight

        // Iterating over keys in a map
        for (Integer i : mp.keySet())
            System.out.print(i+ " ");                   // 1 2 3 4
        System.out.println();

        // Iterating over values in a map
        for (String i : mp.values())
            System.out.print(i+ " ");                   // Baby Love Mani Fight
        System.out.println();

        // Iterating over keys in a map
        for (var i : mp.keySet())
            System.out.print(i+ " ");                   // 1 2 3 4
        System.out.println();

        // Iterating over values in a map
        for (var i : mp.values())
            System.out.print(i+ " ");                   // Baby Love Mani Fight
        System.out.println();

        // Iterating over key and values in a map
        for (var i : mp.entrySet())
            System.out.print(i+ " ");                   // 1.Baby 2.Love 3.Mani 4.Fight
        System.out.println();

        // Iterating over key and values in a map
        for (var i : mp.entrySet()) {
            System.out.print(i.getKey() + " ");         // 1 2 3 4
            System.out.print(i.getValue() + " ");       // Baby Love Mani Fight
            System.out.println();
        }
    }

    static void LinkedHashMapExamples() {
        LinkedHashMap<Integer, String> mp = new LinkedHashMap<>();
        mp.put(3, "Mani");
        mp.put(1, "Baby");
        mp.put(2, "Love");
        System.out.println(mp);                         // 3.Mani 1.Baby 2.Love
        System.out.println(mp.get(1));                  // Baby
        System.out.println(mp.containsKey(4));          // false
        System.out.println(mp.containsValue("Love"));   // true
        mp.putIfAbsent(2, "Fight");
        System.out.println(mp);                         // 3.Mani 1.Baby 2.Love
        mp.putIfAbsent(4, "Fight");
        System.out.println(mp);                         // 3.Mani 1.Baby 2.Love 4.Fight
        System.out.println(mp.keySet());                // 3 1 2 4
        System.out.println(mp.values());                // Mani, Baby, Love, Fight
        System.out.println(mp.entrySet());              // 3.Mani 1.Baby 2.Love 4.Fight

        // Iterating over keys in a map
        for (Integer i : mp.keySet())
            System.out.print(i+ " ");                   // 3 1 2 4
        System.out.println();

        // Iterating over values in a map
        for (String i : mp.values())
            System.out.print(i+ " ");                   // Mani Baby Love Fight
        System.out.println();

        // Iterating over keys in a map
        for (var i : mp.keySet())
            System.out.print(i+ " ");                   // 3 1 2 4
        System.out.println();

        // Iterating over values in a map
        for (var i : mp.values())
            System.out.print(i+ " ");                   // Mani Baby Love Fight
        System.out.println();

        // Iterating over key and values in a map
        for (var i : mp.entrySet())
            System.out.print(i+ " ");                   // 3.Mani 1.Baby 2.Love 4.Fight
        System.out.println();

        // Iterating over key and values in a map
        for (var i : mp.entrySet()) {
            System.out.print(i.getKey() + " ");         // 3 1 2 4
            System.out.print(i.getValue() + " ");       // Mani Baby Love Fight
            System.out.println();
        }
    }

    static void TreeMapExamples() {
        TreeMap<Integer, String> mp = new TreeMap<>();
        mp.put(3, "Mani");
        mp.put(1, "Baby");
        mp.put(2, "Love");
        System.out.println(mp);                         // 1.Baby 2.Love 3.Mani
        System.out.println(mp.get(1));                  // Baby
        System.out.println(mp.containsKey(4));          // false
        System.out.println(mp.containsValue("Love"));   // true
        mp.putIfAbsent(2, "Fight");
        System.out.println(mp);                         // 1.Baby 2.Love 3.Mani
        mp.putIfAbsent(4, "Fight");
        System.out.println(mp);                         // 1.Baby 2.Love 3.Mani 4.Fight
        System.out.println(mp.keySet());                // 1 2 3 4
        System.out.println(mp.values());                // Baby, Love, Mani, Fight
        System.out.println(mp.entrySet());              // 1.Baby 2.Love 3.Mani 4.Fight

        // Iterating over keys in a map
        for (Integer i : mp.keySet())
            System.out.print(i+ " ");                   // 1 2 3 4
        System.out.println();

        // Iterating over values in a map
        for (String i : mp.values())
            System.out.print(i+ " ");                   // Baby Love Mani Fight
        System.out.println();

        // Iterating over keys in a map
        for (var i : mp.keySet())
            System.out.print(i+ " ");                   // 1 2 3 4
        System.out.println();

        // Iterating over values in a map
        for (var i : mp.values())
            System.out.print(i+ " ");                   // Baby Love Mani Fight
        System.out.println();

        // Iterating over key and values in a map
        for (var i : mp.entrySet())
            System.out.print(i+ " ");                   // 1.Baby 2.Love 3.Mani 4.Fight
        System.out.println();

        // Iterating over key and values in a map
        for (var i : mp.entrySet()) {
            System.out.print(i.getKey() + " ");         // 1 2 3 4
            System.out.print(i.getValue() + " ");       // Baby Love Mani Fight
            System.out.println();
        }
    }
    
    static void main(String[] args) {
        HashMapExamples();
        LinkedHashMapExamples();
        TreeMapExamples();
    }
}
