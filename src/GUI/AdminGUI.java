package GUI;

import fun.Window;

import javax.swing.*;

public class AdminGUI {
    private JTabbedPane tabbedPane1;

    public static void show() {
        JFrame frame = new JFrame("AdminGUI");
        frame.setContentPane(new AdminGUI().admin);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        Window.tocenter(frame);
    }

    private JPanel admin;
}
