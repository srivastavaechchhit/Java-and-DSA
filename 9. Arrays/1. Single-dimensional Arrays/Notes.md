# Single Dimensional Arrays
- A data structure which stores a collection of homogenous items
- It has 0-based indexing
- It has contiguous memory allocation

---

## Representation of a Single Dimensional Array

### Syntax: dataType[ ] arrayName;
- **For example,* int[ ] ages;

---

## Declaration of a Single Dimensional Array

### Syntax: dataType[ ] arrayName = new dataType [size];
- **For example,** int [ ] ages = new int [5];

### Array Literal
- With curly braces, we can initialize the array and add value to it during initialization without defining the size
- dataType [ ] arrayName = {Element_1, Element_2, Element_3, Element_4, Element_5.....Element_n};
- **For example,** int [ ] intArray = {1, 2, 3, 4, 5,....... n};

---

## Memory allocation in arrays
![1722506676754](https://github.com/user-attachments/assets/a881a30c-bc8e-4103-9256-7c46ea050a7c)

### Types of memory
- **Stack memory** used to store local variables and function parameters in a last-in, first-out (LIFO) order
- **Heap memory** used to store objects and data structures that need to last longer
