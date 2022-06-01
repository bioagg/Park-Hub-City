package com.company;


//h klassi auti einai wste o xristis meta to singup h to login na dialegei to parking poy epithimei gia tin kratisi thesis

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.company.Work.getParking;

public class Parking {
    private int parking_id;
    private String address;
    private int floors;
    private int num_spaces;


    //dimiourgia constructor
    public Parking(int parking_id,  String address, int floors, int num_spaces) {
        this.parking_id = parking_id;
        this.address = address;
        this.floors = floors;
        this.num_spaces = num_spaces;




    }




    //me to return epistrefoume tis times
    public int getParking_id(){
        return this.parking_id;
    }



    public String getAddress(){
        return this.address;
    }

    public int getFloors(){
        return this.floors;
    }
    public int getNum_spaces(){
        return this.num_spaces;
    }

}






