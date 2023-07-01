package GUI;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;

import GUI.*;
import fun.*;
import classlib.*;
import fun.Window;

public class userGUI{
    private JButton exitButton;
    private JPanel user;

    private JLabel avatar;


    private JLabel username;
    private JTabbedPane tabbedPane1;
    private JButton BorrowButton;
    private JButton ReturnButton;
    private JTabbedPane tabbedPane2;
    public userGUI(){
        BorrowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BorrowGUI.show();
            }
        });
        ReturnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReturnGUI.show();
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        avatar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MyinforGUI.show(0,system.getUser());
                super.mouseClicked(e);
            }
        });
        String path = "C:\\Users\\27726\\Desktop\\英语书\\1b7bff103f01bd7d.jpg";
        ImageIcon img = new ImageIcon(path);

        avatar.setIcon(new ImageIcon(path));



    }




    public static void show() {
        JFrame frame = new JFrame("userGUI");
        frame.setContentPane(new userGUI().user);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        Window.tocenter(frame);

    }

    public static void main(String[] args) {
        show();
    }


}
