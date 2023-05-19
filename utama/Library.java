package utama;
import inner.Book;

// Main Class: Library
public class Library {
    public static void main(String[] args) {
        // Create instances of Book and DVD
        Book book = new Book("Java Programming", "John Doe");
       

        // Display library items
        book.display();
        System.out.println();
      
        // Borrow and return items
        book.borrowItem();
        book.rentItem();
        book.returnItem();
        System.out.println();
     
    }
}