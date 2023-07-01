package fun;

import GUI.BorrowGUI;
import classlib.Book;


import javax.xml.crypto.Data;
import java.sql.SQLException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class BorrowFun {
    List books = JBDC_Booklib.readBookData();
    public static boolean BorrowbyID(int bookid){

        return false;
    }
    public static int getBookID(int currentpagenum,int index){
        List books = JBDC_Booklib.readBookData();
        int ID = (currentpagenum-1)*5+index;
        return ID;
    }
    public static String getBookname(int currentpagenum,int index) {
        int cloum = BorrowFun.getBookID(currentpagenum,index);
        List<Book> books=  JBDC_Booklib.readBookData();
        String bookname = books.get(cloum-1).getbookname();
        return bookname;
    }
    public static String getBookdesc(int currentpagenum,int index) {
        int cloum = BorrowFun.getBookID(currentpagenum,index);
        List<Book> books=  JBDC_Booklib.readBookData();
        String bookname = books.get(cloum-1).getbookname();
        return bookname;
    }

    public static String getMaxPagenum() {
        List books = JBDC_Booklib.readBookData();
        int Maxpagenum = books.size()/5;
        return String.valueOf(Maxpagenum);
    }

    public static boolean borrowBook(int bookID, String borrowUserID) {
        Date today = new Date();

        SimpleDateFormat Format = new SimpleDateFormat("yyyy-MM-dd");
        String borrowData = Format.format(today);
        Calendar returnDate = Calendar.getInstance();
        returnDate.add(Calendar.DATE, 15);
        String returndate = Format.format(returnDate.getTime());
        Book BorrowBook = JBDC_Booklib.querryBookbyID(bookID);
        boolean flag =  JBDC_Borrowlib.addBookData(BorrowBook.getid(),borrowUserID,borrowData,returndate,1);
        return true;
    }

    public static void main(String[] args) {
        borrowBook(1,"11");
    }

}
