package Question01;
class Author{
    private String name;
    private Book [] books;
    int count = 0;

    public Author(String name, int size) {
        this.name = name;
        this.books = new Book[size];
    }

    public void addBook(Book book){
        if(count < books.length){
            books[count++]=book;
        }
    }

    public void displayBooks(){
        System.out.println("Author: " + name);
        System.out.println("Books: ");
        for(Book book : books){
            System.out.println("-" + book.getTitle());
        }
    }

}

class Book{
    private String title;
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetails(){
        System.out.println("Book: " + title + ", Author: " + author);
    }

    public String getTitle() {
        return title;
    }
}

public class BookApp {
    public static void main(String[] args) {
        Author a1 = new Author("J.K. Rowling", 2);
        Book b1 = new Book("Harry Potter" , a1);
        Book b2 = new Book("Fantastic Beasts" , a1);
        a1.addBook(b1);
        a1.addBook(b2);
        a1.displayBooks();
        b1.displayDetails();
        b2.displayDetails();

    }
}
