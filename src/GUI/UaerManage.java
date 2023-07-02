package GUI;

import fun.JBDC_User;
import fun.Window;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UaerManage {
    private JTable table1;
    private JButton delButton;
    private JPanel UserManage;
    private JButton editButton;

    public static void show() {

        JFrame frame = new JFrame("UaerManage");
        frame.setContentPane(new UaerManage().UserManage);
        Window.tocenter(frame);
        frame.pack();
        frame.setVisible(true);
    }

    public UaerManage() {
        delButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               String inputPhone =  JOptionPane.showInputDialog("请输入你要删除的用户手机号");
               if (JBDC_User.deleteUserbyPhone(inputPhone)){
                    JOptionPane.showMessageDialog(null,"删除成功");
            }
        }});
        editButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String phone1 =  JOptionPane.showInputDialog("请输入你要修改的用户手机号");
                String phone2 =  JOptionPane.showInputDialog("请输入你的新用户手机号");
                String user1 =  JOptionPane.showInputDialog("请输入你要修改的密码");

                String user2 =  JOptionPane.showInputDialog("请输入你的新密码");

                if (JBDC_User.editUserbyPhone(phone1,phone2)){
                    JOptionPane.showMessageDialog(null,"修改成功");
                }
                if (JBDC_User.editUserbyPhone(user1,user2)){
                    JOptionPane.showMessageDialog(null,"修改成功");
                }
            }

        });


    }

    public static void main(String[] args) {
        show();
    }


}


