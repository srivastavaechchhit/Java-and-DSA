# Sorting
To arrange something in any order provided according to the condition.

---

## Stable and Unstable Sort
- **Stable sort:** Order of appearance of duplicate elements is same in the sorted array as given in the original array
- **Unstable sort:** Order of appearance of duplicate elements gets changed in the sorted array as given in the original array

---

## Types of Sorting algorithms
- Bubble Sort
- Selection Sort
- Insertion Sort
- Merge Sort
- Quick Sort

---

### Bubble Sort
- We do a certain number of passes and in each pass, we compare adjacent elements and swap them if they are not in correct order.
- In every iteration, the largest number in part of array to be processed gets its correct position.
- Bubble sort is a stable algorithm.
- ![bblsort1](https://github.com/user-attachments/assets/6511cf5d-4c0b-4984-a19a-49746b00aa24)

---

### Selection Sort
- We select an element and put it at its correct place
- Selection sort is an unstable algorithm.
- ![selection-short](https://github.com/user-attachments/assets/91c86bb3-d2fd-42d7-8fc0-dfbf023a8499)

---

### Insertion Sort
- We divide the given array into two parts - Sorted and Unsorted
- Take one element, iterate through the sorted part and find the correct position of the element.
- Insertion sort is a stable algorithm.
- ![insertionpass](https://github.com/user-attachments/assets/b8d99f23-09fc-453c-ba97-79e078600a56)

---

### Merge Sort
- 'Divide and Conquer' algorithm.
  - Divide the array into two equal halves
  - Sort the two subarrays separately using Recursion
  - Merge the two sorted subarrays to create an overall sorted array
- It is a stable algorithm.
- ![mergeSort](https://github.com/user-attachments/assets/a8dd52eb-c8ce-4aa6-bf34-67109585d67f)

---

### Quick Sort
- It is also a 'Divide and Conquer' algorithm.
  - Here, we consider a Pivot Element and place it at its correct position in the given Array.
  - **Partition:** Left side of Pivot contains elements smaller than pivot while right side contains 
    the elements which are greater than the pivot element.
  - Sort the either sides of array using Recursion.
- It is an unstable algorithm.
- ![quickSort](https://github.com/user-attachments/assets/9d5a7751-31f8-45f4-b3dd-ca285650dab3)

---

### Count Sort
- Based on non-comparison sorting.
- Range of numbers is defined, i.e. 1 to 100
- It is not an in-place algorithm.
- It is a stable algorithm.
- ![countSort](https://github.com/user-attachments/assets/7fef98d4-e3cb-44e3-b547-4f0327c43e97)

---

### Radix Sort
- Based on non-comparison sorting.
- Here we sort the elements digit by digit or based on the place value of digits in number.
- ![radixSort](https://github.com/user-attachments/assets/9a4862a9-c98d-4b4f-ad06-427d46e77d12)

---

### Bucket Sort
- Used when a range of numbers is given, and it is uniformly distributed.
- We put all the elements in a certain number of buckets (say b)
- Sort each bucket individually
- Take all the elements out and join them together
- ![bucketSort](https://github.com/user-attachments/assets/759d826f-0842-461b-a804-779ba66f1f07)
