# HashMaps

- A **HashMap** is a fundamental data structure in Java that stores data in **key-value pairs** (mappings).
- It is designed to map a unique key to a specific value.
- <img width="1081" height="394" alt="HashMap" src="https://github.com/user-attachments/assets/4311d2c2-a898-49d3-8759-d0a7195a9510" />

---

## Fundamentals of HashMap
- **Key-Value Pair Structure**
  - Each entry in a HashMap consists of a **key** and an associated **value**.
- **Uniqueness Constraints**
  - **Keys must always be unique** within a HashMap.
  - If a duplicate key is inserted, it overwrites/updates the existing value associated with that key.
  - **Values can be duplicated** across different keys.
- **Null Constraints**
  - A HashMap allows at most **one `null` key**, but it can store **multiple `null` values**.
- **Ordering**
  - HashMaps are **unordered** data structures.
  - They do not preserve the insertion order of elements nor do they sort elements by default.
- **Time Complexity**
  - HashMaps provide **\(O(1)\) constant time complexity** on average for basic operations like insertion (`put`), lookup (`get`), search (`containsKey`), and deletion (`remove`).

---

## Java Collection Framework & Map Hierarchy

HashMap is a concrete class in Java belonging to the `java.util` package that implements the `Map` interface.
- **HashMap**
  - Implements the `Map` interface using a hash table internally.
  - Provides no guarantees on element ordering.
- **LinkedHashMap**
  - Implements the `Map` interface using a combination of a **LinkedList + HashTable**.
  - It maintains the **insertion order** of elements.
- **TreeMap**
  - Implements the `SortedMap` sub-interface.
  - Stores elements in a **sorted order** based on their keys.
- **Hashtable**
  - Legacy class implementing the `Map` interface.

---

## Key HashMap Operations & Java Syntax

### Declaration & Instantiation
HashMaps support generic types for both keys (`K`) and values (`V`):
```java
HashMap<String, Integer> map = new HashMap<>();
```

### Essential Methods
- **`put(K key, V value)`**
  - Inserts the key-value pair into the map.
  - If the key is already present, it updates the associated value.
  - Returns `null` if the key was new, or the previous value if updating an existing key.
- **`get(Object key)`**
  - Retrieves the value associated with the specified key.
  - Returns `null` if the key does not exist in the map.
- **`containsKey(Object key)`**
  - Returns `true` if the key exists in the map, otherwise `false`.
  - Runs in \(O(1)\) time.
- **`containsValue(Object value)`**
  - Checks if a value exists in the map.
  - Unlike `containsKey`, this requires inspecting values.
  - Runs in \(O(N)\) linear time.
- **`remove(Object key)`**
  - Removes the key-value mapping for the given key.
  - Returns the removed value or `null` if the key was absent.
- **`putIfAbsent(K key, V value)`**
  - Inserts the key-value pair only if the specified key is not already present in the map.

### View Collections & Iteration
- **`keySet()`**
  - Returns a `Set` view containing all unique keys in the map.
- **`values()`**
  - Returns a `Collection` view containing all values in the map.
- **`entrySet()`**
  - Returns a `Set` view containing all `Map.Entry<K, V>` key-value mappings.

### Traversing a HashMap

```java
// Method 1: Iterating over keySet()
for (String key : map.keySet()) {
    System.out.println(key + " -> " + map.get(key));
}

// Method 2: Iterating over entrySet()
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}

// Method 3: Using 'var' keyword
for (var entry : map.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}
```

---

## Internal Working & Hashing Architecture

Internally, a HashMap utilizes an **array of buckets** (also called a bucket array or table), where each index holds bucket nodes containing keys and values.

```
Key (Object) ---> Hash Function ---> Hash Value ---> Bucket Array [ Index ]
```

### Hashing & Hash Functions
- **Hashing** is the process of converting an arbitrary-sized key (string, large integer, custom object) into a smaller integer hash code using a **Hash Function**.
- Properties of a Hash Function \(H(K)\):
  - **Determinism**
    - Passing the exact same input to the hash function will always produce the exact same output every single time.
  - **Fixed Range**
    - Output hash indices must fall within the valid bounds \([0, M-1]\) of the bucket array of size \(M\).
