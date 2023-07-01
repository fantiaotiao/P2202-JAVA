package fun;

import classlib.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class LoginFUN {

    /**
     * 登录方法，返回是否登录成功
     *
     * @param type 用户类型
     * @param user 用户名（手机号）
     * @param pass 密码
     * @return boolean T成功，F失败
     */
    public boolean loginfun(int type,String user,String pass){
        switch (type){
            case 0:
                User userlogin = JBDC_User.querryUserbyPhone(user);

                if (userlogin!=null){
                    if (userlogin.getPass().equals(pass)){
                        System.out.println(userlogin.getUser()+"登录成功");
                        return true;
                    }
                }
                break;
            case 1:
                return true;
        }
        return false;
    }
}


