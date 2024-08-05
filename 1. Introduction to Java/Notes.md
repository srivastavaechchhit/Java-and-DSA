# What is Programming?
Programming is the process of creating a set of instructions that tell a computer how to perform a task.

# What is Data structure and algorithms?
- A data structure is a named location that can be used to store and organize data.
- An algorithm is a collection of steps to solve a particular problem.
- Data structure and algorithms are the foundational blocks of programming.

# What are the applications of programming?
![what-is-java-used-for](https://github.com/user-attachments/assets/2264feaf-46d8-4d1b-8856-658e46969a86)

If we see around us, we can know thousands of applications of programming.
For example, If we want our chef to cook maggie, we can simply give instructions in either Hindi or English or in any other language. But if we want our computer to do a certain task for us, we have to give instructions in Binary language (0 and 1), also known as Machine level language or Low level language.
<br>
E.g. If we want to add two numbers 5 and 7, we have to convert 5, '+', and 7 to binary language, only then we can get the sum of the given numbers. In order to perform just a simple task of addition, we have to do a tedious job of converting it into binary, and it will take so much time to develop bigger programs.
<br>
For the sake of convenience, Higher level languages such as C++, Java, and Python are developed. These high level languages are similar to english, but still our computers are unable to understand these high level languages, and for the same purpose of converting high level language to computer-understandable form i.e., low level or machine level language translators are developed.

## There are two types of translators:-

- ### Compiler
  - scans the whole program at once
- ### Interpreter
  - scans the code line-by-line

Meanwhile, compiler also checks for Syntax errors.

# What are different types of programming paradigms?
- Let us understand through an example what ia a paradigms, suppose we have to write a paragraph, and we know that three types of writing styles are there i.e., print, pre-cursive and cursive. One can write in any of the three styles, and the task would be carried out. Similarly, in programming, to solve a given problem; we have different ways, approaches, and styles that can be used to code.

- There are three types of programming paradigms: -

  - ### Procedural programming paradigm
    
    - In this type of paradigm, codes are written as a 'Set of procedures' called as **functions** or **subroutines**.
    - For example, if we have to write a program to take some input, perform calculations and to give to user the output. Then we can divide this program into three subroutines — Input, Calculations, Print.
    - Languages that follow procedural programming paradigm are - C, Basic, Pascal, etc.
  
  - ### Functional programming paradigm
    
    - In this type of paradigm, only pure functions are present.
    - Functions: A chunk of code performing a specified task that runs when called.
    - E.g., int add (int a, int b) { <br>
              return a+b; <br>
            }
    - Pure functions: Pure functions are the functions that follow two properties-
      -  They follow strict control flow i.e., same output for the same input any number of times.
      -  They do not alter any external factor.
    - JavaScript and Python are two examples of languages that follow functional programming paradigms.
  
  - ### Object-oriented programming paradigm
    
    - In this type of paradigm, data is organized in the form of classes and objects rather than functions and procedure.
    - Objects: Objects are real-world entities
    - Class: Class is a user-defined blueprint and object is an instance of a class,
    - For example, Mani is an object of Person class. As Mani can walk, talk, sleep, etc. so the task that an object can perform is known as **Methods** and the features like ears, hands, legs, etc. is known 
      as **Attributes**.
    - Java and C++ are some of the examples that follow Object-Oriented programming paradigm.

# Java
- Java is a class based object-oriented programming language, which makes it very easy to write, compile and debug code.
- Java was developed by James Gosling in the year 1995, later acquired by Oracle Co.

# Features of Java
- Java is an object-oriented programming language.
- Java is a platform independent language i.e. it doesn't compile into platform dependent machine code instead it compiles into platform independent Byte Code.
- Java is fairly simple and secure.
- Java has a large standard library.

# Why to code in Java ?
- First of all, it opens opportunity for developing mobile applications. web applications.
- Secondly, it is neither too difficult like C++ nor too simple like Python.

# Java Architecture
![Java Architecture](https://github.com/user-attachments/assets/34ce0805-6bd3-4423-b034-0eea44e75d7f)

- Java also called as compile-once-run-everywhere.
- The advantage of Java being a platform independent language is that the code becomes portable.
     
## Java architecture components
![JDK](https://github.com/user-attachments/assets/c3d15b4d-c224-4e7c-b323-958fc0e625c3)

- ### JVM (Java Virtual Machine)
  - It translates byte code into machine code
  - Components of JVM:
    - Class Loader: responsible for loading byte code into the main memory
    - Memory area: memory is allocated here
    - Execution engine (Interpreter + JIT (just in time) compiler + Garbage collector): JIT compiler optimise performance of JVM,
      GC is responsible for automatically deallocating or dereferenceing unused memory.
      
- ### JRE (Java Runtime Environment)
  - JVM + runtime libraries

- ### JDK (Java Development Kit)
  - It provides development tools like javac (compiler of java), debugging tools, monitoring tools, javadoc, etc.
  - JDK ---> JRE + development tools
