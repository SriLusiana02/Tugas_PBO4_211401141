package inner;

import abstrak.LibraryItem;

// Inner Class: Book
public class Book extends LibraryItem implements Rentable {
    String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public
    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }

    @Override
    public void rentItem() {
        System.out.println("Book rented: " + title);
    }

    @Override
    public void returnItem() {
        System.out.println("Book returned: " + title);
    }
}

