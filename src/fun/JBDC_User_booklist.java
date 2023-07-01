package fun;

import java.sql.*;

public class JBDC_User_booklist {
    //查询
    public static void selectbyListid(int listid) throws ClassNotFoundException, SQLException {
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/library";
            String user = "root";
            String pass = "123";
            conn= DriverManager.getConnection(url,user,pass);
            ps=conn.prepareStatement("select*from user_booklist");
            rs= ps.executeQuery();
            while (rs.next()) {
                rs.getInt(listid);//根据列的索引取值
                int userid = rs.getInt(2);
                int list = rs.getInt(3);
                System.out.println(listid + "," + userid + "," + list + ",");
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
    public static void deletebyListid(int listid) throws ClassNotFoundException, SQLException {
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/library";
            String user = "root";
            String pass = "123";
            conn=DriverManager.getConnection(url,user,pass);
            ps=conn.prepareStatement("delete from user_booklist where userid=?");
            ps.setInt(listid,1);
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
    public static void insert(int listid, int userid, String list) throws ClassNotFoundException, SQLException {
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/library";
            String user = "root";
            String pass = "123";
            conn=DriverManager.getConnection(url,user,pass);
            ps=conn.prepareStatement("insert into user_booklist values(?,?,?)");
            ps.setInt(1,listid);
            ps.setInt(2,userid);
            ps.setString(3,list);
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
    public static void update() throws ClassNotFoundException, SQLException {
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/library";
            String user = "root";
            String pass = "123";
            conn=DriverManager.getConnection(url,user,pass);
            ps=conn.prepareStatement("update user_booklist set userid = ? where userid = ?");
            ps.setInt(1,1);
            ps.setInt(2,2);
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
//          selectbyListid(1);
//          deletebyListid(1);
//        insert(2,2,"1,3");
//        update();
    }
}
