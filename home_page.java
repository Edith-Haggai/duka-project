package com.haggai.duka;

import code.db.Database;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class home_page extends JFrame  {
    private JButton btnAttendant;
    private JButton btnBuyer;
    private JPanel HomePanel;

    //Database db = new Database();


    public home_page() {
        btnAttendant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Database.main();
                login.main();
                //Database.main();
            }

        });

        btnBuyer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buyer_page.main();
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setContentPane(new home_page().HomePanel);
        frame.setVisible(true);
        frame.setSize(600,600);
        frame.setBounds(300,200,600,400);
    }
}
