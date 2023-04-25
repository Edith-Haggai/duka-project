package com.haggai.duka;



import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    //jdbc:mysql://localhost:3306/mysql

    //com.mysql.cj.jdbc.Driver
    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/db_edith_haggai_151790";

    static final String USERNAME = "root";
    static final String PASSWORD = "";
    private Connection connection;
    private Statement statement;

    //The login function
    public boolean login(String username, String password) {
        boolean success = false;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();

            String query = "SELECT * FROM tbl_attendant WHERE attendant_username = '" +
                    username + "' AND attendant_password = '" + password + "'";
            System.out.println(query);
            ResultSet rs = statement.executeQuery(query);
            success = rs.next();
            rs.close();

            statement.close();
            connection.close();
            if (success) {
                JOptionPane.showMessageDialog(null, "You have logged in successfully.\n welcome to comrades  duka ");
            } else {
                JOptionPane.showMessageDialog(null, "You have not entered all the fields or Wrong credentials");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException m) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, m);
        }
        return success;
    }
    //The register function
    /*public boolean register(String names, String username, String password) {
        boolean success = false;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();

            String query = "INSERT INTO tbl_attendant (attendant_name," +
                    "attendant_username,attendant_password) VALUES ('" +
                    names + "', '" +
                    username + "', '" +
                    password + "')";
            System.out.println(query);
            statement.executeUpdate(query);
            statement.close();
            success = true;

            statement.close();
            connection.close();
            if(success){
                JOptionPane.showMessageDialog(null,"Welcome "+username+". Use "+password+" to login now");
            } else{
                JOptionPane.showMessageDialog(null,"");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException m) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, m);
        }
        return success;
    }*/

    //The upload items to db function
    public boolean upload(String itemName, int itemPrice, int itemQuantity) {
        boolean success = false;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();

            String query = "INSERT INTO tbl_inventory (item_name," +
                    "item_price,item_quantity) VALUES ('" +
                    itemName + "', '" +
                    itemPrice + "', '" +
                    itemQuantity + "')";
            System.out.println(query);
            statement.executeUpdate(query);
            statement.close();
            success = true;
            if (success) {
                JOptionPane.showMessageDialog(null, itemName + "has successfully been uploaded to the Catalogue.");
            } else {
                JOptionPane.showMessageDialog(null, "there has been an error!");
            }

            statement.close();
            connection.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException m) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, m);
        }
        return success;
    }

    public static void main() {
        Database objFrame = new Database();
    }
}


