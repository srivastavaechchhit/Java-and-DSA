# If Statement
```ruby
        if (condition) {
            // code
        }
```
Curly braces after if statement is optional. But the thing to keep in mind is that if we use then each line of code
will be executed if no terminator is specified and if we don't use the curly braces, then only one line after the
if statement is executed.

# If-else Statement
 ```ruby
        if (condition) {
            // code
        } else {
            // code
        }
  ```

# If-else if Statement
```ruby
        if (condition-1) {
            // code
        } else if (conditon-2) {
            // code
        } else {
            // code
        }
```

# Nested If-else Statement
```ruby
        if (condition-1) {
            if (condition-2) {
                // code
            } else {
                // code
            }
        } else {
            // code
        }
```

## Conditional Operators

1.  Logical-AND operator (&&)
2.  Logical-OR operator (||)
3.  Conditional operator
    - ans = (condition-1) ? ans1 : ans2
    - It must return a result.


# Switch Statement
 ```ruby
        switch (expression) {
            case x:
                // code
                break;
            case y:
                // code
                break;
            default:
                // code
        }
 ```
