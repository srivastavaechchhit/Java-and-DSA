# Single Dimensional Arrays
- A data structure which stores a collection of homogenous items
- It has 0-based indexing
- It has contiguous memory allocation

---

## Representation of a Single Dimensional Array

### Syntax: dataType[ ] arrayName;
- **For example,** int[ ] ages;

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

### Types of memory
- **Stack memory** used to store local variables and function parameters in a last-in, first-out (LIFO) order
- **Heap memory** used to store objects and data structures that need to last longer

---

## Accessing elements in Single Dimensional Array
- Array has **0-based** indexing
- int [ ] ages = {21, 24, 19, 26, 30}
  - ages[0] = 21, ages[2] = 19, ages[3] = 26, etc.

---

## Length operation in Arrays
- We can easily get the required length of the array by using the length inbuilt property.
- For example, int [] arr = {5, 6, 7, 8, 9}
  - here, arr.length will give the length of this array, i.e., 5
