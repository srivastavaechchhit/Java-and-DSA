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
- ![charAt](https://github.com/user-attachments/assets/6a4f27d5-c9e5-4c42-87b1-29bff80eee81)

### length()
- returns the length of given String.
- ![length](https://github.com/user-attachments/assets/b89b7eb3-462e-4cd3-ae8b-ca0abeac504d)

### indexOf()
- returns the **first** index of given character.
- ![indexOf](https://github.com/user-attachments/assets/caae4b2f-35e7-4159-a1e7-1f776934fe6a)

### compareTo()
- compare the two given Strings lexicographically.
- ![](https://github.com/user-attachments/assets/708be939-81cd-4523-8751-34bde395e7b9)
- ![](https://github.com/user-attachments/assets/29374cf5-07a8-4b7f-a906-dfe556628caa)
- ![](https://github.com/user-attachments/assets/3f193ffa-4f00-4b65-81bb-8983a4ea381a)

### contains()
- checks if the String contains the given character or set of characters.
- ![](https://github.com/user-attachments/assets/2fcc54e5-7396-48d7-8cb8-9d4c121f239e)
- ![](https://github.com/user-attachments/assets/a1c9e6e5-f07c-46cc-ab80-7a3c9219ba14)

### startsWith()
- checks if the String starts with given character or set of characters.
- ![](https://github.com/user-attachments/assets/5364a3e9-ff31-47d4-a4d1-23b0c59826ba)
- ![](https://github.com/user-attachments/assets/b80dd386-e682-4674-a69e-5696482c57d0)

### endsWith()
- checks if the String ends with given character or set of characters.
- ![](https://github.com/user-attachments/assets/b32e21c8-d973-42a8-9517-a8b3d95f7100)
- ![](https://github.com/user-attachments/assets/2c9fd0b9-b5cb-4b45-af86-4c545e33819a)

### toLowercase()
- returns the given String with **all** its characters in lowercase.
- ![](https://github.com/user-attachments/assets/affcfcc2-9a61-4822-aa4f-dd6e189cef9a)

### toUppercase()
- returns the given String with **all** its characters in uppercase.
- ![](https://github.com/user-attachments/assets/8f5e1409-0150-4342-b0be-57e44e40c85b)

### concat()
- joins or concatenate two given Strings.
- ![](https://github.com/user-attachments/assets/101ab6dc-0401-4fda-8e67-f0c3e2b7a86f)

### substring(i, j)
- returns the characters from i<sup>th</sup> index to (j-1)<sup>th</sup> index.
- ![](https://github.com/user-attachments/assets/e6adacbb-9d22-4cd9-a7b9-b0c1992e3850)

### substring(i)
- returns the characters from i<sup>th</sup> index to (n-1)<sup>th</sup> index.
- ![](https://github.com/user-attachments/assets/fd0bfd33-0284-4611-b1bb-1427af159ab9)

### equals() and ==
- The comparison operator (==) is not used for Strings as it returns the output based on equal **address**.
- ```equals()``` is used to check if two Strings are equal or not.
- ![](https://github.com/user-attachments/assets/c5378f20-7e62-4778-9ee4-231df7646e2b)

### String + int / char / String
- ![](https://github.com/user-attachments/assets/b9e256dd-a791-473d-a170-14113072a241)
- ![](https://github.com/user-attachments/assets/a4d4cc11-94c8-436c-849a-b6a4317b83d5)
- ![](https://github.com/user-attachments/assets/38a2d04e-fbff-4799-8e76-6a4b8152a194)
- ![](https://github.com/user-attachments/assets/9ba7562b-e8cf-49fe-82d1-690c7457f5c4)

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
```ruby
String s = "Hello;
s = s + "World";
```
- A String object containing "Hello" is created and referred by s.
- The expression s + "World" creates a **new** String object containing "Hello World".
- The reference variable s is updated to point to this new object.
- The original "Hello" object remains unchanged and is available for garbage collection (unless another reference points to it).

---

# String Builder in Java
The StringBuilder class in Java is a **mutable sequence of characters** i.e. we can modify a String without creating a new object every time.

---

## Declaration of a StringBuilder
### Syntax: StringBuilder <variable_name> = new StringBuilder();
```ruby
StringBuilder sb = new StringBuilder();              // empty builder
StringBuilder sb2 = new StringBuilder("Hello");      // initialized with a String
```

---

## In-built functions in StringBuilder

### append()
- adds a new integer, character or String in the existing String.
- ![](https://github.com/user-attachments/assets/85b2444f-b31f-4d31-b70f-a34ff767f7cc)
- ![](https://github.com/user-attachments/assets/19202e1f-269f-4984-92b5-bc840286c62e)
- ![](https://github.com/user-attachments/assets/01f0ec6b-9ccb-440a-ad41-d9ef8483dd45)

### setCharAt()
- adds **one** character at a given index.
- replaces the existing character.
- ![](https://github.com/user-attachments/assets/1bc40274-e1e4-46f1-a60b-c055c3e91842)

### insert()
- adds **one or more** characters at a given index.
- increases the length of String.
- ![](https://github.com/user-attachments/assets/5481026c-ca8b-446f-87f4-ccac14fc3712)

### deleteCharAt(i)
- deletes **one** character from i<sup>th</sup> index.
- ![](https://github.com/user-attachments/assets/c21ba9e5-c370-4376-93eb-28a10660436d)

### reverse()
- reverses the given String.
- ![](https://github.com/user-attachments/assets/7229bed1-05ee-4cb5-903f-8800d6487129)

### delete(i, j)
- deletes a range of characters for i<sup>th</sup> index to (j-1)<sup>th</sup> index.
- ![](https://github.com/user-attachments/assets/2135c77d-46a2-4339-a804-f9c4cc236243)

### substring(i)
- return the characters from i<sup>th</sup> index to (n-1)<sup>th</sup> index, where n is the length of String.
- ![](https://github.com/user-attachments/assets/c81483ec-5828-46b4-b243-8501584bdb2e)

### substring(i, j)
- return the set of characters from i<sup>th</sup> index to (j-1)<sup>th</sup> index.
- ![](https://github.com/user-attachments/assets/25bba574-d536-4aef-b8ba-ccc986d0bbf7)

---
