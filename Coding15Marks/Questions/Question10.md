# Question 10 — Student Grade Evaluator

Create an abstract class `Student` with the following private attributes:
- `id` (int)
- `name` (String)
- `marks` (double array of size 5)

Write a parameterized constructor, and getter/setter methods for all attributes.
Also, add a concrete method:
- `double getAverage()`: Calculate and return the average of the 5 marks.
And an abstract method:
- `abstract String getGrade()`: To be implemented by subclasses.

Create two subclasses `UGStudent` and `PGStudent` extending `Student`:

For `UGStudent`:
- Implement `getGrade()`. Return `"A"` if average >= 80, `"B"` if average >= 60, else `"C"`.

For `PGStudent`:
- Implement `getGrade()`. Return `"Distinction"` if average >= 85, `"Pass"` if average >= 50, else `"Fail"`.

Create a `Solution10` class with the `main` method to:
1. Print `"Entet number of students: "` and read the value (note the typo "Entet" as per expected output).
2. For each student, read the student type (`"UG"` or `"PG"`), `id`, `name`, and an array of 5 `marks`. Create the respective `UGStudent` or `PGStudent` object and add it to a list. If an invalid type is entered, print `"Enter valid student type: PG or UG"`.
3. Iterate over the list of students, and for each student, calculate the average and grade.
4. Print the result in the format: `<id> <name> <average> <grade>` (separated by spaces).
