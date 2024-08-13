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
![1722506676754](https://github.com/user-attachments/assets/02e779b0-82cc-4fb2-8d9c-3ccf55ff3ba2)

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

---

## Traversing through an Array
- We can use loops to traverse through the array. There are many ways to iterate over the array.
- The most common ways of looping through arrays in Java are:
  - For loop
  - For each loop
  - While loop

---

## Taking array input in Java

- Till now, we were creating an array and were assigning values into them, manually.
- But this is not possible in real time development as we don't know how much we will be provided to work upon
- For the same issue, now we'll learn how to create an array by taking an input from the user.
- 
```ruby
  System.out.printlm("Enter Array Size:");
  int size = sc.nextInt();

  int [] arr = new int[size];

  for (int i = 0; i < size; i++) {
    arr[i] = sc.nextInt();
  }
```

---

## Array Reference in Java

- If we copy an existing array into a new array, and we try to change some values in the copied array, then it will also reflect in the original array
- Whenever we use ```int arr2 = arr;``` no new memory is allocated to arr2
- Actually, the reference is copied and not the actual array
- This process of copying is known as **Shallow Copy**.

```ruby
public class Reference {

    static void printArray(int[] arr) {
        for (int nums : arr)
            System.out.print(nums + " ");
        System.out.println();
    }

    static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = 0;
    }

    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 8;
        arr[4] = 9;

        changeArray(arr);
        printArray(arr);
    }
}
```
**Output:** 0 0 0 0 0