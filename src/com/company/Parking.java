package com.company;


//h klassi auti einai wste o xristis meta to singup h to login na dialegei to parking poy epithimei gia tin kratisi thesis

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.ListView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Parking {
    ArrayList<Parking> parkinglist;
    String parkingarray[] = new String[]{"Parking Name", "Parking Location , Reservation Price" ,"Subscription Price", "Reservation Duration", "Subscription Duration"};
    DefaultTableModel dtm;

    private static JFrame app;
    private static JPanel panel;
    private static JLabel parkingNameLabel;
    private static JTextField parkingNameText;
    private static JLabel locationLabel;
    private static  JTextField locationText;
    private static JButton addButton;
    private static JTable table;

    int row;
    int col;

   public Parking(){
        initComponents();
        parkinglist = new ArrayList<>();
        dtm = new DefaultTableModel(parkingarray , 0);
        this.setLocationRelativeTo(null);





           JFrame app = new JFrame("SELECT PARKING");
           app.setSize(500,500);
           app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           app.setLayout(null);
           app.add(panel);
           app.setLocationRelativeTo(null);

           panel.add(app);

           panel.setLayout(null);

           parkingNameLabel = new JLabel("Name");
           parkingNameLabel.setBounds(50,40,80,25);
           panel.add(parkingNameLabel);

           parkingNameText = new JTextField();
           parkingNameText.setBounds(100,40,80,25);
           panel.add(parkingNameText);

        locationLabel = new JLabel("Location");
         locationLabel.setBounds(50,70,80,25);
           panel.add(locationLabel);

           locationText = new JTextField();
           locationText.setBounds(120,70,80,25);
           panel.add(locationText);

          addButton = new JButton("ADD");
         addButton.setBounds(50,100,80,25);
          //addButton.addActionListener(this);

       table = new JTable(dtm);
       table.setSize(500,300);
       panel.add(table);
       table.setVisible(true);




       app.setVisible(true);


   }



    private void initComponents() {
    }

    private void setLocationRelativeTo(Object o) {
    }






}
