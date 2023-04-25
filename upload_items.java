package com.haggai.duka;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class upload_items extends JFrame implements ActionListener {
    private JPanel update_items;
    private JLabel lblUpdate;
    private JLabel lblItem;
    private JLabel lblPrice;
    private JLabel lblQuantity;
    private JTextField txtItem;
    private JTextField txtQuantity;
    private JTextField txtPrice;
    private JButton btnUpdate;

    code.db.Database db = new code.db.Database();


    public upload_items() {
        super("Welcome");
        setVisible(true);
        pack();
        setSize(600, 600);
        setBounds(300, 200, 600, 300);
        setContentPane(update_items);

        String name = String.valueOf(txtItem);
        ActionListener l = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null, lblItem);
            }
        };

        btnUpdate.addActionListener(l);
        btnUpdate.addActionListener(this);
    }

    public static void main() {
        upload_items objupdate = new upload_items();
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        String item = txtItem.getText();
        String quantity = txtQuantity.getText();
        String price = txtPrice.getText();

        try {
            db.addRecord(item, quantity, price);
            //clearStockFields();
        }
        catch (SQLException ex) {
            throw new RuntimeException(ex);
            //JOptionPane.showMessageDialog(null,"updated ");

        }
       // public static void main(){
            //upload_items objupdate = new upload_items();

        }

    }


