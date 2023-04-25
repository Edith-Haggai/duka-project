package com.haggai.duka;

import code.db.Database;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class login extends JFrame implements ActionListener{

    private JButton btnLogin;
    private JPanel login_details;
    private JLabel lblUsername;
    private JTextField TxtUsername;
    private JLabel LblPassword;
    private JPasswordField TxtPassword;

    code.db.Database db =  new code.db.Database();


    //private JTextField TxtPassword;

        public login() {
            super("Welcome");
            setVisible(true);
            pack();
            //setSize(200, 250);
            setSize(600,600);
            setBounds(300,200,600,300);
            setContentPane(login_details);


            String name = String.valueOf(TxtUsername);
            ActionListener l = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    upload_items.main();

                }
            };
            btnLogin.addActionListener(l);
            btnLogin.addActionListener(this);
        }
        @Override
         public void actionPerformed(ActionEvent e){
            String username= TxtUsername.getText();
            String password =TxtPassword.getText();

            try {
                if (db.verifyUser(username, password))
                {

                    JOptionPane.showMessageDialog(null,"login successful \nwelcome  "+ TxtUsername.getText());
                }
                else {
                    JOptionPane.showMessageDialog(login.this, "Invalid username or password.");


                    }

            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        }




        public static void main(){
            login objFrame= new login();

        }



    }





