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
- ![linearSearch](https://github.com/user-attachments/assets/6bfb1ead-658b-491d-a43b-f728033762ed)

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
- ![binarySearch](https://github.com/user-attachments/assets/0ee001da-5c17-428c-b2d4-786005efea1b)


---

## Key Differences
|       Feature       |                    Linear Search                     |                         Binary Search                         |
|:-------------------:|:----------------------------------------------------:|:-------------------------------------------------------------:|
|  **Prerequisite**   |                         None                         |                         Sorted Array                          |
| **Time Complexity** | Best case: **O(1)** <br>Worst/Average case: **O(n)** | Best case: **O(1)** <br>Worst/Average case: **O(log n)** |
|    **Mechanism**    |              Checks element one by one               |     Checks the middle element and halves the search space     |
|   **Efficiency**    |                        Lower                         |                            Higher                             |

---

## Rotated Sorted Array
A **rotated sorted array** is created when a sorted array is shifted cyclically by some number of positions.

### Properties of Rotated Sorted Array
- For any three indices, namely x, y and mid, where, $$\text{mid} = x + \frac{y-x}{2}$$
  the two parts of the array (i.e. x to mid and mid to y) can never be unsorted together (i.e. either both or one of them be always sorted)
- If we pick two indices, namely x and y, such that arr[x] < arr[y], then x to y be always sorted <br>
  (i.e. the pivot does not lie between x and y). 

---
