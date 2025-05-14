package Q4.LibraryManagementLab;

public class Transaction {
    private String isbn;
    private String patronId;
    private String checkoutDate; // Simple date format
    private String returnDate; // Optional, can be null if not returned yet

    // TODO: Implement constructor (isbn, patronId, checkoutDate); set returnDate to null by default
    public Transaction(String i, String p, String c) {
        isbn = i;
        patronId = p;
        checkoutDate = c;
        returnDate = null;
    }

    // TODO: Implement getters and setters
    public String getIsbn() { return isbn; }
    public String getPatronId() { return patronId; }
    public String getCheckoutDate() { return checkoutDate; }
    public String getReturnDate() { return returnDate; }

    public void setIsbn(String i)         { isbn = i;         }
    public void setPatronId(String p)     { patronId = p;     }
    public void setCheckoutDate(String c) { checkoutDate = c; }
    public void setReturnDate(String r)   { returnDate = r;   }

    @Override
    public String toString() {
        return "Transaction{" +
                "isbn='" + isbn + '\'' +
                ", patronId='" + patronId + '\'' +
                ", checkoutDate='" + checkoutDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }
}
