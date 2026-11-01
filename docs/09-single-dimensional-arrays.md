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
![1722506676754](https://github.com/user-attachments/assets/a881a30c-bc8e-4103-9256-7c46ea050a7c)

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
- **For example,** int [] arr = {5, 6, 7, 8, 9}
    - here, arr.length will give the length of this array, i.e., 5

---

## Traversing through an Array
- We can use loops to traverse through the array. There are many ways to iterate over the array.
- The most common ways of looping through arrays in Java are:
    - **For loop**
    - **For each loop**
    - **While loop**

---

## Taking array input in Java

- Till now, we were creating an array and were assigning values into them, manually.
- But this is not possible in real time development as we don't know how much data we will be provided to work upon
- For the same issue, now we'll learn how to create an array by taking an input from the user.

```ruby
System.out.printlm("Enter Array Size:");
int size = sc.nextInt();

int [] arr = new int[size];

for (int i = 0; i < size; i++) {
  arr[i] = sc.nextInt();
}
```

---

## Cloning Array in Java

- If we copy an existing array into a new array, and we try to change some values in the copied array, then it will also reflect in the original array
- Whenever we use ```int arr2 = arr;``` no new memory is allocated to arr2
- Actually, the reference is copied and not the actual array

```ruby
public static void main(String[] args) {
  int[] arr = new int[5];
  arr[0] = 5;
  arr[1] = 6;
  arr[2] = 7;
  arr[3] = 8;
  arr[4] = 9;

  System.out.println("Original Array:");
  printArray(arr);

  // Trying to copy arr
  int[] arr2 = arr;
  System.out.println("Copied Array:");
  printArray(arr2);

  // Trying to change some values in arr2
  arr2[0] = 0;
  arr2[1] = 0;

  System.out.println("Original Array after changing the values in arr2:");
  printArray(arr);    // 0 0 7 8 9

  System.out.println("Copied Array after changing the values in arr2:");
  printArray(arr2);   // 0 0 7 8 9
  }
```

- This process of copying is known as **Shallow Copy**.
- To avoid this issue of shallow copying, we use some built-in methods present in Java.

---

### Methods of _Array_ class

- arrayName.clone();
  - this method creates a new address in the memory and the values will be copied there
  - this is a **Deep Copy**
- Arrays.copyOf();
  - this is a method in _Arrays_ class of ```java.util``` package
  - it requires two parameters, array name and length for the new array
- Arrays.copyOfRange();
  - this is also a method in _Arrays_ class of ```java.util``` package
  - this is used to copy a definite range of elements in an array
  - it requires three parameters, array name, start index, and end index
  - start index is inclusive whereas the end index is exclusive

---

**_static_ keyword**
- static methods can only access static variables
- A static method can only call another static method
- Static methods cannot refer to non-static variables or methods.
