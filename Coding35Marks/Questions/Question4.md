# Question 4 — Medicine: Get Sorted Prices by Disease

## Background
A pharmacy management system needs to filter and sort medicine prices. Create a class `Medicine` with the following **private** fields:
- `String name` — Name of the medicine
- `String batch` — Batch identifier
- `String disease` — Disease the medicine is used for
- `int price` — Price of the medicine

Provide a **parameterized constructor**, **getters**, and **setters** for all fields.

---

## Method to Implement (in `Solution4` class)

### `getPriceByDisease(Medicine[] medicines, String disease) → Integer[]`
- Iterate through the medicines array.
- Collect the **prices** of all medicines whose disease **matches** the given disease (case-insensitive).
- Return the collected prices as a **sorted `Integer[]` array** (ascending order).
- Return an empty array if no medicines match.

---

## Main Method Logic

- Read input for **4 `Medicine` objects** from standard input (`Scanner`).
- For each medicine, read (in order): `name`, `batch`, `disease`, `price`.
- Then read the **target disease** to search for.

- Call `getPriceByDisease` with the medicines array and the target disease.
- If the returned array is **empty**, print:  
  `"No medicines found for the given disease"`
- Otherwise, print **each price on a separate line** (already sorted ascending).

---

## Sample Input
```
Paracetamol B001 Fever 50
Ibuprofen B002 Pain 80
Dolo B003 Fever 40
Aspirin B004 Pain 60
Fever
```

## Sample Output
```
40
50
```
