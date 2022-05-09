package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp implements ActionListener {


    private static JLabel nameLabel;
    private static JLabel surnameLabel;
    private static JLabel userLabel;
    private static JLabel vehicleLabel;
    private static JTextField vehicleText;
    private static JFrame app;
    private static JTextField nameText;
    private static JTextField surnameText;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static  JPasswordField passwordText;
    private static JButton submitButton;
    private static  JLabel success;




    SignUp(){
        JPanel panel = new JPanel();
        JFrame app = new JFrame("SIGN UP");
        app.setSize(500,500);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);

        panel.setLayout(null);

        nameLabel = new JLabel("Name");
        nameLabel.setBounds(50,20,80,25);
        panel.add(nameLabel);

        nameText = new JTextField();
        nameText.setBounds(100,20,80,25);
        panel.add(nameText);

        surnameLabel = new JLabel("Surname");
        surnameLabel.setBounds(50,50,80,25);
        panel.add(surnameLabel);

        surnameText = new JTextField();
        surnameText.setBounds(100,50,80,25);
        panel.add(surnameText);


        userLabel = new JLabel("User");
        userLabel.setBounds(50,80,80,25);
        panel.add(userLabel);

        userText = new JTextField();
        userText.setBounds(100,80,80,25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50,110,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(120,110,80,25);
        panel.add(passwordText);

        vehicleLabel = new JLabel("Vehicle");
        vehicleLabel.setBounds(50,140,80,25);
        panel.add(vehicleLabel);

        vehicleText = new JTextField();
        vehicleText.setBounds(100,140,80,25);
        panel.add(vehicleText);



        submitButton = new JButton("SIGN UP");
        submitButton.setBounds(50,190,80,25);
        submitButton.addActionListener(this);
        panel.add(submitButton);


        app.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        String name = nameText.getText();
        String surname = surnameText.getText();
        String vehicle = vehicleText.getText();

        System.out.println(name + "," + surname + "," + user + ", " + password + "," + vehicle);
        Menu  menu = new Menu();
        app.setVisible(true);



    }





    }




