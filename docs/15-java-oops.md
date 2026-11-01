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
<img width="1568" height="446" alt="Screenshot (56)" src="https://github.com/user-attachments/assets/33b5d615-4442-4935-90d3-d2c5e7bb9bbc" />

---

## Getters and Setters
- functions of a class.
- used to _get_ and _set_ values of private variables.
<img width="1695" height="483" alt="Screenshot (57)" src="https://github.com/user-attachments/assets/aca5bce6-b8ed-401c-8df9-456a1c75319c" />


---

## _this_ keyword
- used to refer to current class instance variable.
<img width="1699" height="483" alt="Screenshot (58)" src="https://github.com/user-attachments/assets/c68eac5b-0576-4638-be56-1dd41c449f7a" />
<img width="1699" height="490" alt="Screenshot (59)" src="https://github.com/user-attachments/assets/8e8242af-8c3d-4144-9224-27aadcd44f02" />

---

## Constructor
- It is a **method** used to initialize a newly created object.
- It automatically gets called while creating instance of the class.
- It has the **same name** as the Class.
- It has no return type.
- There are two types of Constructors:
  - **Default Constructor**
  - **Parametrized Constructor**
<img width="1697" height="667" alt="Screenshot (60)" src="https://github.com/user-attachments/assets/eb6cdff7-19a9-4328-aad1-aa4a65c146ad" />
<img width="1698" height="486" alt="Screenshot (61)" src="https://github.com/user-attachments/assets/dd9b86b9-0e28-457a-a8ef-eff38e5060c1" />
<img width="1701" height="484" alt="Screenshot (62)" src="https://github.com/user-attachments/assets/c2677633-a574-46cd-b4c4-1821c1a06d02" />

---

## _final_ keyword
- A _final_ variable can only be initialized once.
- After initialization, its value cannot be changed.
  - **For Primitive Types:** The value is fixed.
  - **For Reference Types:** The reference is fixed.
<img width="1732" height="558" alt="Screenshot (68)" src="https://github.com/user-attachments/assets/dcd86f07-72d2-40aa-87de-36af8331cf3a" />

---

## _static_ keyword
- It is used to prevent the initialization of default value to a **global variable**.
- Generally, used for counting of number of objects created.
<img width="1701" height="560" alt="Screenshot (65)" src="https://github.com/user-attachments/assets/968dfe85-88fd-4f63-a54f-a57190dc4311" />
<img width="1698" height="557" alt="Screenshot (66)" src="https://github.com/user-attachments/assets/ea847414-bcfd-49ad-9715-812ccbf5dab1" />

---

## static functions
- used if we want to access a function in the class without creating its object <br> (i.e.by its class name).
<img width="1693" height="552" alt="Screenshot (69)" src="https://github.com/user-attachments/assets/92d6b6fb-88ef-417e-8d59-070cec62f71b" />

---
