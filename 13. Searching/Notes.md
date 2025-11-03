# Searching
To find the existence of a given element in the given array.

---

## Types of Searching Algorithms

- **Linear Search**

---

### Linear Search
- Also known as **Sequential Search**
- It checks every element in the array until a match is found or the entire array has been searched.
- How it works:
  - Start at the first element of the array.
  - Compare the target value with the current element.
  - If they match, the search is successful, and the index is returned.
  - If they don't match, move to the next element and repeat the comparison.
  - If the end of the array is reached without a match, the search is unsuccessful.
- Characteristics:
  - **Requirements:** The list **does not** need to be sorted.
  - **Time Complexity:**
    - Best Case: **O(1)**, when the target is the first element.
    - Worst/Average Case: **O(n)**, when the target is the last element or not present.

---
