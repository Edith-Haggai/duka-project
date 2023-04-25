package com.haggai.duka;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buyer_page extends JFrame{
    private JPanel buyer_details;
    private JLabel lblwelcome;
    private JButton btnSearch;
    private JButton btnOrder;


    public buyer_page(){

        setContentPane(buyer_details);
        setVisible(true);
        setSize(600,600);
        setBounds(300,200,600,400);

        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                search.main();
            }
        });
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                order.main();
            }
        });
    }
    public static void main(){
        buyer_page objFrame= new buyer_page();

    }

}
