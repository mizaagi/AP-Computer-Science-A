package Q3.LibraryManagementLab;

import java.util.ArrayList;

public class Patron {
    private String name;
    private String patronId;
    private ArrayList<Book> checkedOutBooks;

    // TODO: Implement constructor (name, patronId)
    public Patron(String n, String pI) {
        name = n;
        patronId = pI;
        checkedOutBooks = new ArrayList<Book>();
    }

    // Basic getters
    public String getName() { return name; }
    public String getPatronId() { return patronId; }

    // TODO: Implement checkInBook(Book book) and checkOutBook(Book book) methods (remove/add book from checkedOutBooks)
    public void checkInBook(Book book) {
        book.setCheckedOut(false);
        checkedOutBooks.add(book);
    }

    public void checkOutBook(Book book) {
        book.setCheckedOut(true);
        checkedOutBooks.remove(book);
    }
    // Don't forget to set the book's checkedOut field to true/false
}
