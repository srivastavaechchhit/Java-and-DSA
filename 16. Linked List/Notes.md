# Linked List

A **Linked List** is a linear data structure where elements are stored in **nodes**, and each node contains:

- **data**
- reference to the **next** node.
<img width="812" height="221" alt="LLdrawio" src="https://github.com/user-attachments/assets/1dda7a56-134a-455d-8f7c-217c2f16f230" />

---

## Features of Linked List

- Dynamic size
- Efficient insertion & deletion (no shifting like arrays)
- Flexible memory usage

---

## Types of Linked Lists

- **Singly Linked List :** each node points to the next
- **Doubly Linked List :** next + previous pointers
- **Circular Linked List :** last node points back to the head

---

## Basic Operations

### Insertion
- At beginning
- At end
- At any index

### Deletion
- From beginning
- From end
- At any index
    
### Traversal
- moving node by node

### Search
- find an element

---

## Time Complexity

| Operation             | Time                                        |
| --------------------- | ------------------------------------------- |
| Traversal             | O(n)                                        |
| Search                | O(n)                                        |
| Insert at beginning   | O(1)                                        |
| Insert at end         | O(1) if tail pointer exists, otherwise O(n) |
| Delete from beginning | O(1)                                        |
| Delete from end       | O(n)                                        |

---

## Node Structure

```ruby
static class Node {
    int data;     // value
    Node next;    // address of next node
    Node(int data) {
        this.data = data;
    }
}
```

## Calling from main 

```ruby
static void main() {
    Node n1 = new Node(20);
    Node n2 = new Node(21);    
    n1.next = n2;    // linking
    // n1 --> n2 --> null
}
```

---

## Uses of Linked List

- When frequent insertions/deletions are needed
- When memory is fragmented
- When dynamic data structure is required

---

## Limitations of Singly Linked Lists

- Getting an element requires O(n) complexity.
- Only head is given, so we need to traverse everytime.
- We cannot move backwards.

---

# Doubly Linked List (DLL)
 
In a doubly linked list, each node contains **three parts**: the data, a pointer to the next node, and a pointer to the previous node.

* **Bidirectional Navigation:** You can traverse both forward and backward (using `prev`).
* **Easier Deletions:** If you have a pointer to a node, you can delete it without traversing from the head to find its predecessor.
* **Memory Overhead:** It requires more memory than a singly linked list because of the extra pointer per node.

---

## Node Structure

```ruby
static class Node {
    int data;       // value
    Node next;      // address of next node
    Node prev;      // address of previous node
```

---

## 2. Circular Linked List (CLL)

A circular linked list is a variation where the **last node points back to the first node**, instead of pointing to `NULL`. This creates a continuous loop.

* **Continuous Loop:** There is no "end" to the list; you can reach any node starting from any other node by traversing forward.
* **Types:**
* **Singly Circular:** Last node points to the first node.
* **Doubly Circular:** Last node's `next` points to the first, and the first node's `prev` points to the last.

---