- **Common Hash Function Methods:**
  - **Division Method**
    - $H(K) = K \pmod M$, where $M$ is the size of the bucket array.
  - **Mid-Square Method**
    - Square the key ($K^2$) and extract middle digits as the hash code.
  - **Folding Method**
    - Split the key into equal-sized segments, sum the segments, and take the modulo.
  - **Multiplication Method**
    - Multiply key \(K\) by a constant fraction \(A\), extract the fractional part, multiply by array size \(M\), and floor the result.

### Computing Bucket Index
In Java, the internal bucket index for a key is derived as:
$$\text{Index} = |\text{key.hashCode()}| \pmod{\text{capacity}}$$ <br>
Using the absolute value ensures non-negative array indices.

---

## Collision Handling Mechanisms

A Collision occurs when two distinct keys $K_1 \neq K_2$ yield the exact same bucket index after hashing $(H(K_1) = H(K_2))$

```
Collision Example:
Key 11 ---> H(11) = 2  ---|---> Bucket Array Index 2 (Conflict!)
Key 20 ---> H(20) = 2  ---|
```

---

## Collision Resolution Strategies

### Separate Chaining (Open Hashing / Closed Addressing)
- The bucket array is defined as an **array of Linked Lists** (`LinkedList<Node>[]`).
- Each bucket index points to the head of a linked list.
- When multiple keys collide at the same index, their key-value pairs are appended to the linked list at that index.
- **Operations under Chaining**:
  - **`put`**
    - Hashes key $(\rightarrow\)$ gets bucket index $(\rightarrow\)$ traverses linked list at bucket $(\rightarrow\)$ if key found, updates value; if key not found, appends new node.
  - **`get`**
    - Hashes key $(\rightarrow\)$ gets bucket index $(\rightarrow\)$ traverses linked list $(\rightarrow\)$ returns value if key matches, else `null`.
  - **`remove`**
    - Hashes key $(\rightarrow\)$ gets bucket index $(\rightarrow\)$ unlinks matching node from list.

### Open Addressing (Closed Hashing)
All entries are stored directly inside the bucket array itself without external linked lists. When a collision occurs, alternative vacant slots in the array are probed:
- **Linear Probing**
  - Searches sequentially for the next free slot: $(\text{Index} = (H(K) + i) \pmod M\)$ for $(i = 0, 1, 2, \dots\)$.
- **Quadratic Probing**
  - Searches using quadratic steps: $(\text{Index} = (H(K) + i^2) \pmod M\)$.
- **Double Hashing**
  - Uses a second hash function $(H_2(K)\)$ to determine the probe step size: $(\text{Index} = (H_1(K) + i \cdot H_2(K)) \pmod M\)$.

---

## Rehashing & Load Factor Dynamics

If the number of entries $(N\)$ increases while the bucket array size $(M\)$ remains fixed, linked lists grow longer, causing performance to degrade from $(O(1)\$ toward $(O(N)\)$. To prevent this, Java uses **Rehashing**.

### Load Factor $(\lambda\)$ & Threshold
- **Load Factor $(\lambda\)$**
  - The ratio of total number of entries $(N\)$ to current bucket array capacity $(M\)$:
  $[\lambda = \frac{N}{M} = \frac{\text{Total Entries}}{\text{Bucket Capacity}}\]$
- **Default Values**
  - Default Initial Capacity $(M\)$ = **16**.
  - Default Load Factor $(\lambda\)$ = **0.75** (75%).
- **Threshold**
  - Maximum entries allowed before triggering resize
  $[\text{Threshold} = \text{Load Factor} \times \text{Capacity} = 0.75 \times M\]$

### The Rehashing Process
When $(N > \text{Threshold}\)$ (e.g., insertion of the 76th element when capacity is 100):
- **Capacity Doubling**
  - The capacity of the bucket array is doubled $(M_{\text{new}} = 2 \times M_{\text{old}}\)$.
- **Re-insertion**
  - Old entries are extracted from the old array, re-hashed using the new array length, and placed into new bucket indices.
- **Performance Preservation**
  - Doubling capacity reduces the average nodes per bucket $(\lambda\)$, maintaining $O(1)\$ lookup times.

---
