# Question 1 — Travel Agency: Highest Package Price & Agency Lookup

## Background
A travel agency management system needs to maintain details about various travel agencies. Create a class `TravelAgencies` with the following **private** fields:
- `int regNo` — Registration number of the agency
- `String agencyName` — Name of the agency
- `String packageType` — Type of tourism package offered
- `int price` — Price of the package
- `boolean flightFacility` — Whether the agency provides flight facility

Provide a **parameterized constructor**, **getters**, and **setters** for all fields.

---

## Methods to Implement (in `Solution1` class)

### 1. `findAgencyWithHighestPackagePrice(TravelAgencies[] agencies) → int`
- Iterate through the array of agencies.
- Return the **maximum price** found.
- Return `0` if the array is empty.

### 2. `agencyDetailsForGivenIdAndType(TravelAgencies[] agencies, int regNo, String packageType) → TravelAgencies`
- Iterate through the agencies.
- Return the **first agency** that:
  - Has `flightFacility == true`
  - Matches the given `regNo`
  - Matches the given `packageType` (case-insensitive)
- Return `null` if no match is found.

---

## Main Method Logic

Create the following three `TravelAgencies` objects and store them in an array:

| regNo | agencyName | packageType | price | flightFacility |
|-------|------------|-------------|-------|----------------|
| 101   | Agency1    | PK101       | 5000  | true           |
| 102   | Agency2    | PK201       | 15000 | true           |
| 103   | Agency3    | PK301       | 5000  | false          |

- Call `findAgencyWithHighestPackagePrice`:
  - Print the max price if it is **not** `0`.
  - Otherwise, print `"No Agency exists"`.

- Call `agencyDetailsForGivenIdAndType` with `regNo = 101` and `packageType = "PK101"`:
  - If found, print: `"AgencyName: <name>, Price: <price>"`
  - Otherwise, print: `"Agency Not Found with these parameters"`

## Expected Output
```
15000
AgencyName: Agency1, Price: 5000
```
