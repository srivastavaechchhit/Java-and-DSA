# Java Collections Framework
The Java Collections Framework (JCF) is a unified architecture representing and manipulating collections of data through standardized interfaces, concrete implementations, and algorithms.
<img width="1400" height="775" alt="1_vGt4ZxCjUhiyeEHFFwkujw" src="https://github.com/user-attachments/assets/f4f16a7b-2cde-42f5-8cb5-b0aa5bc62da5" />

---

## Purpose and Need for the Java Collections Framework
  - **Bridge Knowledge Gap:** Provides a unified overview of all interfaces, classes, and utility algorithms inside `java.util.*` rather than learning individual containers in isolation.
  - **Time Constraints in Competitive Programming & Interviews:** In online contests (typically lasting ~2 hours) or technical interviews, implementing complex data structures from scratch is impractical.
  - **Optimized Implementations:** Pre-built, well-tested, and optimized implementations eliminate the need to handle low-level memory reallocations or pointer wiring manually.

---

## Prerequisite Concept: Interfaces in Java

  - **Blueprint of a Class:** An interface enforces consistency across classes by defining the contract of what methods a class must support without dictating how they are implemented.
  - **Real-World Analogy:** In automotive manufacturing, if Engineer 1 writes `class C1` with `stop()`, `moveForward()`, and `getKilometers()`, but Engineer 2 forgets to include `stop()`, safety issues arise. An interface resolves this by enforcing method inclusion across all implementing vehicle types.
  - **Abstract Methods:** Methods declared inside an interface are public and abstract by default (prior to Java 8 default methods), containing signatures without method bodies.
  - **The `implements` Keyword:** Classes bind to an interface contract using `implements` (e.g., `class C1 implements Car`).
  - **Mandatory Rule:** Any class implementing an interface must provide concrete bodies for all inherited abstract methods; otherwise, the compiler raises an error.
  - **Custom Methods:** Implementing classes remain free to declare additional specialized methods (e.g., `openSunRoof()`) beyond the interface contract.

---

## Collections Framework Hierarchy
  - **Super-Interface:** Iterable is the top-level super-interface of the Collection interface.
  - **Sub-Interfaces:** List, Queue, and Set are child interfaces extending Collection (using the extends keyword).
  - **Separate Hierarchy:** The Map interface is completely separate from the Collection interface hierarchy.
  - **Source of Truth:** Official Java documentation (Oracle) is referenced as the primary authoritative source for these hierarchies and methods

---

## Common Methods in the Collection Interface
- All classes implementing Collection (or its sub-interfaces List, Queue, Set) inherit and implement these core methods:
  - `add(element)` – Adds an element to the collection
  - `remove(element)` – Removes an element from the collection
  - `contains(element)` – Checks if an element exists
  - `size()` – Returns the total number of element
  - `clear()` – Removes all elements from the collection
  - `equals(object)` – Checks equality
 
---

## Types of Interfaces & Classes

### List Sub-Interface
Represents a linearly and sequentially ordered collection of elements

**Implementing Classes:**
  - `ArrayList`
    - Dynamic resizing array providing linear storage
  - `LinkedList`
    - Node-based structure where each node stores its value and the memory address of the next node
    - It implements both List and Queue/Deque interfaces
  - `Vector`
    - Implements the List interface
  - `Stack`
    - Implements the List interface
    - Represents a LIFO (Last In First Out) linear data structure
    - Key Stack Methods:
      - `push(e)` – Adds element e to the top
      - `peek()` – Reads the top element without removing it
      - `pop()` – Reads and removes the top element
      - `empty()` – Returns a boolean

---

### Queue Sub-Interface
Represents a FIFO (First In First Out) linear data structure
Structure: Insertions occur at the rear end, and deletions/removals occur at the front (head) end
Methods in Queue
Operation | Throws Exception on Empty Queue | Returns null / false on Empty Queue
|:---|:---|:---|
Insert | add(e) | offer(e) | 
Examine Head | element() | peek()
Remove Head | remove() | poll() |

---

### PriorityQueue Class
Processing in a PriorityQueue is based on priority, not FIFO order
- **Min Priority Queue (Default)**: By default, Java creates a Min Priority Queue, giving higher priority to smaller numbers
- **Max Priority Queue:** Can be created using a custom comparator (Comparator.reverseOrder()) to prioritize larger numbers
- **Syntax**

