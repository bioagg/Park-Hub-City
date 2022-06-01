package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;

import static com.company.Work.getParking;


public abstract class Main {

    public static  void main(String[] args) throws SQLException, ClassNotFoundException {


        AppUI appUI = new AppUI();

        JTable table = new JTable();

        DefaultTableModel model = new DefaultTableModel();

        Object[] columnsName = new Object[4];

        columnsName[0] = "parking_id";
        columnsName[1] = "address";
        columnsName[2] = "floors";
        columnsName[3] = "num_spaces";

        model.setColumnIdentifiers(columnsName);

        Object[] rowData = new Object[4];

        for(int i = 0; i < getParking().size(); i++){

            rowData[0] = getParking().get(i).getParking_id();
            rowData[1] = getParking().get(i).getAddress();
            rowData[2] = getParking().get(i).getFloors();
            rowData[3] = getParking().get(i).getNum_spaces();
            model.addRow(rowData);
        }

        table.setModel(model);

        System.out.println(getParking().size());

        Work window = new Work();

        JPanel panel = new JPanel();

        panel.setLayout(new BorderLayout());

        JScrollPane pane = new JScrollPane(table);

        panel.add(pane,BorderLayout.CENTER);

        window.setContentPane(panel);

        //SwingUtilities.invokeLater(Parking::new);












    }
}