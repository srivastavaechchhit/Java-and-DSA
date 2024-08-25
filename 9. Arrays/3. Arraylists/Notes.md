# Wrapper classes

- A class whose object **contains** or **wraps** Primitive data types.
- objects of a wrapper class contains a field which stores Primitive data types.
- | Primitive data types | Wrapper class |
    |:--------------------:|:-------------:|
  |         int          |    Integer    |
  |        float         |     Float     |
  |         char         |   Character   |
  |       boolean        |    Boolean    |
  |         long         |     Long      |

## Why should we use wrapper classes?
- As we know, Java is an object-oriented programming language so when we use ```int i = 21``` it violates the principle
  of OOPs as ```int``` is just a normal variable. To overcome this, we have been given the replacement as wrapper
  classes 
- The classes and methods of the package ```java.util``` works on objects and not on the primitive data types
- In the **collections framework**, there are some data structures like Arraylists, Stacks and Queues that stores
  objects only.