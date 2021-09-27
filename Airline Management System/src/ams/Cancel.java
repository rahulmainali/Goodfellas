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
        
	
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ams/Images/Cancel.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel NewLabel = new JLabel(i3);
	    NewLabel.setBounds(470, 100, 250, 250);
	    add(NewLabel);
		
	    JLabel PassengerNo = new JLabel("PASSENGER NO");
	    PassengerNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
	    PassengerNo.setBounds(60, 100, 132, 26);
	    add(PassengerNo);
		
	    JLabel CancellationNo = new JLabel("CANCELLATION NO");
	    CancellationNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
	    CancellationNo.setBounds(60, 150, 150, 27);
	    add(CancellationNo);
		
	    JLabel CancellationDate = new JLabel("CANCELLATION DATE");
	    CancellationDate.setFont(new Font("Tahoma", Font.PLAIN, 17));
	    CancellationDate.setBounds(60, 200, 180, 27);
	    add(CancellationDate);
		
	    JLabel Ticketid = new JLabel("TICKET_ID");
	    Ticketid.setFont(new Font("Tahoma", Font.PLAIN, 17));
	    Ticketid.setBounds(60, 250, 150, 27);
	    add(Ticketid);
		
	    JLabel Flightcode = new JLabel("FLIGHT_CODE");
	    Flightcode.setFont(new Font("Tahoma", Font.PLAIN, 17));
	    Flightcode.setBounds(60, 300, 150, 27);
	    add(Flightcode);
		
	    JButton Cancel = new JButton("CANCEL");
	    Cancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        Cancel.setBackground(Color.BLACK);
        Cancel.setForeground(Color.WHITE);
	    Cancel.setBounds(250, 350, 150, 30);
	    add(Cancel);