package classlib;

import java.util.Date;


public class Admin {
    String user;
    String pass;
    String avator;
    String phone;
    String A1;
    String A2;
    String A3;


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAvator() {
        return avator;
    }

    public void setAvator(String avator) {
        this.avator = avator;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getA1() {
        return A1;
    }

    public void setA1(String a1) {
        A1 = a1;
    }

    public String getA2() {
        return A2;
    }

    public void setA2(String a2) {
        A2 = a2;
    }

    public String getA3() {
        return A3;
    }

    public void setA3(String a3) {
        A3 = a3;
    }

    public Admin(String user, String pass, String avator, String phone, String a1, String a2, String a3) {
        this.user = user;
        this.pass = pass;
        this.avator = avator;
        this.phone = phone;
        A1 = a1;
        A2 = a2;
        A3 = a3;
    }
}












