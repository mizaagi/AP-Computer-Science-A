package Q4.LibraryManagementLab;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Library implements LibrarySystem {
    private ArrayList<Book> titleBooks;
    private ArrayList<Book> books;
    private ArrayList<Patron> patrons;
    private ArrayList<Transaction> transactions;

    // TODO: Implement the constructor (DONE)
    public Library(ArrayList<Book> b, ArrayList<Patron> p, ArrayList<Transaction> t) {
        books = b;
        patrons = p;
        transactions = t;
    }

    // Implement interface methods
    @Override
    public void addBook(Book book) {

    }
    @Override
    public void removeBook(String isbn) {
        for (int i = 0; i < books.size(); i++)
            if (books.get(i).getIsbn().equals(isbn)) {
                books.remove(i);
                i--;
            }
    }
    // Other methods...

    @Override
    public void viewMostRecentTransaction(String isbn) {
        // Hint: Use a backward loop to find the most recent transaction
        // If no transaction is found, print "No transactions found for ISBN: <isbn>"
    }

    // TODO: Complete the implementation of LibrarySystem methods
    public void addPatron(Patron p) { // DONE
        patrons.add(p);
    }

    public void removePatron(String patronId) { // DONE!
        for (Patron p : patrons) {
            if (p.getPatronId().equals(patronId)) patrons.remove(p);
        }
    }

    public void createTransaction(String isbn, String patronId, String checkoutDate) { // DONE
        Transaction t = new Transaction(isbn, patronId, checkoutDate);
        transactions.add(t);
    }

    public void updateTransaction(String isbn, String patronId, String returnDate) {
        for (Transaction t : transactions) {
            if (t.getIsbn().equals(isbn) && t.getPatronId().equals(isbn)) {
                t.setReturnDate(returnDate);
            }
        }
    }

    public boolean checkoutBook(String isbn, String patronId) {
        createTransaction(isbn, patronId, getDateToday());
        for (int lcv = 0; lcv < books.size(); lcv++)
            if (books.get(lcv).getIsbn().equals(isbn)) {
                books.get(lcv).setCheckedOut(true);
            } else if (lcv == books.size() - 1) System.out.println("Can't find book!");
        return true;
    }

    public boolean checkinBook(String isbn, String patronId) {
        updateTransaction(isbn, patronId, getDateToday());
        for (int lcv = 0; lcv < books.size(); lcv++)
            if (books.get(lcv).getIsbn().equals(isbn)) {
                books.get(lcv).setCheckedOut(false);
            } else if (lcv == books.size() - 1) System.out.println("Can't find book!");
        return true;
    }


    // TODO: Implement searchBookByTitle and searchBookByAuthor using binary search

    @Override
    public Book findClosestBook(String title) {
        // TODO: Search for the closest book title using .toLowerCase() and .contains(); return the closest book or null
    }

    @Override
    public Book searchBookByTitle(String title) {
        // TODO: Binary search for book; if not found, return the closest book
    }

    public Book searchBookByAuthor(String author) {

    }

    // You might want to add some helper methods here like getBookByIsbn, getPatronById, etc.

    /* ========== DO NOT MODIFY ========== */
    public static String getDateToday() {
        return Instant.now().atZone(ZoneOffset.UTC).format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
