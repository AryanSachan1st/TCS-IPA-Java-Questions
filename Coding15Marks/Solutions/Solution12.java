package Coding15Marks.Solutions;

import java.util.Scanner;

class Book {
    private String bookId, title, author, genre;
    private int copiesAvailable;

    // constructor
    public Book(String bookId, String title, String author, String genre, int copiesAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.copiesAvailable = copiesAvailable;
    }

    // setters
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setAvailCopies(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    // getters
    public String getBookId() {
        return this.bookId;
    }
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public String getGenre() {
        return this.genre;
    }
    public int getAvailableCopies() {
        return this.copiesAvailable;
    }

    // methods
    public boolean borrowBook(int count) {
        if (this.getAvailableCopies() >= count) {
            this.setAvailCopies(this.getAvailableCopies() - count);
            return true;
        }
        return false;
    }
}

public class Solution12 {
    private static String findMostAvailable(Book[] books, String genre) {
        int maxCopies = Integer.MIN_VALUE;
        Book resultantBook = null;

        for (Book book: books) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                if (book.getAvailableCopies() > maxCopies) {
                    maxCopies = book.getAvailableCopies();
                    resultantBook = book;
                }
            }
        }

        return (resultantBook != null) ? resultantBook.getBookId() : "NOT FOUND";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        Book[] books = new Book[n];

        for (int i=0; i<n; i++) {
            System.out.print("Enter bookId: ");
            String bookId = sc.nextLine();

            System.out.print("Enter title: ");
            String title = sc.nextLine();

            System.out.print("Enter author: ");
            String author = sc.nextLine();

            System.out.print("Enter genre: ");
            String genre = sc.nextLine();

            System.out.print("Enter num of copies: ");
            int copies = sc.nextInt();
            sc.nextLine();

            Book book = new Book(bookId, title, author, genre, copies);
            books[i] = book;
        }

        System.out.print("Enter target genre: ");
        String targetGenre = sc.nextLine();

        System.out.print("Enter target bookId and required copies: ");
        String targetBookId = sc.nextLine();
        int targetCopies = sc.nextInt();

        System.out.println(findMostAvailable(books, targetGenre));

        boolean booksAvail = false;
        for (Book book: books) {
            if (book.getBookId().equalsIgnoreCase(targetBookId)) {
                booksAvail = book.borrowBook(targetCopies);
            }
        }
        if (booksAvail) {
            System.out.print("Borrow Successful");
        } else {
            System.out.print("Insufficient copies");
        }

        sc.close();
    }
}
