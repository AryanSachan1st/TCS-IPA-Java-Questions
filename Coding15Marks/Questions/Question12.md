# Question 12 — Book Library Management

Create a class `Book` with the following private attributes:
- `bookId` (String)
- `title` (String)
- `author` (String)
- `genre` (String)
- `copiesAvailable` (int)

Write a parameterized constructor, and getter/setter methods for all attributes.
Also, include the following method:
- `boolean borrowBook(int count)`: Checks if the available copies are equal to or greater than the requested `count`. If yes, subtract the `count` from available copies and return `true`. Otherwise, return `false`.

Create a `Solution12` class with the `main` method and a static method:
- `static String findMostAvailable(Book[] books, String genre)`: Finds and returns the `bookId` of the book with the maximum number of `copiesAvailable` for the given matched `genre` (case-insensitive). If no book is found matching the genre, return `"NOT FOUND"`. 

In the `main` method:
1. Print `"Enter number of books: "` and read the value.
2. Read the details of the given number of `Book` objects (`bookId`, `title`, `author`, `genre`, `copiesAvailable`).
3. Print `"Enter target genre: "` and read the search parameter.
4. Print `"Enter target bookId and required copies: "` and read the target `bookId` and needed copies respectively.
5. Print the `bookId` of the book that has the highest availability for the given target genre using the `findMostAvailable` method.
6. Look for the book that has a matching `bookId` and attempt to borrow it using the `borrowBook` method. If successfully borrowed, print `"Borrow Successful"`. Otherwise, print `"Insufficient copies"`.
