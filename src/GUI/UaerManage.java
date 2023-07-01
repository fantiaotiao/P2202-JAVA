package GUI;

import fun.Window;

import javax.swing.*;

public class UaerManage {
    private JTable table1;
    private JButton 删除用户Button;
    private JPanel UserManage;

    public static void show() {
        JFrame frame = new JFrame("UaerManage");
        frame.setContentPane(new UaerManage().UserManage);
        Window.tocenter(frame);
        frame.pack();
        frame.setVisible(true);
    }
}
