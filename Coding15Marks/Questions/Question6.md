# Question 6 — Divisibility by 3 Using Digit Sum

Given the number `36`, write a Java program to check whether it is **divisible by 3** using the **digit sum rule**:
- Extract each digit of the number by repeatedly taking `n % 10` and dividing `n` by `10`.
- Sum all the digits.
- If the sum is divisible by 3, print `"Divisible by 3"`, otherwise print `"Not Divisible by 3"`.

## Example

**Input (hardcoded):**
```
n = 36
```

**Output:**
```
Divisible by 3
```

*(Digit sum: 3 + 6 = 9, which is divisible by 3)*

## Constraints
- Do **not** check divisibility using `n % 3` directly on the original number.
- Instead, extract digits one by one using `n % 10` and `n / 10` inside a `while` loop, sum them, then check if the sum is divisible by 3.
