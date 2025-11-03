# Searching
To find the existence of a given element in the given array.

---

## Types of Searching Algorithms

- **Linear Search**
- **Binary Search**

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

### Binary Search
- It is a much more efficient algorithm than linear search.
- How it works:
    - Start by examining the **middle** element of the array.
    - Compare the target value with the middle element.
        - If they match, the search is successful.
        - If the target is **less than** the middle element, the search is narrowed to the **lower half** of the list.
        - If the target is **greater than** the middle element, the search is narrowed to the **upper half** of the list.
    - Repeat the process on the smaller sub-array until the element is found or the sub-array becomes empty.
- Characteristics:
    - **Requirements:** The list **must be sorted**.
    - **Time Complexity:**
        - Best Case: **O(1)**, when the target is the middle element.
        - Worst/Average Case: **O(log n)**, as the search space is halved in every step.

---

## Key Differences
|       Feature       |                    Linear Search                     |                         Binary Search                         |
|:-------------------:|:----------------------------------------------------:|:-------------------------------------------------------------:|
|  **Prerequisite**   |                         None                         |                         Sorted Array                          |
| **Time Complexity** | Best case: **O(1)** <br>Worst/Average case: **O(n)** | Best case: **O(1)** <br>Worst/Average <br> case: **O(log n)** |
|    **Mechanism**    |              Checks element one by one               |     Checks the middle element and halves the search space     |
|   **Efficiency**    |                        Lower                         |                            Higher                             |

---
