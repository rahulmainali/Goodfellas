//Adding customers to database

package ams;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Add_Customer extends JFrame
{

    
	JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6;

    public Add_Customer()
    {
        getContentPane().setForeground(Color.BLUE);
        getContentPane().setBackground(Color.WHITE);
        setTitle("ADD CUSTOMER DETAILS");
		 
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(778,486);
        getContentPane().setLayout(null);
			
        JLabel Passportno = new JLabel("PASSPORT NO");
        Passportno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Passportno.setBounds(60, 80, 150, 27);
        add(Passportno);
            
        textField = new JTextField();
        textField.setBounds(200, 80, 150, 27);
        add(textField);
			
        JButton Next = new JButton("SAVE");
        Next.setBounds(200, 420, 150, 30);
        Next.setBackground(Color.BLACK);
        Next.setForeground(Color.WHITE);
        add(Next);
			
        JLabel Pnrno = new JLabel("PNR NO");
        Pnrno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Pnrno.setBounds(60, 120, 150, 27);
        add(Pnrno);