```java
// Min Priority Queue (Default)
PriorityQueue<Integer> minPQ = new PriorityQueue<>();
minPQ.add(10);
minPQ.add(5);
minPQ.add(7);
System.out.println(minPQ.peek()); // Output: 5
minPQ.poll();                     // Removes 5
System.out.println(minPQ.peek()); // Output: 7

// Max Priority Queue
PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Comparator.reverseOrder());
maxPQ.add(10);
maxPQ.add(5);
maxPQ.add(7);
System.out.println(maxPQ.peek()); // Output: 10
```

---

### Deque Sub-Interface (ArrayDeque)
- **Double-Ended Queue (Deque):** Allows insertion and removal at both ends (rear and front)
  - **Hybrid Capabilities:** Combines the functionality of both a Stack and a Queue
  - **Implementing Class:** ArrayDeque and LinkedList
  - **Key Methods:**
    ```java
    addFirst()
    addLast()
    getFirst()
    getLast()
    pollFirst()
    pollLast()
    peekFirst()
    peekLast()
    ```

---

### Set Sub-Interface
A collection containing no duplicate elements (all values are unique)
Set Implementations & Properties
- **HashSet**
  - Stores an unordered collection of unique elements
  - Uses internal hashing (a secret hash key generated by a hash function for each element)
  - Adding duplicate elements has no effect; duplicates are ignored
  - Time Complexity: $O(1)$ constant time for insertion and lookup operations
  
<br>

- **LinkedHashSet**
  - Maintains unique elements while preserving the order of insertion
  - Uses a combination of a Linked List and a Hash Table internally
    
<br>

- **TreeSet**
  - Implements the SortedSet sub-interface
  - Maintains unique elements in sorted (non-decreasing) order, regardless of insertion order
  - Uses a Self-Balancing Binary Search Tree (Red-Black Tree) internally
  - Time Complexity: $O(\log N)$ logarithmic time

---

### Map Interface
- Stores data in Key-Value pairs
- **Unique Keys:** Keys inside a map must be unique; a single key cannot point to multiple values
- **Data Types:** Any combination of data types can be used for keys and values (e.g., Integer to String, String to String, or custom object types)

---

## Map Implementations
- **HashMap:** Unordered key-value pairs using internal hashing
- **LinkedHashMap:** Key-value pairs that preserve insertion order
- **TreeMap:** Implements the SortedMap sub-interface, maintaining keys in sorted order
- **Hashtable:** Implements the Map interface

---
  
### Map Core Methods
- `put(key, value)` – Inserts or updates a key-value mapping
- `putIfAbsent(key, value)` – Inserts the key-value pair only if the key is not already present
- `get(key)` – Retrieves the value associated with the specified key
- `containsKey(key)` – Returns true if key exists
- `containsValue(value)` – Returns true if value exists
- `entrySet()` – Returns a set view of key-value pairs (Map.Entry) for iteration
- **Syntax**
```java
Map<Integer, String> map = new HashMap<>();
map.put(1, "Aman");
map.put(2, "Rohan");
map.put(3, "Riya");

// Prevents overwriting key 1 if already present
map.putIfAbsent(1, "Priya"); 

// Iterating over Keys
for (var key : map.keySet()) {
    System.out.println(key);
}

// Iterating over Values
for (String val : map.values()) {
    System.out.println(val);
}

// Iterating over Entries (Key-Value Pairs) using 'var' (Java 10+)
for (var entry : map.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}
```

---

## Summary of Time Complexities & Data Structures
|Interface / Class | Ordering / Properties | Underlying Internal Structure | Main Time Complexity|
|:---|:---|:---|:---|
|ArrayList | Linear / Indexed | Dynamic Array | $O(1)$ access by index
|LinkedList | Linear / Sequential | Doubly Linked Nodes | $O(1)$ head/tail operations
|Stack | LIFO | Vector/Array | $O(1)$ push/pop/peek | 
|PriorityQueue |Min/Max Priority | Min/Max Heap | $O(1)$ peek top |
|HashSet | Unordered / Unique | Hash Table (Hashing) | $O(1)$ insertion & search |
|LinkedHashSet | Insertion Order / Unique | Link List + Hash Table | $O(1)$ |
|TreeSet | Sorted Order / Unique | Red-Black Tree (Self-Balancing BST) | $O(log N) |
|HashMap | Unordered Key-Value / Unique Keys | Hash Table | $O(1)$ average |

---
