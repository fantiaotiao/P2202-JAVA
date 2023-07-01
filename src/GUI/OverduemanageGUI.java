package GUI;

import fun.Window;

import javax.swing.*;

public class OverduemanageGUI {
    private JTable table1;
    private JButton 一键催促Button;
    private JPanel Overduce;

    public static void show() {
        JFrame frame = new JFrame("OverduemanageGUI");
        frame.setContentPane(new OverduemanageGUI().Overduce);
        Window.tocenter(frame);
        frame.pack();
        frame.setVisible(true);
    }
}
