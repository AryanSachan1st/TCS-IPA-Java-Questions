# Question 11 — Employee Tax Calculation

Create an interface `Taxable` with the following method declaration:
- `public double calculateTax();`

Create a class `Employee` that implements the `Taxable` interface, with the following private attributes:
- `id` (int)
- `name` (String)
- `dept` (String)
- `baseSal` (double)

Write a parameterized constructor, and getter/setter methods for all attributes.

Implement the `calculateTax()` method in the `Employee` class based on these rules:
- If `baseSal` is between `20000` and `50000` (inclusive), the tax is calculated as `10%` of `baseSal`.
- If `baseSal` is greater than `50000`, the tax is calculated as `20%` of `baseSal`.
- Otherwise, tax is `0`.

Add a concrete method inside `Employee` class:
- `double getNetSalary()`: Returns the net salary after deducting the tax from the base salary.

Create a `Solution11` class with the `main` method to:
1. Print `"Enter number of employees: "` and read the value.
2. Read the details of given number of `Employee` objects (`empId`, `empName`, `department`, `base salary`).
3. Print `"Enter threshold: "` and read a threshold net salary.
4. Check which employees have a net salary greater than or equal to the threshold. Include them in a resultant list/map and order them in **descending order** of their net salary.
5. Iterate through the sorted list and print the details for the eligible employees in the format: `<empId> <empName> <netSalary>` (separated by spaces).
