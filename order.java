package com.haggai.duka;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class order extends JFrame implements ActionListener  {
    private JPanel orderpanel;
    private JLabel lblorder;
    private JLabel lblitem;
    private JButton btnorder;
    private JTextField txtitem;
    private JTextField txtquantity;

    public order() {
        super("Welcome");
        setVisible(true);
        pack();
        setSize(600, 600);
        setBounds(300, 200, 600, 300);
        setContentPane(orderpanel);

        String name = String.valueOf(txtitem);
        ActionListener l = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // JOptionPane.showMessageDialog(null, txtitem);
                JOptionPane.showMessageDialog(null,"order successful ");
                final_page.main();

            }
        };

        btnorder.addActionListener(l);
        btnorder.addActionListener(this);
    }

    @Override

    public void actionPerformed(ActionEvent e ){
        String n =txtitem.getText();
        String y =txtquantity.getText();
       // int price=2*Integer.parseInt(y);
        //JOptionPane.showMessageDialog(null,"updated ");
        //JOptionPane.showMessageDialog(null,n +"is"+price+"shillings");
    }
    public static void main(){
        order objorder = new order();

    }
    }

