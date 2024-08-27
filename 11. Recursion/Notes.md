# Recursion

- A method calling itself with different parameters and a base case to terminate the infinite loop
- In recursion, we solve a bigger problem by solving smaller sub-problems.

## PMI: Principle of Mathematical Induction

In PMI, we have been gievn a formula and asked -
- to validate the formula for n = 1
- to assume that it is true for any n = k
- to prove that it will be true for all n = k+1
- ![IMG_20240827_172432](https://github.com/user-attachments/assets/f24eec3d-8ef0-4a31-9646-693004973634)

---

## Call Stack

- When a program executes, it loads in RAM and them a memory is assigned to it:-
  - **Stack Memory:** local variable and method calls
  - **Heap Memory:** creation of objexts
- Stack memory also knows as **Call stack**
  - a linear data structure
  - it follows _LIFO_ principle
  - LIFO: Last In, First Out
  - ![lifo-approach-in-data-structure1](https://github.com/user-attachments/assets/3422c3d4-b7c2-454c-8fde-d09155b03502)
- When a program executes the method calls are stored in stack memory
- A new stack frame is created for every method call
- An existing stack frame is removed **only** after its execution ends or encountered by a _return_ statement

---

## Recursion magical spell

### Halting condition or Base case
- smallest value whose result is obvious or known
- prevents **infinite recursion**
- ![images](https://github.com/user-attachments/assets/96481961-fe2f-4f45-ae9d-dac4e14e797e)


### Recursive work
- smaller sub-problem
- Identify the smaller problem and let recursion solve it
- ![recursion](https://github.com/user-attachments/assets/cf2b30c6-459d-427e-8a99-3e148c168eb3)

### Self-work
- Do the remaining work by yourself
- completes the method

![Screenshot](https://github.com/user-attachments/assets/810e2e94-78fa-447e-aadf-175dc26dcb17)
