package com.haggai.duka;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class search  extends JFrame  {
    private JLabel lblSearch;
    private JTextField txtSearch;
    private JPanel SearchPanel;
    private JButton btnOk;

    code.db.Database db = new code.db.Database();

    public search(){

        setContentPane(SearchPanel);
        setVisible(true);
        setSize(600,600);
        setBounds(300,200,600,400);
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //db.displayStockRecord(listItemNames, txtItemName, txtItemQuantity, txtItemPrice, "SELECT * FROM tbl_stock WHERE item_name=?");

               search_results.main();



            }
        });
    }
    public static void main(){
        search objFrame= new search();
}
    }
