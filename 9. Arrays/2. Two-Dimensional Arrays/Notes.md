# Multi Dimensional Arrays
- also called **Array of Arrays**
- can have two, three or any number of dimensions
- **Jagged Arrays:** A two-dimensional array in which the number of columns are not speicifed or the array can have different number of columns for each row.

---  

## Representation of a Multi-Dimensional Array

### Syntax: dataType[ ][ ] arrayName;
- **For example,** int[ ][ ] ages;

---

## Declaration of a Multi-Dimensional Array

### Syntax: dataType[ ][ ] arrayName = new dataType [rows][columns];
- **For example,** int [ ][ ] ages = new int [5][3];

### Array Literal
- With curly braces, we can initialize the array and add value to it during initialization without defining the size
- dataType [ ][ ] arrayName = {{Element_1, Element_2}, {Element_3, Element_4},... {Element_n1, Element_n2}....upto n}};
- **For example,** int [ ] intArray = {{1, 2}, {3, 4}, ....... up to n}};

---

## Accessing elements in Multi-Dimensional Array
- Array has **0-based** indexing
- int [ ][ ] ages = {{21, 24}, {19, 26}, {30, 36}}
    - ages[0][1] = 21, ages[1][2] = 26, ages[2][1] = 30, etc.

---

## Length operation in Arrays
- We can easily get the required length of the array by using the length inbuilt property.
- For example, int [ ][ ] arr = {5, 6}, {7, 8}, {9, 4}}
  - here, arr.length will give the length of this array, i.e., 3
  - also, we can find the length of each array present in the array by using arr[0].length, arr[2].length that comes out to be 2

---

## Traversing through an Array
- We can use loops to traverse through the array. There are many ways to iterate over the array.
- The most common ways of looping through arrays in Java are:
  - For loop
  - For each loop
  - While loop
