# Question 9 — Product Discount Application

Create a class `Product` with the following private attributes:
- `prodId` (String)
- `prodName` (String)
- `category` (String)
- `price` (double)
- `stock` (int)

Write a parameterized constructor, and getter/setter methods for all attributes.

Write a method `applyDiscount(String targetCategory, int discPercent)` in the `Product` class. This method should return the discounted price of the product if the following conditions are met:
- The product's `category` matches `targetCategory` (case-insensitive).
- The product's `stock` is greater than `50`.

If both conditions are true, return the price after applying the discount percentage. Otherwise, return the original price.

Create a `Solution9` class with the `main` method to:
1. Print `"Enter num of products: "` and read the value.
2. Read the details of the given number of `Product` objects (`prodId`, `prodName`, `category`, `price`, `stock`).
3. Print `"Enter target category: "` and read the target category string.
4. Apply a `15%` discount using the `applyDiscount` method to all objects for the given target category.
5. If the product received a discount (i.e. the discounted price is different from the original price), store the discounted products and sort them in **ascending order** based on their discounted price.
6. Print the `prodId`, `prodName`, and discounted price for the discounted products in the sorted order, separated by a space.
