package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;


public abstract class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {


       AppUI appUI = new AppUI();










       //connect java with our database
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/parkhubcity?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String user = "root";
            String pass= "";
            Connection con = DriverManager.getConnection(url , user , pass);
            if(con!=null)
            {
                System.out.println("Succesfull");

            }
            String query = "select * from user";
            var statement = con.prepareStatement(query);
            ResultSet r = statement.executeQuery();

            //add user to our database through GUI
          /*  String sql = "INSERT INTO user " +
                    "VALUES(?,?,?,?)";
                     String sql = "INSERT INTO 'user' " +
                    "VALUES (? , ? ,? ,? )";
            con = DriverManager.getConnection(url , user , pass);
           var pst = con.prepareStatement(sql);

            pst.setInt(1, txtID.getText());

            statement.executeUpdate(sql);
            System.out.println("Inserted data on our database");
*/

            while(r.next())
            {
                int id = r.getInt("id");
                String username = r.getString("username");
                String surname = r.getString("surname");
                String name = r.getString("name");
                String password = r.getString("password");
                String  email = r.getString("email");
                String vehicle_id = r.getString("vehicle_id");
                System.out.printf("%-10s%-20s%-20s%-10s%-20s%-20s%-10s\n",id , username ,surname,name , password, email,vehicle_id) ;

            }




        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();

        }
        catch (SQLException e) {
            e.printStackTrace();

        }




    }



    public abstract void actionPerformed(ActionEvent arg0, ActionEvent arg1);{}
}
