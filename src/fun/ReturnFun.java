package fun;

import classlib.Book;
import classlib.Borrowrecord;

import java.util.List;

public class ReturnFun {
    List books = JBDC_Booklib.readBookData();
    public static boolean byID(int bookid){

        return false;
    }
    public static int getBookID(int currentpagenum, int index){
        List books = JBDC_Booklib.readBookData();
        int ID = (currentpagenum-1)*5+index;
        return ID;
    }
    public static String getBookname(int currentpagenum,int index) {
        int cloum = ReturnFun.getBookID(currentpagenum,index);
        List<Borrowrecord> record = JBDC_Borrowlib.readBorrowData();
        if (index>record.size()){
            return "";
        }
        Borrowrecord thisrecord = record.get(index-1);
        int bookid = thisrecord.getBorrowBookID();
        String bookname = JBDC_Booklib.querryBookbyID(bookid).getbookname();
        return bookname;
    }




    public static String getBookdesc(int currentpagenum,int index) {
        int cloum = ReturnFun.getBookID(currentpagenum,index);
        List<Book> books = JBDC_Borrowlib.readBorrowData();
        String bookdesc = books.get(cloum-1).getdescribe();
        return bookdesc;
    }

    public static String getMaxPagenum() {
        List books = JBDC_Borrowlib.readBorrowData();
        int Maxpagenum = books.size()/5+1;
        return String.valueOf(Maxpagenum);
    }


    public static boolean returnbook(int currentpagenum, int index) {
        int cloum = ReturnFun.getBookID(currentpagenum,index);
        List<Borrowrecord> record = JBDC_Borrowlib.readBorrowData();
        if (index>record.size()){
            return false;
        }
        Borrowrecord thisrecord = record.get(index-1);
        int bookid = thisrecord.getBorrowBookID();
        Book updateState=JBDC_Booklib.querryBookbyID(bookid);
        updateState.setState(0);
        boolean flag = JBDC_Booklib.editBookData(bookid,updateState);
        JBDC_Borrowlib.deletebyID(index);
        return flag;
    }
}

