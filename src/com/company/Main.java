package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;


public abstract class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {


       AppUI appUI = new AppUI();
/*
        final String DB_url = "jdbc:mysql://localhost/user";
        final String USERNAME = "root";
        final String PASSWORD = "12345";
        Connection conn = null;
        Statement stmt = null;
        try {

            Connection con = DriverManager.getConnection(DB_url , USERNAME,PASSWORD);

            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Connection succesfully");
            stmt = conn.createStatement();
            String sql = "INSERT INTO stoixeia(username , password)" +
                    "VALUES ('Minas' , '1234') ";
            stmt.executeUpdate(sql);
            System.out.println("Inserts completed");


        } catch(Exception e){
            e.printStackTrace();

        }







*/

     }

    public abstract void actionPerformed(ActionEvent arg0, ActionEvent arg1);
}
