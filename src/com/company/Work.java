package com.company;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class createParking extends JFrame {

    public createParking() {

        super("Bind JTable From MySQL DataBase");

        setLocationRelativeTo(null);

        setSize(600, 400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    static Connection getConnection() {
        Connection con = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/parkhubcity", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(createParking.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;
    }

    static ArrayList<Parking> getParking(){

        ArrayList<Parking> parkings = new ArrayList<Parking>();

        Connection con = getConnection();

        Statement stm;

        ResultSet rs;

       Parking prk;

        try {

            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM parking");

            while(rs.next()){

                prk = new Parking(
                        rs.getInt("parking_id"),
                        rs.getString("address"),
                        rs.getInt("floors") ,
                        rs.getInt("num_spaces")
                );

                parkings.add(prk);
            }

        } catch (SQLException ex) {
            Logger.getLogger(createParking.class.getName()).log(Level.SEVERE, null, ex);
        }

        return parkings;
    }

}
