# How do OOPs help solve real world problems?

- Object-Oriented Programming (OOPs) can help solve real-world problems by allowing developers to model real-world entities as objects, which can lead to more intuitive and organized code.
- OOPs also support features like **inheritance** and **polymorphism**, which can enhance the extensibility and readability of applications.

---

# Basic terminology in OOPs

- **Classes** are the user-defined blueprints or templates
- **Objects** are the instances of a class
- **Attributes**, also known as **member variables** are variables that represent the characteristics or state of an object or class
- **Methods** can be defined as part of a class and can be called by any object instantiated from that class
  ![1722338084012](https://github.com/user-attachments/assets/2b639953-d2fd-4266-8158-2e0f4fdc9935)

---

# Characteristics of an object

| Characterstic |      Use in OOPs      | Real-life example |
|:-------------:|:---------------------:|:-----------------:|
|   Identity    | Unique name of object |    BMW, Toyota    |
|     State     |      Attributes       |     Red, 750i     |
|   Behaviour   |        Methods        | Accelerate, Brake |

---

# Creating a class

1. Access Modifier<br>

|       |  Access Modifier  |         Example          |
|:-----:|:-----------------:|:------------------------:|
|  (a)  |      public       |          Roads           |
|  (b)  |      private      |       Mobile phone       |
|  (c)  |     protected     |  Assets like properties  |
|  (d)  |      default      |        TV, Fridge        |

2. _class_ keyword 
3. Class name 
4. Class body

   ![1722340043338](https://github.com/user-attachments/assets/a817d1dc-57e9-4d4f-9d22-aa4dff180924)

---

# Creating an object

## Syntax: className ObjectName = new className();<br>
**For example,**
- Car BMW = new Car(); <br>
- Person Rohan = new Person();

**Note**
- _new_ is a keyword used to allocate memory, this process is called **Instantiating**.
- Car(), Person(), are examples of constructors.

---

# Accessing variable using the object

## Syntax: className.variableName
**For example,** Rohan.age;

---

# Points to remember

- If we don't assign a value to a variable, the compiler will automatically assign a default value
  - **E.g.**: 0 for int, _null_ for String
- In real-time development, it is a better practice to write _main_ method in a separate class
- One Java file can only have one _public_ class, and the file must be named after that class only
