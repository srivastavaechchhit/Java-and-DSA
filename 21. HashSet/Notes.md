# HashSet
- A `HashSet` is a data structure in Java used when **uniqueness** is required.
- It functions like a mathematical "bag" or set where duplicate elements cannot be stored.
- If an element is added multiple times, only one copy is retained.
- Used when there is no need to map keys to values, but we need to store unique elements and perform constant-time search, insertion, and deletion.

---

## Key Properties
- **O(1) Time Complexity**
  - Core operations including insertion (`add`), deletion (`remove`), search (`contains`), and size checking (`size`) execute in **O(1) constant time**.
- **Unordered Collection**
  - Elements in a `HashSet` do not preserve any specific order or insertion sequence.
- **Internal Hashing Mechanism**
  - Similar to `HashMap`, `HashSet` uses internal hashing.
  - An element is passed through a hash function to generate a hash value, which determines the bucket index where the element (key) is stored.
- **Memory Efficiency**
  - Because it stores only single elements (keys) rather than key-value pairs, it is more memory-efficient than a `HashMap` when values are not needed.

---

## HashSet vs HashMap Comparison
| Property | HashSet | HashMap |
| :--- | :--- | :--- |
| **Data Stored** | Stores only unique keys/elements. | Stores `(key, value)` pairs. |
| **Use Case** | Used when maintaining uniqueness and performing fast lookups. | Used when mapping unique keys to specific values. |
| **Internal Storage** | Internally stores only keys. | Internally stores key-value pairs. |
| **Time Complexity** | O(1) for `add`, `remove`, `contains`. | O(1) for `put`, `remove`, `get`. |

---

## Collection Framework Hierarchy (`Set` Interface)
- `HashSet` is part of the Java Collection Framework and implements the `Set` interface.
- The `Set` interface has three primary class implementations:
  - **`HashSet`**
    - **Ordering**: Unordered.
    - **Performance**: O(1) average time complexity for core operations.
    - **Underlying Mechanism**: Internal Hashing.
  - **`LinkedHashSet`**:
    - **Ordering**: Preserves **insertion order** (retrieves elements in the exact order they were inserted).
    - **Use Case**: Used when uniqueness is needed along with predictable iteration order.
  - **`TreeSet`**:
    - **Ordering**: Maintains elements in **sorted order**.
    - **Underlying Mechanism**: Implements the `SortedSet` interface using a **Self-Balancing Binary Search Tree** (specifically a **Red-Black Tree**).
    - **Trade-off**: Operations take higher time complexity (O(log N)) due to tree balancing, so normal `HashSet` is preferred unless sorted order is explicitly required.

---

## Syntax

```java
import java.util.HashSet;

public class HashSetBasics {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> set = new HashSet<>();

        // 1. add(element): Adds an element (duplicates are automatically ignored)
        set.add("James");
        set.add("John");
        set.add("James"); // Duplicate element, ignored

        // 2. contains(element): Checks if an element exists in O(1) time
        boolean hasJohn = set.contains("John"); // returns true

        // 3. remove(element): Removes the specified element
        set.remove("John");

        // 4. size(): Returns the total count of unique elements
        int count = set.size();

        // 5. Iterating through a HashSet
        for (String name : set) {
            System.out.println(name);
        }
    }
}
```

---
