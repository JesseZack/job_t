package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;

public class Jesse extends JFrame{
    private JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton enterButton;
    private JTextField textField2;


    public Jesse() {
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Map<String,String> users = new HashMap();
                users.put("Jesse", "zaky");
                users.put("Rita", "jeky");
                String username = textField1.getText();
                String password = textField2.getText();

                String message =  (users.containsKey(username) && users.get(username).equals(password))?"Access Granted":"Username/Password Incorrect";

                JOptionPane.showMessageDialog(enterButton,message);
            }
        });
    }

    public static void main(String[] args) {
        Jesse jesse = new Jesse();
        jesse.setContentPane(jesse.panel1);
        jesse.setTitle("Verification");
        jesse.setSize(500,300);
        jesse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jesse.setVisible(true);
    }
}
