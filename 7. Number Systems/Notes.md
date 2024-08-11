# System
Represent numbers in different forms with different bases.

# Types of number system

## Decimal Number System
- Digits: 0 to 9
- Base: 10
- E.g.: (1923)<sub>10</sub>

## Binary Number System
- Digits: 0 and 1
- Base: 2
- E.g.: (1001)<sub>2</sub>

# Conversions

## Conversion of Binary to Decimal

- (1001)<sub>2</sub> = (1 * 2<sup>3</sup>) + (0 * 2<sup>2</sup>) + (0 * 2<sup>1</sup>) + (1 * 2<sup>0</sup>) = 9
- (1101)<sub>2</sub> = (1 * 2<sup>3</sup>) + (1 * 2<sup>2</sup>) + (0 * 2<sup>1</sup>) + (1 * 2<sup>0</sup>) = 13
  ![binary2decimal](https://github.com/user-attachments/assets/06860e01-be9e-43d3-a2b0-efe951a7ed03)


## Conversion of Decimal to Binary

- (9)<sub>10</sub>
  - We have to calculate the parity<br>
  - Parity = num % 2
  - Write the remainder at every step in reverse order
    ![Java-Program-for-Decimal-to-Binary-Conversion-300](https://github.com/user-attachments/assets/aa43b456-8fb4-4a5a-b86b-5a99a311052a)
