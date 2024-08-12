# Java Methods

- A block of code performing some action which runs only when it is called.
- | Functions              | Methods                           |
  |:-----------------------|:----------------------------------|
  | can be called directly | must be called by using an object |
  | i.e., bark():          | i.e., fluffy.bark();              |

---

## Importance of methods

- write once, use multiple times
- saves time
- reduces code duplication
- more readable, more maintainable

---

## Types of methods

- User-defined methods
  - created by user itself
- Standard Library methods
  - E.g. sqrt, floor, ceil, etc.
  
### How to declare user-defined methods

**Syntax: AccessSpecifier ReturnType MethodName (Parameter list)**
- This syntax as a whole is known as **Method header**
  
```ruby
    public class Main {
        public int add(int a, int b) {
            // code to be executed; ---> Method body
        }
    }
```

- **Basic Terminology**
    - Method Signature: Method name + Parameter list
    - Access specifier
    - return type
    - method name
    - Parameters
    - Method body
      
---
  
## Calling a method
- To call a method in Java, you have to write the method name followed by two parenthesis() and a semicolon.
  
```ruby
public class Main {
  static void welcome() {
    // code;
  }
  public static void main (String[] args) {
    welcome();
}
```

- In the example above, _welcome_ method is called directly as it is declared _static_
- _static_ keyword is a **non-access modifier**
- |       Static variable       |          Instance variable           |
  |:---------------------------:|:------------------------------------:|
  |        static int a;        |                int a;                |
  | single copy for whole class | all objects will have their own copy |

  ---

### Standard Library Methods

```ruby
- print()
- sqrt()
- floor()
- ceil()
```

**Return keyword:** The return keyword finishes the execution of a method, and can be used to return a value from a method.

---

## Package
- A collection of similar classes, sub-packages, interfaces.
- E.g. java.util, java.io, java.net, etc.

---

## Constructors
- a special method used to initialize objects
- the name of the constructor is the same as class name
- it has no return type

### Types of constructors
1. Default
2. Parameterized

---

## Access Modifiers
![AccessModifiersinJava](https://github.com/user-attachments/assets/c0c50385-7c9f-4edd-ae43-24fc22d22f87)

## Scope of variables in Java

### Class-level scope
- variables declared inside the class and cannot be accessed outside the class

### Method-level scope
- variables declared inside the methods and cannot be accessed outside the method

### Block-level scope
- These are the variables that are declared inside the pair of brackets '{' and '}'
- A block of code may exist on its own, or it can belong to an if, for, etc.
- The code given below represents block level scope:-
  
```ruby
  void demo() {
    {
      int a = 20;
      sout(a);  // Output: 20
    }
  }
```

```ruby
void demo() {
  {
    int a = 20;
  }
  sout(a);    // this line will give an error as the scope of 'a' is limited to the block of code in between {}
}
```

---

## Formal parameters and Actual parameters

|         Formal Parameters          |              Actual Parameters               |
|:----------------------------------:|:--------------------------------------------:|
| defined during function definition | passed while calling the function or methods |
| e.g. static int sum(int a, int b)  |         e.g. sum(5, 6) or sum(x, y)          |
|   a and b are formal parameters    |    (5, 6) or (x, y) are actual parameters    |

---

## Pass by Value and Pass by Reference

|             Pass by value              |              Pass by reference               |
|:--------------------------------------:|:--------------------------------------------:|
| copies the value of actual parameters  | passes the parameters as reference (address) |
| called function creates its own copies | called function does not create its own copy |
-  Java has **Pass by Value** _[ALWAYS]_
