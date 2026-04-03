# Question 2 — Phone: Total Brand Price & Phone Lookup by OS

## Background
A mobile phone store needs a system to manage phone inventory. Create a class `Phone` with the following **private** fields:
- `int id` — Unique identifier of the phone
- `String os` — Operating system (e.g., `"Android"`, `"iOS"`)
- `String brand` — Brand name (e.g., `"Samsung"`, `"Apple"`)
- `int price` — Price of the phone

Provide a **parameterized constructor**, **getters**, and **setters** for all fields.

---

## Methods to Implement (in `Solution2` class)

### 1. `findPriceForGivenBrand(Phone[] phones, String brand) → int`
- Iterate through the phone array.
- Return the **sum of prices** of all phones whose brand **matches** the given brand (case-insensitive).
- Return `0` if no phones match.

### 2. `getPhoneIdBasedOnOs(Phone[] phones, String os) → Phone`
- Iterate through the phone array.
- Return the **first phone** that:
  - Matches the given `os` (case-insensitive)
  - Has a `price >= 50000`
- Return `null` if no match is found.

---

## Main Method Logic

Create the following phone objects and store them in an array:

| id | os      | brand   | price |
|----|---------|---------|-------|
| 1  | Android | Samsung | 45000 |
| 2  | iOS     | Apple   | 75000 |
| 3  | Android | OnePlus | 55000 |
| 4  | iOS     | Apple   | 90000 |

- Call `findPriceForGivenBrand` with brand `"Apple"`:
  - If the total price is **greater than 0**, print the total price.
  - Otherwise, print `"The given Brand is not available"`.

- Call `getPhoneIdBasedOnOs` with os `"Android"`:
  - If a phone is found, print its `id`.
  - Otherwise, print `"No phones are available with specified os and price range"`.

## Expected Output
```
165000
3
```
