package fun;

import java.sql.*;

public class JBDC_Borrowlib {
    //查询
    public static void selectbyID(int id) throws ClassNotFoundException, SQLException {
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/library";
            String user = "root";
            String pass = "123";
            conn= DriverManager.getConnection(url,user,pass);
            ps=conn.prepareStatement("select*from borrowlib where id =?");
            ps.setInt(1,id);
            rs= ps.executeQuery();
            while (rs.next()) {
                rs.getInt(id);//根据列的索引取值
                int BorrowBookID = rs.getInt(2);
                int BorrowUserID = rs.getInt(3);
                String BorrowDate = rs.getString(4);
                String ReturnDate = rs.getString(5);
                int status = rs.getInt(6);
                System.out.println(id + "," + BorrowBookID + "," + BorrowUserID + ","+ BorrowDate + ","+ ReturnDate + ","+ status + ",");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (rs!=null) {
                    rs.close();
                }
                if (ps!=null){
                    ps.close();
                }
                if (conn!=null){
                    conn.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


    //删除
    public static void deletebyID(int id) throws ClassNotFoundException, SQLException {
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/library";
            String user = "root";
            String pass = "123";
            conn=DriverManager.getConnection(url,user,pass);
            ps=conn.prepareStatement("delete from borrowlib where id=?");
            ps.setInt(id,1);
            int i=ps.executeUpdate();
            if (i>0){
                System.out.println("删除成功");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (ps!=null){
                    ps.close();
                }
                if (conn!=null){
                    conn.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    //插入
    public static void insert(int id,int BorrowBookID,int BorrowUserID,String BorrowDate,String ReturnDate,int status) throws ClassNotFoundException, SQLException {
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/library";
            String user = "root";
            String pass = "123";
            conn=DriverManager.getConnection(url,user,pass);
            ps=conn.prepareStatement("DELETE FROM Table_name");
            ps=conn.prepareStatement("insert into borrowlib values(?,?,?,?,?,?)");
            ps.setInt(1,id);
            ps.setInt(2,BorrowBookID);
            ps.setInt(3,BorrowUserID);
            ps.setString(4,BorrowDate);
            ps.setString(5,ReturnDate);
            ps.setInt(6,status);
            int i=ps.executeUpdate();
            if (i>0){
                System.out.println("插入成功");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (ps!=null){
                    ps.close();
                }
                if (conn!=null){
                    conn.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    //更改
    public static void update(int id,int BorrowBookID,int BorrowUserID,String BorrowDate,String ReturnDate,int status) throws ClassNotFoundException, SQLException {
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/library";
            String user = "root";
            String pass = "123";
            conn=DriverManager.getConnection(url,user,pass);
            ps=conn.prepareStatement("update borrowlib set BorrowBookID = ?,BorrowUserID=?,BorrowDate=?,ReturnDate=?,status=? where id = ?");
            ps.setInt(6,id);
            ps.setInt(1,BorrowBookID);
            ps.setInt(2,BorrowUserID);
            ps.setString(3,BorrowDate);
            ps.setString(4,ReturnDate);
            ps.setInt(5,status);
            int i=ps.executeUpdate();
            if (i>0){
                System.out.println("修改成功");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (ps!=null){
                    ps.close();
                }
                if (conn!=null){
                    conn.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//          selectbyID(1);
//          deletebyID(1);
//        insert(1,1,1,"2022-07-01","2022-07-03",6);
//        update(1,1,2,"2022-07-01","2022-07-03",2);
    }
}
