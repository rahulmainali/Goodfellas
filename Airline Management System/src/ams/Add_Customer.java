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
        	
        textField_1 = new JTextField();
        textField_1.setBounds(200, 120, 150, 27);
        add(textField_1);
            
        JLabel Address = new JLabel("ADDRESS");
        Address.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Address.setBounds(60, 170, 150, 27);
        add(Address);
			
        textField_2 = new JTextField();
        textField_2.setBounds(200, 170, 150, 27);
        add(textField_2);
            		
        JLabel Nationality = new JLabel("NATIONALITY");
        Nationality.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Nationality.setBounds(60, 220, 150, 27);
        add(Nationality);
			
        textField_3 = new JTextField();
        textField_3.setBounds(200, 220, 150, 27);
        add(textField_3);
	
        JLabel Name = new JLabel("NAME");
        Name.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Name.setBounds(60, 270, 150, 27);
        add(Name);
	
        textField_4 = new JTextField();
        textField_4.setBounds(200, 270, 150, 27);
        add(textField_4);
	
        JLabel Gender = new JLabel("GENDER");
        Gender.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Gender.setBounds(60, 320, 150, 27);
        add(Gender);
		
        JRadioButton NewRadioButton = new JRadioButton("Male");
        NewRadioButton.setBackground(Color.WHITE);
        NewRadioButton.setBounds(200, 320, 70, 27);
        add(NewRadioButton);
	
        JRadioButton Female = new JRadioButton("Female");
        Female.setBackground(Color.WHITE);
        Female.setBounds(280, 320, 70, 27);
        add(Female);