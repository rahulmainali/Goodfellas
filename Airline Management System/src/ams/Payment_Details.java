//A program to record payment details

package ams;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class Payment_Details extends JFrame
{

    JTextField textField;
    JTable table;
    JLabel Sector;
    JLabel FlightCode, Capacity, Classcode, Classname, label;

    public static void main(String[] args)
    {
        new Payment_Details();
    }

    private void initialize()
    {
        setTitle("PAYMENT_DETAILS");
	    getContentPane().setBackground(Color.WHITE);
	    setSize(860,486);
	    setLayout(null);
		
	    JLabel Fcode = new JLabel("PNR NO");
	    Fcode.setFont(new Font("Tahoma", Font.PLAIN, 17));
	    Fcode.setBounds(60, 160, 150, 26);
	    add(Fcode);
		
	    textField = new JTextField();
	    textField.setBounds(200, 160, 150, 26);
	    add(textField);
	
        table = new JTable();
	    table.setBounds(45, 329, 766, 87);
	    add(table);
		
	    JButton Show = new JButton("SHOW");
	    Show.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Show.setBackground(Color.BLACK);
        Show.setForeground(Color.WHITE);
	    Show.setBounds(200, 210, 150, 26);
	    add(Show);