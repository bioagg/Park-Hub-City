package com.company;


//h klassi auti einai wste o xristis meta to singup h to login na dialegei to parking poy epithimei gia tin kratisi thesis

import javax.swing.*;
import javax.swing.text.html.ListView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Parking implements ActionListener {
    private static JLabel parkingLabel;
    private static JButton submitButton;
    private static JFrame app;
    ListView parkingListView;



    Parking(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        JFrame app = new JFrame("PARKING SELECTION");
        app.setSize(500,500);
        app.setBackground(Color.black);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);

        panel.setLayout(null);

        parkingLabel = new JLabel("SELECT PARKING");
        parkingLabel.setBounds(50,40,80,25);
        panel.add(parkingLabel);

        submitButton = new JButton("SUBMIT");
        submitButton.setBounds(50,100,80,25);
        submitButton.addActionListener(this);
        panel.add(submitButton);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
