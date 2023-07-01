package GUI;


import fun.LoginFUN;
import fun.Window;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginGUI {
    static JFrame frame;
    private JPanel login;
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton;
    private JLabel username;
    private JLabel password;
    private JCheckBox AdminCheckBox;
    private JLabel Register;
    private JLabel Retrieve;
    public LoginGUI(){
        Register.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                RegisterDialog dialog = new RegisterDialog("",0);
                dialog.pack();
                dialog.setVisible(true);
                System.exit(0);
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = passField.getText();
                int type=0;//用户类型，默认为普通用户，当复选框选中时变为1
                if(AdminCheckBox.isSelected()){
                    type=1;
                }
                boolean islogin = false ;//是否成功登录,初始为失败
                islogin = new LoginFUN().loginfun(type,username,password);
                if(islogin&&type==0){
                    userGUI.show();
                    LoginGUI.close();
                }else if(islogin){
                    AdminGUI.show();
                    LoginGUI.close();
                }else {
                    JOptionPane.showMessageDialog(login,"登录失败,请检查用户名或密码！");
                }
            }
        });
    }


    public static void show() {
        frame = new JFrame("LoginGUI");
        frame.setContentPane(new LoginGUI().login);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        Window.tocenter(frame);
    }
    public static void close(){
        frame.setVisible(false);
    }
}
