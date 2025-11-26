import java.util.Scanner;

class LibraryBook{

   //a) private attributes of the class LibraryBook
    private String bookId;
    private String title;
    private String author;
    private int copiesAvailable;

    // b) Constructor of class Library with 4 parameters
    public LibraryBook(String bookId, String title, String author, int copiesAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    // c) implementation of lendBook()
    public void lendBook(int numOfCopies) {
        if(copiesAvailable < numOfCopies){
            System.out.println("Not enough copies available. Please check later");
        }

        else{
            copiesAvailable -= numOfCopies;
            System.out.println("Book issued successfully");
        }
    }


    // d) implementation of printBookDetails()
    public void printBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Copies available: " + copiesAvailable);
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            // d) Getting user inputs for two books
            System.out.println("Enter the details of book 1" );
            System.out.println("----------------------------");
            System.out.println("Enter the book ID: ");
            String bookId = sc.nextLine();
            System.out.println("Enter the title: ");
            String title = sc.nextLine();
            System.out.println("Enter the author: ");
            String author = sc.nextLine();
            System.out.println("Enter the copies available: ");
            int copiesAvailable = sc.nextInt();

            // Creating LibraryBook object
            LibraryBook book1 = new LibraryBook(bookId, title, author, copiesAvailable);

        // Getting user inputs for the next book
        System.out.println("Enter the details of book 2" );
        System.out.println("----------------------------");
        System.out.println("Enter the book 2 ID: ");
        String bookId2 = sc.nextLine();
        System.out.println("Enter the title: ");
        String title2 = sc.nextLine();
        System.out.println("Enter the author: ");
        String author2 = sc.nextLine();
        System.out.println("Enter the copies available: ");
        int copiesAvailable2 = sc.nextInt();

        // creating the second LibraryBook object
        LibraryBook book2 = new LibraryBook(bookId2, title2, author2, copiesAvailable2);


        //e) i Getting the number of copies the members want s user inputs
        System.out.println("Enter the number of copies you want from book 1");
        int book1Copies = sc.nextInt();

        System.out.println("Enter the number of copies you want from book 2");
        int book2Copies = sc.nextInt();

        // e) ii
        book1.lendBook(book1Copies);
        book2.lendBook(book2Copies);

        // e) iii
        book1.printBookDetails();
        book2.printBookDetails();
    }
}
