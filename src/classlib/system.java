package classlib;

import java.util.function.Function;

public class system {
    static String mysql_admin = "root";
    static String mysql_pass = "123456";
    static String Defaultavatar="D:\\Project\\Project practice\\P2202\\P2202-JAVA\\src\\bin\\avatar.jpg";
    static String user;
    public static String format(String s){
        if (!s.contains("/'")){
            s="\""+s+"\"";
        }
        return s;
    }
    public static String getDefaultavatar() {
        return Defaultavatar;
    }

    public static void setDefaultavatar(String defaultavatar) {
        Defaultavatar = defaultavatar;
    }

    static int type;

    public static void setMysql_admin(String mysql_admin) {
        system.mysql_admin = mysql_admin;
    }

    public static void setMysql_pass(String mysql_pass) {
        system.mysql_pass = mysql_pass;
    }

    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        system.user = user;
    }

    public static int getType() {
        return type;
    }

    public static void setType(int type) {
        system.type = type;
    }

    public static String getMysql_pass() {
        return mysql_pass;
    }
    public static String getMysql_admin() {
        return mysql_admin;
    }

}
