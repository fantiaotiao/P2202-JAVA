package GUI;

import fun.Window;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorrowGUI {
    private JPanel borrow;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JButton 搜索Button;
    private JButton B1;
    private JButton A1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    public BorrowGUI(){
        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public static void show() {
        JFrame frame = new JFrame("BorrowGUI");
        frame.setContentPane(new BorrowGUI().borrow);
        frame.pack();
        frame.setVisible(true);
        Window.tocenter(frame);
    }
}
