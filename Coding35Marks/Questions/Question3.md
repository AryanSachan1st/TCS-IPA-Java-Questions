# Question 3 — Institution: Clearance Count by Location & Grade Update

## Background
An education management system needs to track institution performance. Create a class `Institution` with the following **private** fields:
- `int id` — Unique identifier
- `String name` — Name of the institution
- `int placedStudents` — Number of students placed
- `int clearedStudents` — Number of students who cleared the assessment
- `String location` — Location of the institution
- `String grade` — Current grade of the institution (e.g., `"A"`, `"B"`)

Provide a **parameterized constructor**, **getters**, and **setters** for all fields.

---

## Methods to Implement (in `Solution3` class)

### 1. `findNumClearanceByLoc(Institution[] institutions, String location) → int`
- Iterate through the institutions array.
- Return the **total number of cleared students** across all institutions in the given `location` (case-insensitive).
- Return `0` if no institutions match.

### 2. `updateInstitutionGrade(Institution[] institutions, String instName) → Institution`
- Find the institution whose name **matches** `instName` (case-insensitive).
- Calculate the placement rating as:  
  `rating = (placedStudents * 100) / clearedStudents`
- If `rating >= 80`, set the grade to `"A"`, otherwise set it to `"B"`.
- Return the updated institution object.
- Return `null` if no institution with that name is found.

---

## Main Method Logic

Create the following institution objects and store them in an array:

| id | name    | placedStudents | clearedStudents | location  | grade |
|----|---------|---------------|-----------------|-----------|-------|
| 1  | TCS     | 180           | 200             | Chennai   | A     |
| 2  | Infosys | 120           | 160             | Bangalore | B     |
| 3  | Wipro   | 90            | 100             | Chennai   | A     |

- Call `findNumClearanceByLoc` with location `"Chennai"`:
  - If the result is **greater than 0**, print it as-is.
  - Otherwise, print `"There are no cleared students in this particular location"`.

- Call `updateInstitutionGrade` with name `"TCS"`:
  - If the result is **not null**, print: `"<institutionName>::<grade>"` (e.g., `TCS::A`)
  - Otherwise, print `"No Institute is available with the specified name"`.

## Expected Output
```
300
TCS::A
```
