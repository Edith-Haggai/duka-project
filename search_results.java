package com.haggai.duka;

import javax.swing.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class search_results extends JFrame {
    private JLabel lblresults;
    private JComboBox itemName;
    private JPanel panelresults;
    private JComboBox quantityAvailable;
    private JLabel quantity;
    private JLabel itemname;
    private JLabel Price;
    private JComboBox price;
    code.db.Database db = new code.db.Database();


    public search_results() {

        setContentPane(panelresults);
        setVisible(true);
        setSize(600, 600);
        setBounds(300, 200, 600, 400);
        try {
            // myDB.viewColumn(txtItemID, "SELECT item_id FROM tbl_stock");
            db.viewColumn(itemName, "SELECT item_name,item_quantity FROM tbl_itemcatalogue");
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            // myDB.viewColumn(txtItemID, "SELECT item_id FROM tbl_stock");
            db.viewColumn(quantityAvailable, "SELECT item_quantity FROM tbl_itemcatalogue");
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            // myDB.viewColumn(txtItemID, "SELECT item_id FROM tbl_stock");
            db.viewColumn(price, "SELECT item_price FROM tbl_itemcatalogue");
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    public static void main() {
        search_results objres = new search_results();
    }
}
