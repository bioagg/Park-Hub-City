package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MainScreen {
    JFrame app = new JFrame();
    JPanel panel = new JPanel();


    

    MainScreen(){
        Border border = BorderFactory.createLineBorder(Color.CYAN);
        JLabel AppLabel = new JLabel();
        AppLabel.setText("WELCOME TO OUR MENU");
        ImageIcon image = new ImageIcon("parking logo.png");
        AppLabel.setIcon(image);
        AppLabel.setHorizontalTextPosition(JLabel.CENTER);
        AppLabel.setVerticalTextPosition(JLabel.TOP);
        AppLabel.setForeground(Color.red);
        AppLabel.setFont(new Font("Mv Boli", Font.PLAIN, 20));
        AppLabel.setBackground(Color.black);
        AppLabel.setOpaque(true);
        AppLabel.setBorder(border);
        AppLabel.setVerticalAlignment(JLabel.TOP);
        AppLabel.setHorizontalAlignment(JLabel.CENTER);
        AppLabel.setBounds(0,0,1500,1500);

        JButton parkingButton= new JButton();
        parkingButton.setBounds(600,200,250,50);
        parkingButton.setText("PARKING RESERVATION");
        //parkingButton.addActionListener(this);
        parkingButton.setFocusable(true);
        parkingButton.setVisible(true);
        parkingButton.setHorizontalTextPosition(JLabel.CENTER);
        parkingButton.setVerticalAlignment(JLabel.CENTER);
        parkingButton.setBackground(Color.red);

        JButton paymentButton= new JButton();
        paymentButton.setBounds(600,270,250,50);
        paymentButton.setText("Payment");
       // paymentButton.addActionListener(this);
        paymentButton.setFocusable(true);
        paymentButton.setVisible(true);
        paymentButton.setHorizontalTextPosition(JLabel.CENTER);
        paymentButton.setVerticalAlignment(JLabel.CENTER);
        paymentButton.setBackground(Color.red);


        JButton giftButton= new JButton();
        giftButton.setBounds(600,340,250,50);
        giftButton.setText("GIFTS");
      // giftButton.addActionListener(this);
        giftButton.setFocusable(true);
        giftButton.setVisible(true);
        giftButton.setHorizontalTextPosition(JLabel.CENTER);
        giftButton.setVerticalAlignment(JLabel.CENTER);
        giftButton.setBackground(Color.red);

        JButton supportButton= new JButton();
        supportButton.setBounds(600,410,250,50);
        supportButton.setText("TECHNICAL SUPPORT");
        //supportButton.addActionListener(this);
        supportButton.setFocusable(true);
        supportButton.setVisible(true);
        supportButton.setHorizontalTextPosition(JLabel.CENTER);
        supportButton.setVerticalAlignment(JLabel.CENTER);
        supportButton.setBackground(Color.red);

        JButton subscriptionButton= new JButton();
        subscriptionButton.setBounds(600,480,250,50);
        subscriptionButton.setText("SUBSCRIPTION");
       // subscriptionButton.addActionListener(this);
        subscriptionButton.setFocusable(true);
        subscriptionButton.setVisible(true);
        subscriptionButton.setHorizontalTextPosition(JLabel.CENTER);
        subscriptionButton.setVerticalAlignment(JLabel.CENTER);
        subscriptionButton.setBackground(Color.red);


        JButton reviewsButton= new JButton();
        reviewsButton.setBounds(600,550,250,50);
        reviewsButton.setText("REVIEWS/COMMENTS");
        //reviewsButton.addActionListener(this);
        reviewsButton.setFocusable(true);
        reviewsButton.setVisible(true);
        reviewsButton.setHorizontalTextPosition(JLabel.CENTER);
        reviewsButton.setVerticalAlignment(JLabel.CENTER);
        reviewsButton.setBackground(Color.red);
        
        

        app.setTitle("MAIN SCREEN");
        app.setSize(420, 420);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setResizable(true);
        app.setLayout(null);
        app.setVisible(true);
        app.add(AppLabel);
        app.add(parkingButton);
        app.add(paymentButton);
        app.add(giftButton);
        app.add(supportButton);
        app.add(subscriptionButton);
        app.add(reviewsButton);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.getContentPane().setLayout(null);
        app.getContentPane().add(parkingButton);







    }


}
