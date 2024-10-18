package org.howard.edu.lsp.midterm.question1;

/* Given:
You are given a class Book that represents a book in a library. The Book class has the following attributes:
•	title (String): The title of the book.
•	author (String): The author of the book.
•	ISBN (String): The ISBN number of the book (a unique identifier).
•	yearPublished (int): The year the book was published.
Task:
1.	Write the Book class with appropriate constructors, getters, and setters.  Be mindful of encapsulation in your declarations. (5 pts.)
2.	Override the boolean equals(Object) method in the Book class so that two Book objects are considered equal if they have the same ISBN and author. (5 pts.)
3.	Override the String toString() method in the Book class to return a meaningful string representation of a Book object (see sample output below)  (5 pts.)
4.	Create a BookDriver class that instantiates your Book class and executes the following:
...
Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);
System.out.println(book1.equals(book2)); // true
System.out.println(book1.equals(book3)); // false
System.out.println(book1); // Output: Title: The Great Gatsby, Author: F. Scott Fitzgerald, ISBN: 123456789, Year Published: 1925
*/

public class Book {
    private String title, author, ISBN; 
    private int yearPublished;

    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title; this.author = author; this.ISBN = ISBN; this.yearPublished = yearPublished;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book otherBook = (Book) obj;
        return ISBN.equals(otherBook.ISBN) && author.equals(otherBook.author);
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}
