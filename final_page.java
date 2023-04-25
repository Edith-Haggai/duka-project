package com.haggai.duka;

import javax.swing.*;

public class final_page extends JFrame{
    private JPanel final_page;
    private JLabel finalPanel;

    public final_page() {
        super("Welcome");
        setVisible(true);
        pack();
        setSize(600, 600);
        setBounds(300, 200, 200, 300);
        setContentPane(finalPanel);
    }

        public static void main() {
            final_page objEnd = new final_page();
        }
}
