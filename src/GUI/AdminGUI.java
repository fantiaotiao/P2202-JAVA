package GUI;

import fun.Window;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import classlib.*;
import GUI.*;
public class AdminGUI {
    private JTabbedPane tabbedPane1;

    private JPanel admin;
    private JLabel Myinfor;
    private JLabel BookM;
    private JLabel UserM;
    private JLabel OutM;
    public AdminGUI() {
        Myinfor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MyinforGUI.show(1,system.getUser());
                super.mouseClicked(e);
            }
        });
        BookM.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Bookmanagement.show();
                super.mouseClicked(e);
            }
        });
        OutM.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                OverduemanageGUI.show();
                super.mouseClicked(e);
            }
        });
        UserM.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                UaerManage.show();
                super.mouseClicked(e);
            }
        });

    }

    public static void show() {
        JFrame frame = new JFrame("AdminGUI");
        frame.setContentPane(new AdminGUI().admin);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        Window.tocenter(frame);
    }

}
