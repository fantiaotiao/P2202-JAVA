package fun;

import classlib.User;
import com.mysql.jdbc.SocketFactory;
import classlib.*;
import com.sun.security.auth.UserPrincipal;
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.net.Proxy;
import java.util.Random;

public class RetrieveFun {
    public static String getQuestion() {
        Random i = new Random();
        int t = i.nextInt(3);
        System.out.println(t);
        switch (t) {
            case 0:
                return "你的名字是";

            case 1:
                return "你最崇拜的人是";

            case 2:
                return "你的生日是";

        }
        return null;
    }


    public static String Rest(String user, String ques, String answer, String pass1, String pass2) {
        User resetUser = JBDC_User.querryUserbyPhone(user);
        if (resetUser == null) {
            return "改用户不存在";
        }
        if (ques.contains("名")) {
            if (resetUser.getA1().equals(answer)) {
                if (pass1.equals(pass2)) {
                    return "";
                }
            }
        }
        return "";

    }


}
