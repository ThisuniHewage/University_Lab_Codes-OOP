package Question03;

//Book Class
class Book{
    private String title;

    public String getDetails(){
        return title;
    }

    public Book(String title) {
        this.title = title;
    }
}

// Library class
class Library{

    //borrowBook()
    public void borrowBook(Book book){
        System.out.println("Borrowing: " + book.getDetails());
    }


    // returnBook ()
    public void returnBook(Book book){
        System.out.println("Returning: " + book.getDetails());
    }
}

//class with the main method
public class LibraryApp {
    public static void main(String[] args) {
        Book book = new Book("Java Programming");
        Library library = new Library();
        library.borrowBook(book);
        library.returnBook(book);
    }
}
