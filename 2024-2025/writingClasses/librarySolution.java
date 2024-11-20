public class librarySolution {
    public static void main(String[] args) {
        // Task 4: Create two Book objects with different attributes
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", 277);
        Book book2 = new Book("1984", "George Orwell", 328);

        // Task 5: Call the displayDetails method for each object
        book1.displayDetails();
        book2.displayDetails();
    }
}

// Define the Book class
class Book {
    // Task 1: Add three attributes: title, author, and numberOfPages.
    String title;
    String author;
    int numberOfPages;

    // Constructor (Task 2: Initialize the attributes inside this constructor)
    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    // Task 3: Add a method displayDetails() to print the book's details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println();  // For better readability between books
    }
}
