# Question 8 — Bank Account Interest Calculation

Create a class `BankAccount` with the following private attributes:
- `accId` (int)
- `holderName` (String)
- `accType` (String)
- `balance` (double)

Write a parameterized constructor, and getter/setter methods for all attributes.

Write a method `applyInterest(double rate)` in the `BankAccount` class. This method calculates and adds simple interest to the `balance` based on the account type for 1 year:
- If `accType` is `"savings"`, interest = `(balance * rate * 1) / 100.0`.
- If `accType` is `"current"`, interest = `(balance * rate * 0.5 * 1) / 100.0`.
The method should add to the `balance` attribute directly. Note: Ignore case for account types.

Create a `Solution8` class with the `main` method to:
1. Print `"Enter number of accounts: "` and read the value.
2. Read the details of given number of `BankAccount` objects (`accId`, `holderName`, `accType`, `balance`).
3. Print `"Enter interest rate: "` and read the interest rate value.
4. Iterate through all the `BankAccount` objects, apply the interest using the `applyInterest` method.
5. Print the updated details for each account in the following format:
   `AccId: <accId>, AccHolderName: <holderName>, Balance (with interest): <balance>`
