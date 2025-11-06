# String
- It is an array of characters.
- Combination of alphabets or digits or special characters individually or collectively.

---

## Declaration of a String
### Syntax: String <variable_name> = "abc";
```ruby
String str = "abc";
```

---

## Input of a String

- There are two ways to take String as an input from user:
  - **String <variable_name> = sc.next();**
    - E.g.: ```String str1 = sc.next();```
    - reads only the first word.
    - Input: Java and DSA, Output: Java
    
  - **String <variable_name> = sc.nextLine();**
    - E.g.: ```String str2 = sc.nextLine();```
    - reads the complete input.
    - Input: Java and DSA, Output: Java and DSA.

---

## In-built functions in String

### charAt()
- returns the character at given index.

### length()
- returns the length of given String.

### indexOf()
- returns the **first** index of given character.

### compareTo()
- compare the two given Strings lexicographically.

### contains()
- checks if the String contains the given character or set of characters.

### startsWith()
- checks if the String starts with given character or set of characters.

### endsWith()
- checks if the String ends with given character or set of characters.

### toLowercase()
- returns the given String with **all** its characters in lowercase.

### toUppercase()
- returns the given String with **all** its characters in uppercase.

### concat()
- joins or concatenate two given Strings.

### substring(i, j)
- returns the characters from i<sup>th</sup> index to (j-1)<sup>th</sup> index.

### substring(i)
- returns the characters from i<sup>th</sup> index to (n-1)<sup>th</sup> index.

### String + int / char / String

---

## Interning and _new_ keyword

### Interning
- The method of storing only one copy of each distinct String value.
- all the variables with same string value points to only one address where it is stored in the heap memory.

### _new_ keyword
- _new_ keyword is used to allocate new memory to the given String.
```ruby
  String gtr = new String ("Hello");
  ```

---

## Immutability of String

- The immutability of String means that once a String object is created, its content **cannot** be changed.
- Any operation that appears to modify a String actually results in the creation of a **new** String object.
```
String s = "Hello;
s = s + "World";
```
- A String object containing "Hello" is created and referred by s.
- The expression s + "World" creates a **new** String object containing "Hello World".
- The reference variable s is updated to point to this new object.
- The original "Hello" object remains unchanged and is available for garbage collection (unless another reference points to it).