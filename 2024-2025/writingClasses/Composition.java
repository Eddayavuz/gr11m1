public class Composition{
    public static void main(String[] args) {
        Library library1 = new Library("ACS Library", "Java Basics", "Intro to Sleep");

        library1.showBooks();
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
    private String libraryAddress;
    private Book book1;
    private Book book2;

    public Library(String libraryAddress, String book1Title, String book2Title){
        this.libraryAddress = libraryAddress;
        this.book1 = new Book(book1Title);
        this.book2 = new Book(book2Title);
    }


    public void showBooks() {
        System.out.println("In " + libraryAddress +" the available books are:");
        if (book1 != null) {
            System.out.println(book1.getTitle());
        }
        if (book2 != null) {
            System.out.println(book2.getTitle());
        }
    }
}
