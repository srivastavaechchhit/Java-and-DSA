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
    Node n2 = new Node(21);    // linking
    n1.next = n2;
    // n1 --> n2 --> null
}
```

---

## Uses of Linked List

- When frequent insertions/deletions are needed
- When memory is fragmented
- When dynamic data structure is required

---
