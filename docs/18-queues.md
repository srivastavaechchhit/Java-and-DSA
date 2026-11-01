# Queues
  - A **Queue** is a linear data structure that operates strictly on the **FIFO (First In, First Out)** or **LILO (Last In, Last Out)** principle.
  - Elements are added at the rear end and removed from the front end.
  - <img width="600" height="400" alt="java-queue" src="https://github.com/user-attachments/assets/9d90fbaf-fbc3-4e96-9d41-e00b29fedbfb" />

---

## Key Pointers
  - **Front:** The index which elements are peeked, polled, or removed from.
  - **Rear:** The index where new elements are inserted from.

---

## 2. Java Collections Framework (JCF) Queue & Deque
In Java, `Queue` is an interface defined within `java.util`, meaning it cannot be directly instantiated via `new Queue()`. Concrete classes implementing `Queue` include `LinkedList` and `ArrayDeque`.

```java
Queue<Integer> q1 = new LinkedList<>();
Queue<Integer> q2 = new ArrayDeque<>();
```

---

## Method Mappings & Behavior

| Operation | Throws Exception | Returns Special Value (false / null) | Complexity |
| :--- | :--- | :--- | :--- |
| **Insert (Rear)** | `add(e)` | `offer(e)` | $O(1)$ |
| **Remove (Front)** | `remove()` | `poll()` | $O(1)$ |
| **Examine (Front)** | `element()` | `peek()` | $O(1)$ |
| **Size** | `size()` | `isEmpty()` | $O(1)$ |

**Note:** Because traversing a queue directly via polling empties the data structure, a helper queue must be used to transfer, display, and restore elements back into the original queue without altering its state.

---

## Types of Implementations

### Linear Array Based Queue
  - Maintains `arr[]`, `front = -1`, `rear = -1`, and tracking variable `size = 0`.
  - **Limitations:**
    - Once `rear` hits the last index in array, adding elements trigger a false overflow condition, even if some elements have already been dequeued from `front`.

### Circular Array Based Queue
  - Connects the end of the ending array back to index 0.
  - Prevents memory wastage by reusing empty slots at the beginning of the array.

### Linked List Based Queue
  - Employs singly linked nodes holding `data` and a `next` pointer.
  - Tracks `head` (acting as front) and `tail` (acting as rear).
  - Addition executes at `tail` in $O(1)$; deletion executes at `head` in $O(1)$.
  - Memory expands dynamically without fixed capacity limitations.

### Double-Ended Queue (Deque)
  - Supports bidirectional insertion and deletion
    
    ```java
    
    addFirst()
    addLast()
    removeFirst()
    removeLast()
    getFirst()
    getLast()
    
    ```

---
