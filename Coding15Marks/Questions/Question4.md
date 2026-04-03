# Question 4 — Last Letter of Words Not Ending with a Digit

Given the sentence `"Hey3 there Java4 Learners"`, write a Java program to:
- Split the sentence into words.
- For each word, check if its **last character is NOT a digit**.
- If so, append that last character to a result string.
- Print the resulting concatenated string.

## Example

**Input (hardcoded):**
```
sentence = "Hey3 there Java4 Learners"
```

**Output:**
```
es
```

*(The word `"there"` ends with `'e'` and `"Learners"` ends with `'s'`; both are non-digits, so the result is `"es"`)*

## Constraints
- Split the sentence on spaces.
- Use `Character.isDigit()` to check if the last character is a digit.
- Use a `StringBuilder` to build the output.
