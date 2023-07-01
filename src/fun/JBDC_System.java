package fun;

import java.sql.*;

public class JBDC_System {
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
            conn=DriverManager.getConnection(url,user,pass);
            ps=conn.prepareStatement("select*from system");
            rs= ps.executeQuery();
            while (rs.next()) {
                rs.getInt(id);//根据列的索引取值
                int borrowmaxnum = rs.getInt(2);
                int borrowdatenum = rs.getInt(3);
                System.out.println(id + "," + borrowmaxnum + "," + borrowdatenum + ",");
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
            ps=conn.prepareStatement("delete from system where borrowmaxnum=?");
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
    public static void insert(int id,int borrowmaxnum,int borrowdatenum) throws ClassNotFoundException, SQLException {
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/library";
            String user = "root";
            String pass = "123";
            conn=DriverManager.getConnection(url,user,pass);
            ps=conn.prepareStatement("DELETE FROM Table_name");
            ps=conn.prepareStatement("insert into system values(?,?,?)");
            ps.setInt(1,id);
            ps.setInt(2,borrowmaxnum);
            ps.setInt(3,borrowdatenum);
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
            ps=conn.prepareStatement("update system set borrowmaxnum = ? where borrowmaxnum = ?");
            ps.setInt(1,3);
            ps.setInt(2,1);
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
//        insert(2,2,3);
//        update();
    }
}
