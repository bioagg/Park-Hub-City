package com.company;

import com.sun.tools.javac.Main;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//se autin tin klassi tha mporei o user na epilegei ti thelei na kanei
//one take reservation OR subscription

public class UserDesire implements ActionListener{
    private static JLabel desireLabel;
    private static JButton onetakeButton;
    private static JButton subscriptionButton;
    private static JFrame app;
    private static JLabel success;


    UserDesire(){
      JPanel panel = new JPanel();
      panel.setLayout(null);
        JFrame app = new JFrame("DESIRE");
        app.setSize(500,500);
        app.setBackground(Color.black);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);

      onetakeButton = new JButton("ONE TAKE");
      onetakeButton.setBounds(500,120,400,25);
      onetakeButton.setBackground(Color.red);
      onetakeButton.addActionListener((ActionListener) this);
      panel.add(onetakeButton);


        subscriptionButton = new JButton("SUBSCRIPTION");
        subscriptionButton.setBounds(500,180,400,25);
        subscriptionButton.setBackground(Color.red);
        subscriptionButton.addActionListener((ActionListener) this);
        panel.add(subscriptionButton);



        app.setVisible(true);






    }


    @Override
    public void actionPerformed(ActionEvent e) {
        MainScreen mainscreen = new MainScreen();
        app.setVisible(true);
    }
}
