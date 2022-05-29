package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//h klasi auti einai otan patame login h sign in na emfanizetai ena deutero parathiro to opoio na mporoume
//na eisagoume to username kai password

public class LogIn implements  ActionListener{
    //knoume tin parkatw anathesi wste na mporoume na xrisimopoioume tis metavlites kai se alles methodous

    private static JLabel userLabel;
    private static JFrame app;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static  JPasswordField passwordText;
    private static JButton submitButton;
    private static  JLabel success;






    LogIn(){
        JPanel panel = new JPanel();
        JFrame app = new JFrame("LOGIN");
        app.setSize(500,500);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);

        panel.setLayout(null);

         userLabel = new JLabel("User");
        userLabel.setBounds(50,40,80,25);
        panel.add(userLabel);

         userText = new JTextField();
        userText.setBounds(100,40,80,25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50,70,80,25);
        panel.add(passwordLabel);

         passwordText = new JPasswordField();
        passwordText.setBounds(120,70,80,25);
        panel.add(passwordText);

         submitButton = new JButton("LOGIN");
        submitButton.setBounds(50,100,80,25);
        submitButton.addActionListener(this);
        panel.add(submitButton);

        success = new JLabel();
        success.setBounds(10,140,300,25);
        panel.add(success);





        app.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        UserDesire userDesire = new UserDesire();
        app.dispose();
        //create_user();



    }

    //private void create_user() {
   // }


}
