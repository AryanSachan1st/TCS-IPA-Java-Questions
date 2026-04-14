# Question 5 — Flight Management System

## Background
Create a class `Flight` with the following **private** fields:
- `String flightId` — ID of the flight
- `String airline` — Airline name
- `String origin` — Origin city
- `String destination` — Destination city
- `double farePerSeat` — Ticket fare per seat
- `int totalSeats` — Total number of seats in the flight
- `int bookedSeats` — Number of booked seats

Provide a **parameterized constructor** and **getters** for all fields.

Additionally, add the following helper methods in `Flight`:
- `getAvailableSeats()`: Returns the remaining seats (`totalSeats - bookedSeats`, minimum `0`).
- `isFullyBooked()`: Returns `true` if available seats are not zero, otherwise `false`. *(Note: This follows the logic in the expected solution).*
- `getTotalRevenue()`: Returns the revenue (`bookedSeats * farePerSeat`), floored to 2 decimal places.

---

## Methods to Implement (in `Solution5` class)

### 1. `findCheapestFlight(Flight[] flights, String origin, String destination) → String`
- Find the flight with the lowest `farePerSeat` matching the given `origin` and `destination` (case-insensitive).
- Return the `flightId` of the cheapest flight.
- If no matching flights exist, return `"No Flights Available"`.

### 2. `getFlightByAirline(Flight[] flights, String airline) → Flight[]`
- Filter flights that match the provided `airline` (case-insensitive).
- Return an array of matching flights sorted in ascending order of their `farePerSeat`.
- Return `null` if no flights are found for the given airline.

---

## Main Method Logic

1. Read `n` (number of flights) from the user.
2. Read details for `n` `Flight` objects and store them in an array.
3. Read `testOrigin`, `testDestination`, and `testAirline`.
4. First, iterate over the original array of flights and for each flight print:
   `"<flightId> <availableSeats> <isFullyBooked> <totalRevenue>"`
5. Call `findCheapestFlight` with the given `testOrigin` and `testDestination` and print the returned value.
6. Call `getFlightByAirline` with the given `testAirline`:
   - If flights are found, iterate through the returned array and print for each:
     `"<flightId> <airline> <farePerSeat> <availableSeats>"`
   - If `null` is returned, print: `"No flights found for airline: <testAirline>"`
