//A program to cancel tickets

package ams;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Cancel extends JFrame 
{
    
    private JTextField textField,textField_1,textField_2,textField_3,textField_4;

    public static void main(String[] args) 
    {
        new Cancel();
    }
    
    public Cancel() 
    {
        initialize();
    }
    
    private void initialize() 
    {
        setTitle("CANCELLATION");
	    getContentPane().setBackground(Color.WHITE);
	    setBounds(100, 100, 801, 472);
	    setLayout(null);
		
	    JLabel Cancellation = new JLabel("CANCELLATION");
	    Cancellation.setFont(new Font("Tahoma", Font.PLAIN, 31));
	    Cancellation.setBounds(185, 24, 259, 38);
	    add(Cancellation);