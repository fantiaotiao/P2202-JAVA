package GUI;

import fun.Window;

import javax.swing.*;

public class NewBook {
    private JTextField textField1;
    private JTextField textField2;
    private JTextArea textArea1;
    private JTextField textField3;
    private JTextField textField4;
    private JButton 增加Button;
    private JPanel Newbook;

    public static void show() {
        JFrame frame = new JFrame("NewBook");
        frame.setContentPane(new NewBook().Newbook);

        frame.pack();
        frame.setVisible(true);
        Window.tocenter(frame);
    }
}
