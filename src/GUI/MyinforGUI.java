package GUI;

import fun.*;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyinforGUI {
    String username;
    private JTextPane userTextPane;
    private JPasswordField passwordField1;
    public MyinforGUI(int type,String username){
        this.username=username;

        avatar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                file.filecopy("./bin/"+username);
                super.mouseClicked(e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
            }
        });
    }
    public static void show(int type,String username) {

        JFrame frame = new JFrame("MyinforGUI");
        frame.setContentPane(new MyinforGUI(type,username).Myinfor);
        frame.pack();
        frame.setVisible(true);
        Window.tocenter(frame);
    }

    private JTextField textField1;
    private JButton 更新信息Button;
    private JPanel Myinfor;
    private JPanel avatar;
}
