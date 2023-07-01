package GUI;

import javax.swing.*;
import fun.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RetrieveGUI {
    private JTextField username;
    private JTextField answer;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JButton OKButton;
    private JPanel Retrieve;
    private JLabel question;

    public RetrieveGUI() {
        question.setText(RetrieveFun.getQuestion());
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user =  username.getText();
                String ques = question.getText();
                String answer = username.getText();
                String pass1 = String.valueOf(passwordField1.getPassword());
                String pass2 = String.valueOf(passwordField2.getPassword());
                String whileerro =RetrieveFun.Rest(user,ques,answer,pass1,pass2);
                if(whileerro==""){
                    JOptionPane.showMessageDialog(null,"修改成功");
                }else {
                    JOptionPane.showMessageDialog(null,whileerro);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("RetrieveGUI");
        frame.setContentPane(new RetrieveGUI().Retrieve);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
