# Time Complexity

- Suppose, we have been given a program to find the sum of all numbers from 1 to n.
- Approach 1:
  
```ruby
int sum(int n) {
  int ans = 0;
  for(int i = 1; i <= n; i++)
    ans += i;
  return ans;
}
```

- Approach 2:
  
```ruby
int sum(int n) {
  int ans = 0;
  ans = (n*(n+1))/2;
  return ans;
}
```

- In Approach 1, the program executes 1 time for n = 1, 2 times for n = 2 and 10<sup>8</sup> times for n = 10<sup>8</sup>, whereas Approach 2 calculates the result directly as it has only 3-4 operations for any value of n.
  Hence, Approach 2 is a **time-optimised code**.
- Suppose, there are two algorithms A1 & A2 for a same problem P having overall running time of 1 sec & 2 sec respectively. If we have been ask which algorithm has better time complexity, we may answer A1 as it has less execution time.
- But the overall running time of a program is not the only criteria to determine which algorithm is better in terms of time complexity. The overall runninf time of a program depends on various factors:
  - Logic/Algorithm
  - Language (C/C++/Java/Python/JavaScript)
  - Processor of the machine

---

## How to analyze the Time Complexity ?

- To analyze the time complexity of a given program, we consider the number of operations involved as a function of input, i.e. **Asymptotic Analysis** in that algorithm / program.
- As we have the _sum_ method above, Approach 1 has 10<sup>8</sup> operations for n = 10<sup>8</sup>, whereas Approach 2 has only 3-4 operations for any value of n input by the user.
- So, now we can say that Approach 2 is a better alogorithm or time-optimised code as compared to Approach 1.

---

## Types of time complexity analysis and their notations

### Worst-case time complexity
- denoted by Big **O** --> O(n), O(1), O(n<sup>2</sup>), O(log<sub>2</sub>n), O(nlogn), etc.
  
### Best-case time complexity
- denoted by Big **Ω** --> Ω(n), Ω(1), Ω(n<sup>2</sup>), Ω(log<sub>2</sub>n), Ω(nlogn), etc.
  
### Average-case time complexity
- denoted by Big **θ** --> θ(n), θ(1), θ(n<sup>2</sup>), θ(log<sub>2</sub>n), θ(nlogn), etc.

**Note:**
- We always calculate the worst-case time complexity of programs
- In today's time, we assume machines can perform 10<sup>8</sup> or 10<sup>9</sup> operations in 1 second
- **TLE:** Time limit exceeded (kind of error)

---

## Time Complexity of programs
- for traversing an array of length n --> O(n)
- for traversing two individual arrays of length m and n --> O(n+m)
- for nested loops --> O(n<sup>2</sup>)

---

# Space Complexity
- **Extra** memory/space used by an algorithm proportional to the size of input.
- Input/Output is not considered in space complexity.

---

## Space Complexity of programs
- for an array of length n --> O(n)
- for a 2D matirx of 'n' rows and 'm' columns --> O(n*m)
