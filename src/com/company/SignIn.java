package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class SignIn extends Component implements ActionListener {


    private static JLabel idLabel;
    private static JLabel nameLabel;
    private static JLabel surnameLabel;
    private static JLabel emailLabel;
    private static JLabel userLabel;
    private static JLabel vehicleLabel;
    private static JTextField vehicleText;
    private static JFrame app;
    private static JTextField idText;
    private static JTextField nameText;
    private static JTextField surnameText;
    private static JTextField emailText;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton submitButton;
    private static JLabel success;


    SignIn() {

        JPanel panel = new JPanel();
        JFrame app = new JFrame("SIGN UP");
        app.setSize(500, 500);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);

        panel.setLayout(null);

        idLabel = new JLabel("ID");
        idLabel.setBounds(50, 20, 80, 25);
        panel.add(idLabel);

        idText = new JTextField();
        idText.setBounds(100, 20, 80, 25);
        panel.add(idText);

        nameLabel = new JLabel("Name");
        nameLabel.setBounds(50, 50, 80, 25);
        panel.add(nameLabel);

        nameText = new JTextField();
        nameText.setBounds(100, 50, 80, 25);
        panel.add(nameText);

        surnameLabel = new JLabel("Surname");
        surnameLabel.setBounds(50, 80, 80, 25);
        panel.add(surnameLabel);

        surnameText = new JTextField();
        surnameText.setBounds(100, 80, 80, 25);
        panel.add(surnameText);


        userLabel = new JLabel("User");
        userLabel.setBounds(50, 110, 80, 25);
        panel.add(userLabel);

        userText = new JTextField();
        userText.setBounds(100, 110, 80, 25);
        panel.add(userText);

        emailLabel = new JLabel("EMAIL");
        emailLabel.setBounds(50, 110, 80, 25);
        panel.add(emailLabel);

        emailText = new JTextField();
        emailText.setBounds(100, 110, 80, 25);
        panel.add(emailText);


        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50, 140, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(120, 140, 80, 25);
        panel.add(passwordText);

        vehicleLabel = new JLabel("Vehicle");
        vehicleLabel.setBounds(50, 170, 80, 25);
        panel.add(vehicleLabel);

        vehicleText = new JTextField();
        vehicleText.setBounds(100, 170, 80, 25);
        panel.add(vehicleText);


        submitButton = new JButton("SIGN UP");
        submitButton.setBounds(50, 190, 80, 25);
        submitButton.addActionListener(this);
        panel.add(submitButton);


        app.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {


        create_user();
       /* try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/xamppconn?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "root";
        String pass= "";
        Connection con = null;
        try {
            String sql = "INSERT INTO 'user' " +
                    "VALUES (? , ? ,? ,? )";
            con = DriverManager.getConnection(url , user , pass);
           var pst = con.prepareStatement(sql);

            pst.setInt(1, intID.getText());



           pst.executeUpdate();
        }

        catch (SQLException ex) {
            ex.printStackTrace();
        }

        /*String user = userText.getText();
        String password = passwordText.getText();
        String name = nameText.getText();
        String surname = surnameText.getText();
        String vehicle = vehicleText.getText();

        System.out.println(name + "," + surname + "," + user + ", " + password + "," + vehicle);

        */
        //MainScreen mainscreen = new MainScreen();


        app.setVisible(true);


    }

    private void create_user() {
        String id = idText.getText();
        String name = nameText.getText();
        String surname = surnameText.getText();
        String username = userText.getText();
        String email = emailText.getText();
        String password = String.valueOf(passwordText.getPassword());
        String vehicle_id = vehicleText.getText();

        //if statement ---> wste ama einai kapoio keno na petaksei minima proeidopoihshs

        if (id.isEmpty() || name.isEmpty() || surname.isEmpty() || username.isEmpty() || email.isEmpty() || password.isEmpty() || vehicle_id.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Please enter all fields",
                    "Try Again",
                    JOptionPane.ERROR_MESSAGE);
            return;


        }


        user = addUserToDatabase(id, name, surname, username, email, password, vehicle_id);
        {
            if (user != null) {

                dispose();
            } else {

                JOptionPane.showMessageDialog(this,
                        "Failed to regisrter new user",
                        "Try Again",
                        JOptionPane.ERROR_MESSAGE);

            }


        }


    }

    private void dispose() {
    }

    public User user;

    private User addUserToDatabase(String id, String name, String surname, String username, String email, String password, String vehicle_id) {

        User user = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            final String url = "jdbc:mysql://localhost:3306/parkhubcity?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            final String USERNAME = "root";
            final String PASSWORD = "";
            Connection con = DriverManager.getConnection(url, USERNAME, PASSWORD);
            if (con != null) {
                System.out.println("Succesfull");

            }
            Statement stm = con.createStatement();
            String sql = "INSERT INTO user(id,name,surname,username,email,password , vehicle_id) " +
                    "VALUES(?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, surname);
            preparedStatement.setString(4, username);
            preparedStatement.setString(5, email);
            preparedStatement.setString(6, password);
            preparedStatement.setString(7, vehicle_id);

            //insert row into the table

            int addedRows = preparedStatement.executeUpdate();
            if (addedRows > 0) {
                user = new User();
                user.id = Integer.parseInt(id);
                user.name = name;
                user.surname = surname;
                user.username = username;
                user.email = email;
                user.password = password;
                user.vehicle_id = vehicle_id;
            }

            stm.close();
            con.close();


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return user;
    }
}






