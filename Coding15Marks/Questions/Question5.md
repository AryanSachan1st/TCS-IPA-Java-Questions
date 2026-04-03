# Question 5 — First Letters of Words Starting with a Vowel

Given the sentence `"hello I am a student"`, write a Java program to:
- Split the sentence into words.
- For each word, check if its **first character is a vowel** (both uppercase and lowercase).
- If so, append that first character to a result string.
- Print the resulting concatenated string.

## Example

**Input (hardcoded):**
```
sentence = "hello I am a student"
```

**Output:**
```
Iaa
```

*(The words `"I"`, `"am"`, and `"a"` start with vowels `'I'`, `'a'`, `'a'` respectively)*

## Constraints
- Split the sentence on spaces.
- Consider both uppercase and lowercase vowels: `a, e, i, o, u, A, E, I, O, U`.
- Use a `HashSet<Character>` to store vowels for efficient lookup.
- Use a `StringBuilder` to build the output.
