# Classes
- user-defined data type.
- used to store multiple attributes of an object i.e. real-world entities.

---

## Object Creation
### Syntax: ClassName objectName = new ClassName();
```ruby
Student s1 = new Student();
```

---

## Array vs Class
- **Array**
  - in-built data type.
  - used to store multiple data of similar data type.
- **Class**
  - user-defined data type.
  - to create objects that has multiple attributes.

---

## Default values of Attributes of a class
- **int:** 0;
- **double:** 0.0
- **String:** null

---

## Access Modifiers
- **_public:_** all packages.
- **_private:_** same class.
- **_default:_** same package.

---

## Getters and Setters
- functions of a class.
- used to _get_ and _set_ values of private variables.

---

## _this_ keyword
- used to refer to current class instance variable.

---

## Constructor
- It is a **method** used to initialize a newly created object.
- It automatically gets called while creating instance of the class.
- It has the **same name** as the Class.
- It has no return type.
- There are two types of Constructors:
  - **Default Constructor**
  - **Parametrized Constructor**

---

## _final_ keyword
- A _final_ variable can only be initialized once.
- After initialization, its value cannot be changed.
  - **For Primitive Types:** The value is fixed.
  - **For Reference Types:** The reference is fixed.

---

## _static_ keyword
- It is used to prevent the initialization of default value to a **global variable**.
- Generally, used for counting of number of objects created.

---

## static functions
- used if we want to access a function in the class without creating its object <br> (i.e.by its class name).
