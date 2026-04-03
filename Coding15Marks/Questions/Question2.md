# Question 2 — Remove Duplicate Characters

Given the string `"experience"`, write a Java program to remove all **duplicate characters** and print the resulting string while preserving the **original order** of first occurrences.

## Example

**Input (hardcoded):**
```
str = "experience"
```

**Output:**
```
experinc
```

## Constraints
- The output should maintain the order in which characters **first appear** in the string.
- Use a `HashSet` to track already-seen characters.
- Use a `StringBuilder` to build the result.
