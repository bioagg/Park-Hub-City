package com.company;


//h klassi auti einai wste o xristis meta to singup h to login na dialegei to parking poy epithimei gia tin kratisi thesis

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Parking {
    JFrame app = new JFrame();
    JList<CreateParking> parkinglist = new JList();
    DefaultListModel<CreateParking> model = new DefaultListModel<>();

   JLabel parkingnamelabel = new JLabel();
   JPanel panel = new JPanel();
   JSplitPane splitpane = new JSplitPane();
 private String name;


    Parking() {



        parkinglist.setModel(model);
        model.addElement(new CreateParking("PapadoParking" , new String("Karaiskaki 87")));
        splitpane.setLeftComponent(new JScrollPane(parkinglist));
        panel.add(parkingnamelabel);
        splitpane.setRightComponent(panel);
        app.setTitle("Parking Selection");
        app.setSize(500, 500);

        app.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        app.add(splitpane);
        app.pack();
        app.setLocationRelativeTo(null);
        app.add(splitpane);
        app.add(panel);
        panel.setLayout(null);


        app.setVisible(true);




    }


    public class CreateParking{
       String name;
       String location;

       //dimiourgoume enan constructor gia ta orismata wste na mporoume na prosthetoume times line:25
        public CreateParking(String papadoParking, String s) {

        }
    }


   public String getName(){
     return name;
   }
    public void setName(String name) {
        this.name = name;
    }

    public static void setLocation(String newLocation) {
       String location = newLocation;

    }
    @Override
    public String toString(){

        return name;
    }

    public Parking parking;

    private Parking selectParkingFromDatabase(String parkin_id, String parking_name, String address, int num_of_spaces) {

        Parking parking = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            final String url = "jdbc:mysql://localhost:3306/parkhubcity?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            final String USERNAME = "root";
            final String PASSWORD = "";
            Connection con = DriverManager.getConnection(url, USERNAME, PASSWORD);
            if (con != null) {
                System.out.println("Succesfull");

            }
        }
        Statement stm = con.createStatement();
        String sql = "SELECT * FROM  parking ";
        ResultSet resultSet = stm.executeQuery("SELECT * FROM parking");
        while(resultSet.next()){

            System.out.println("parking_id : " +  resultSet.getString(1) + " " + "parking_name: " +resultSet.getString(2) + "" + "address :"+ resultSet.getString(3) + "name_of_spaces: " +resultSet.getInt(4));



        }



        stm.close();
        con.close();


    } catch (SQLException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }


        return parking;
}

}
