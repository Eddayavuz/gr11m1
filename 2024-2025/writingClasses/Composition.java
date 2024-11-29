public class Composition {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook1("Java Basics");
        library.addBook2("Data Structures");
        library.showBooks();
    }
}

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class Library {
    private Book book1;
    private Book book2;

    public void addBook1(String title) {
        book1 = new Book(title);
    }

    public void addBook2(String title) {
        book2 = new Book(title);
    }

    public void showBooks() {
        if (book1 != null) {
            System.out.println(book1.getTitle());
        }
        if (book2 != null) {
            System.out.println(book2.getTitle());
        }
    }
}
