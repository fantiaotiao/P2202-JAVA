package GUI;

import fun.Window;

import javax.swing.*;

public class Bookmanagement {
    private JButton button1;
    private JButton button2;
    private JButton 删除Button;
    private JButton 修改Button;
    private JButton 新增Button;
    private JPanel Manage;

    public static void show() {
        JFrame frame = new JFrame("Bookmanagement");
        frame.setContentPane(new Bookmanagement().Manage);

        frame.pack();
        frame.setVisible(true);
        Window.tocenter(frame);
    }
}
