package classlib;

public class Borrowrecord {
     static int id;
     static int BorrowBookID;
    static String BorrowUserID;
     static String BorrowDate;
    static String ReturnDate;
    static int status;

    public Borrowrecord(int id, int borrowBookID, String borrowUserID, String borrowDate, String returnDate, int status) {
        this.id = id;
        BorrowBookID = borrowBookID;
        BorrowUserID = borrowUserID;
        BorrowDate = borrowDate;
        ReturnDate = returnDate;
        this.status = status;
    }

    public  int getId() {
        return id;
    }

    public  void setId(int id) {
        Borrowrecord.id = id;
    }

    public int getBorrowBookID() {
        return this.BorrowBookID;
    }

    public  void setBorrowBookID(int borrowBookID) {
        BorrowBookID = borrowBookID;
    }

    public  String getBorrowUserID() {
        return BorrowUserID;
    }

    public static void setBorrowUserID(String borrowUserID) {
        BorrowUserID = borrowUserID;
    }

    public static String getBorrowDate() {
        return BorrowDate;
    }

    public static void setBorrowDate(String borrowDate) {
        BorrowDate = borrowDate;
    }

    public static String getReturnDate() {
        return ReturnDate;
    }

    public static void setReturnDate(String returnDate) {
        ReturnDate = returnDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
