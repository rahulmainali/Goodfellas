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
			
	    Sector = new JLabel("PAYMENT DETAILS");
	    Sector.setForeground(Color.BLUE);
	    Sector.setFont(new Font("Tahoma", Font.PLAIN, 31));
	    Sector.setBounds(51, 17, 300, 39);
	    add(Sector);
		
	    FlightCode = new JLabel("PNR_NO");
	    FlightCode.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    FlightCode.setBounds(84, 292, 108, 26);
	    add(FlightCode);
		
	    Capacity = new JLabel("PAID_AMOUNT");
	    Capacity.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    Capacity.setBounds(183, 298, 92, 14);
	    add(Capacity);
		
	    Classcode = new JLabel("PAY_DATE");
	    Classcode.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    Classcode.setBounds(322, 294, 101, 24);
	    add(Classcode);
		
	    Classname = new JLabel("CHEQUE_NO");
	    Classname.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    Classname.setBounds(455, 298, 114, 14);
	    add(Classname);
		
	    label = new JLabel("");
	    label.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/payment.png")));
	    label.setBounds(425, 15, 239, 272);
	    add(label);