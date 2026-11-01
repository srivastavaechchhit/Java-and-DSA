# Stacks

  - A **Stack** is a linear data structure that operates strictly on the **LIFO (Last In, First Out)** principle.
  - Elements are inserted and removed only from a single end, known as the **top**.
  - Middle or bottom elements cannot be accessed without popping the elements above them.
  - <img width="600" height="400" alt="java-stack" src="https://github.com/user-attachments/assets/95e96ec5-28c6-41fe-b1db-0b0312892056" />

---

## Operations & their Complexities
| Operation | Description | Time Complexity | Space Complexity |
| :--- | :--- | :--- | :--- |
| `push(val)` | Inserts element `val` onto the top of the stack | $O(1)$ | $O(1)$ |
| `pop()` | Removes and returns the top-most element | $O(1)$ | $O(1)$ |
| `peek()` / `top()` | Returns the top-most element without removing it | $O(1)$ | $O(1)$ |
| `size()` | Returns current number of elements in the stack | $O(1)$ | $O(1)$ |
| `isEmpty()` | Checks whether the stack contains no elements | $O(1)$ | $O(1)$ |

**Note:** Accessing the $i$-th element or bottom element requires popping all elements above it, costing $O(N)$ time and $O(N)$ space.

## Boundary Exceptions
  - **Underflow (`EmptyStackException`):** Occurs while trying to `pop()` or `peek()` in an empty stack.
  - **Overflow:** Occurs while trying to `push()` into a filled array stack.

---

## Types of Implementation

### Array Based Implementation
  - Fixed capacity specified at initialization.
  - Maintains an index pointer `idx` (initialized to 0).
  - Top element can be sccessed by `arr[idx - 1]`.

### Linked List Based Implementation
  - Variable capacity without any limits.
  - Head node acts as the `top`.
  - `push` adds a new node at `head`, while `pop` moves the head to next node.

---

## Types of Expressions
  - **Infix:** $A + B$
  - **Prefix:** $+ A B$ 
  - **Postfix:** $A B +$ 

### Conversion & Parsing Summary
| Operation | Traversal Direction | Primary DS | Push Rule |
| :--- | :--- | :--- | :--- |
| **Infix Evaluation** | Left $\rightarrow$ Right | `val` (int), `op` (char) | Compute higher precedence before push |
| **Infix to Prefix** | Left $\rightarrow$ Right | `val` (str), `op` (char) | $op + v_1 + v_2$ |
| **Infix to Postfix** | Left $\rightarrow$ Right | `val` (str), `op` (char) | $v_1 + v_2 + op$ |
| **Prefix Evaluation** | Right $\rightarrow$ Left | `val` (int) | $v_1 \text{ op } v_2$ ($v_1$ is first pop) |
| **Postfix Evaluation** | Left $\rightarrow$ Right | `val` (int) | $v_1 \text{ op } v_2$ ($v_2$ is first pop) |
| **Postfix to Infix** | Left $\rightarrow$ Right | `val` (str) | `"(" + v1 + op + v2 + ")"` |
