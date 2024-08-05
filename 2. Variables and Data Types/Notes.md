# Variables

- A variable is the title of a reserved region allocated in memory. In other words, it may be referred to as the name of a memory location.
- It is a container that holds the value while the Java program is executed.
- Each variable should be given a unique name to indicate the storage area.
- A variable is assigned with a data type.

# Declaring a variable

## Syntax: DataType VariableName = value;
- For example, int rate = 40;
- Here, rate is an integer data type variable with value 40 assigned to it.

# Java naming conventions

| S.no. | Style name  | Writing style |                                Uses                                |
|:-----:|:-----------:|:-------------:|:------------------------------------------------------------------:|
|  1.   | Lower case  |   lowercase   |                          name of packages                          |
|  2.   | Upper case  |   UPPERCASE   |                                                                    |
|  3.   | Camel case  |   camelCase   |                    name of functions/variables                     |
|  4.   | Snake case  |  SNAKE_CASE   | name of values that's gonna remain constant throughout the program |
|  5.   | Pascal case |  PascalCase   |                          name of classes                           |

# Rules for naming variables in java

- **Rule 1:** Variable names should not begin with a number.
- **Rule 2:** Whitespace is not permitted in variable names.
- **Rule 3:** A Java keyword (reserved words) cannot be used as variable names.
- **Rule 4:** It is preferred to use variable names with more than one word with all lowercase letters for the first word
          and capitalization of the first letter of each later word.
- **Rule 5:** While creating variables, it is preferred to give them meaningful names.
- **Rule 6:** All lowercase letters should be used while creating one-word variable names.

# Identifiers

An identifier is a name given to a package, class, interface, method, or variable. All identifiers must have
different names.

- ## Points to remember for identifiers
  - **Rule 1:** All identifiers should begin with a letter (A to Z or a to z), currency character($), or an underscore(_).
  - **Rule 2:** After the first character, identifiers can have any combination of characters.
  - **Rule 3:** A keyword cannot be used as an identifier.
  - **Rule 4:** The identifiers are case-sensitive.
  - **Rule 5:** Whitespace is not permitted

- Examples of legal identifiers: rank, $name, _rate, __2_mark
- Examples of illegal identifiers: 102pqr, -name.
- These variables, identifiers, etc. consume memory units. Before proceeding ahead, let us have a look at the
memory unit concept too.
Here, we will only focus on the relevant concept of memory.

## Memory units
It refers to the amount of memory or storage used to measure data.
  
- ## Basic memory units are:
  
  - ### Bit 
    - A bit (binary digit 0 or 1) is the smallest unit of data that a computer can process and store. 
    - Symbols 0 and 1 are known as bits.
    - Here, 0 indicates the passive state of signal, and 1 indicates the active state of signal. 
    - At a time, a bit can store only one value i.e., 0 or 1. To have a greater range of values, we combine multiple bits.
      
  - ### Byte
    - A byte is a unit of memory/data that is equal to 8 bits.
    - You may think of a byte as one letter. For example, the letter 'f' is one byte or eight bits.

- ## Bigger memory units are:
  
  - ### Kilobyte
    - A Kilobyte is a unit of memory data equal to 1024 bytes.

  - ### Megabyte
    - A Megabyte is a unit of memory data equal to 1024 kilobytes.

  - ### Gigabyte
    - A Gigabyte is a unit of memory data equal to 1024 Megabytes.
    
# Decoding HelloWorld program
Let us take a look at how the Java ‘HelloWorldJava’ program work

```ruby
// first program
class HelloWorldJava {
      public static void main(String[] args) {
        System.out.println("Hello World Program in Java");
        }
    }
```

**Output:** Hello World Program in Java

## How does this program work?
**Compiler:** Translates the high level language to low level language i.e., binary language

### 1.  // First Program
- Any line that begins with // is a comment.
  - **Comments** help users reading the code understand the intent and functionality of the program.
- Java compiler completely disregards it.

### 2.  Class HelloWorldJava
- Every Java application starts with a class definition.
  - The class in the program here is class **HelloWorldJava**, and it can be defined as follows:
    
```ruby
        Class HelloWorldJava {
          // code;
        }
```

### 3.  Public static void main (String[] args) {...}
Every program starts by calling the main function. This _main_ function acts as an entry point of the program.
- Let's understand the keywords:
  - **public:** it is an access modifier that defines the visibility of class (here). 'Public' means visible to everyone.
  - **static:** _static_ keyword indicates that the method/function/variable can be called without creating an object.
  - **void:** means the function returns nothing.
  - **main:** entry point of any program, execution begins from the main method.
  - **String[] args:** function parameters passed from the command line.

### 4.  System.out.println()
- This line is used to print messages or values in Java.
- PrintStream class is represented by the parameters "out" and "println"
- If we use print(), then the cursor will remain in the same line after printing, whereas if we use println() then the next message will be printed in the next line.
    
# Data Types
- Data types specify the different sizes and values that can be stored in the variable.
- Based on the data type of variable, the operating system allocates memory and decides what can be stored in the reserved memory.

# Types of data types

## Primitive data types

- ### Boolean Type
  - The Boolean data type can have two values – _true_ or _false_ and hence are typically used in true/false situations.
  - **For example**,
```ruby
          Boolean flag = true;
```

- ### Byte Type
  - Values for the byte data type range from -128 to 127 (8-bit signed two's complement integer)
  - A byte type is used in place of an int to save memory when it is certain that the value of a variable will be between -128 and 127.
  - **For example**,
```ruby
          byte range = 105;
```

- ### Short Type
  - The short data type can have values ranging from -32768 ko 32767 (16-bit signed two's complement integer).
  - If the value of a variable is certain to be between -32768 and 32767, short is used in place of other integer data types (int, long).
  - **For example**,
```ruby
          short loss = -50;
```

- ### Int Type
  - Values for the int data type range from - 2<sup>31</sup> ko 2<sup>31</sup> - 1 (32-bit signed two's complement integer)
  - **For example**,
```ruby
          int profit = 5000;
```

- ### Long Type
  - Values for the long data type range from - 2<sup>63</sup> to 2<sup>63</sup> - 1 (64-bik signed two's complement integer).
  - **For example**,
```ruby
          long profit = 455559990;
```

- ### Double Type
  - The double data type is a 64-bit floating-point data type with double precision.
  - It should never be used for exact values like currency.
  - **For example**,
```ruby
          double height = 12.5;
```

- ### Float Type
  - The float data type is a 32-bit single-precision floating-point value.
  - It should never be used for precise values like money.
  - **For example**,
```ruby
          float depth = - 32.3f;
```

- ## Char Type
  - It's a Unicode (an international character encoding standard that provides a unique number for every character across languages and scripts) 16-bit character.
  - The char data type has a minimum value of 'u0000' (0) and a maximum value of 'uffff'.
  - **For example**,
```ruby
          char temp = 'a';
```

## Non-primitive data types 
 ![non-primitive-data-types](https://github.com/user-attachments/assets/61e1f4a1-cc7a-4fe9-8555-e90693043fb7)


# Difference between primitive data types and non-primitive data types

|  Primitive data types  |       Non-primitive data types       |
|:----------------------:|:------------------------------------:|
|     built-in java      |             user-defined             |
|   hold single values   | stores memory address of a variable  |
|   cannot be divided    |  these are complex (can be divided)  |
