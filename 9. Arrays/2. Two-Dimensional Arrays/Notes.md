# Multi Dimensional Arrays
- also called **Array of Arrays**
- can have two, three or any number of dimensions

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
