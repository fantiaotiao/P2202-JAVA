package GUI;

import fun.Window;

import javax.swing.*;

public class BooklistAddGUI {
    private JPanel panel1;
    private JButton List1;
    private JButton New;
    private JButton List3;

    public static void show(String[] args) {
        JFrame frame = new JFrame("BooklistAddGUI");
        frame.setContentPane(new BooklistAddGUI().panel1);
        Window.tocenter(frame);
        frame.pack();
        frame.setVisible(true);
    }

    private JButton List2;
}
