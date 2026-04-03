# Question 7 — Find the Longest Word in a Sentence

Given the sentence `"I work in TCS as a system engineer"`, write a Java program to find and print the **longest word** in the sentence.

## Example

**Input (hardcoded):**
```
sentence = "I work in TCS as a system engineer"
```

**Output:**
```
engineer
```

## Constraints
- Split the sentence on spaces to get individual words.
- Track the maximum word length seen so far and the corresponding word.
- If multiple words share the maximum length, print the **first** one encountered.
- Use `Integer.MIN_VALUE` as the initial value for maximum length tracking.
