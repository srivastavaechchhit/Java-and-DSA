# Operands and operators

- Let us take an example, 5 + 7.
- Here, 5 and 7 are operands and '+' is an operator.

# Java Operators

## Arithmetic Operators

|      Name      | Operator |
|:--------------:|:--------:|
|    Addition    |    +     |
|  Subtraction   |    -     |
| Multiplication |    *     |
|    Division    |    /     |
|    Modulus     |    %     |
|   Increment    |    ++    |
|   Decrement    |    --    |

## Relational Operators (results in true or false only)

|           Name            | Operator  |
|:-------------------------:|:---------:|
|         Equals to         |    ==     |
|       Not equals to       |    !=     |
|       Greater than        |     >     |
|         Less than         |     <     |
| Greater than or equal to  |    >=     |
|   Less than or equal to   |    <=     |

## Logical Operators

|    Name     | Operator |
|:-----------:|:--------:|
| Logical AND |   '&&'   |
| Logical OR  |          |
| Logical NOT |   '!'    |

- _true_ is represented by 1 and _false_ by 0

## Assignment Operators

- =, +=, -=, *=, /=, %=

## Unary Operators (requires only one operand)
|             Name             | Operator  |
|:----------------------------:|:---------:|
|          Unary plus          |     +     |
|         Unary minus          |     -     |
|      Increment operator      |    ++     |
|      Decrement Operator      |    --     |
| Logical compliment operator  |     !     |

## Bitwise Operators

|        Name         | Operator |                               What it does                               |
|:-------------------:|:--------:|:------------------------------------------------------------------------:|
|     Bitwise OR      |          |   returns 1 if any one or both bits is 1, returns 0 if both bits are 0   |
|     Bitwise AND     |    &     |             returns 1 only if both bits is 1, else returns 0             |
|     Bitwise XOR     |    ^     |   returns 1 if both bits are distinct, returns 0 if both bits are same   |
| Bitwise complement  |    ~     |                           it exchanges 0 and 1                           |
| Bitwise left shift  |    <<    |         shift the bits to the left and add zero at the right end         |
| Bitwise right shift |    >>    | shift the bits to the right and vanishes the extra digits from right end |

# Java operators precedence and associativity

- **Precedence:** power of operators.
- **Associativity:** How the operators of same precedence be evaluated i.e., from left to right or vice versa

## Precedence order

|    Category    |                 Operators                  | Associativity |
|:--------------:|:------------------------------------------:|:-------------:|
|    Postfix     |                   ++, --                   | Left to right |
|     Unary      |             ++, --, +, -, !, ~             | Right to left |
| Multiplicative |                  *, /, %                   | Left to right |
|    Additive    |                    +, -                    | Left to right |
|     Shift      |                <<, >>, >>>                 | Left to right |
|   Relational   |                <, <=, >=, >                | Left to right |
|    Equality    |                   ==, !=                   | Left to right |
|  Bitwise AND   |                     &                      | Left to right |
|  Bitwise XOR   |                     ^                      | Left to right |
|   Bitwise OR   |                                            | Left to right |
|  Logical AND   |                     &&                     | Left to right |
|  Conditional   |                     ?:                     | Right to left |
|   Assignment   | =, +=, -=, *=, /=, >, >=, <, <=, &=, ^=, = | Right to left |
