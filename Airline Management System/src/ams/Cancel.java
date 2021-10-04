//A program to cancel tickets

package ams;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Cancel extends JFrame
{
    
    private JTextField textField,textField_1,textField_2,textField_3,textField_4;

    public static void main(String[] args) 
    {
        new Cancel();
    } // calling the constructor
    
    public Cancel() 
    {
        initialize();
    } //calling initialize method
    
    private void initialize() 
    {
        setTitle("CANCELLATION");
	    getContentPane().setBackground(Color.WHITE);
	    setBounds(100, 100, 801, 472);
	    setLayout(null);
	    // Setting title
		
	    JLabel Cancellation = new JLabel("CANCELLATION");
	    Cancellation.setFont(new Font("Tahoma", Font.PLAIN, 31));
	    Cancellation.setBounds(185, 24, 259, 38);
	    add(Cancellation);
		//Jlabel for Cancellation and setting its dimension
	
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ams/Images/Cancel.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel NewLabel = new JLabel(i3);
	    NewLabel.setBounds(470, 100, 250, 250);
	    add(NewLabel);
		//Loading an icon from Images folder
		
	    JLabel PassengerNo = new JLabel("PASSENGER NO");
	    PassengerNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
	    PassengerNo.setBounds(60, 100, 132, 26);
	    add(PassengerNo);
		//Jlabel for PassengerNo and setting its dimension

	    JLabel CancellationNo = new JLabel("CANCELLATION NO");
	    CancellationNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
	    CancellationNo.setBounds(60, 150, 150, 27);
	    add(CancellationNo);
		//Jlabel for CancellationNo and setting its dimension
		
	    JLabel CancellationDate = new JLabel("CANCELLATION DATE");
	    CancellationDate.setFont(new Font("Tahoma", Font.PLAIN, 17));
	    CancellationDate.setBounds(60, 200, 180, 27);
	    add(CancellationDate);
		//Jlabel for CancellationDate and setting its dimension
		
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
		
	    textField = new JTextField();
	    textField.setBounds(250, 100, 150, 27);
	    add(textField);
	
        textField_1 = new JTextField();
	    textField_1.setBounds(250, 150, 150, 27);
	    add(textField_1);
		
	    textField_2 = new JTextField();
	    textField_2.setBounds(250, 200, 150, 27);
	    add(textField_2);
	
        textField_3 = new JTextField();
	    textField_3.setBounds(250, 250, 150, 27);
	    add(textField_3);
		
	    textField_4 = new JTextField();
	    textField_4.setBounds(250, 300, 150, 27);
	    add(textField_4);
	
        Cancel.addActionListener(new ActionListener() //Action is performed when button is clicked
        {
            public void actionPerformed(ActionEvent ae)
            {
		
                String passenger_no = textField.getText();
		        String cancellation_no = textField_1.getText();
		        String cancellation_date = textField_2.getText();
		        String ticket_id = textField_3.getText();
		        String flight_code = textField_4.getText();
					
					
		        try
                {	
                    Connection conn;
                    Statement stat;
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ams", "root", "root");
                    stat=conn.createStatement();
                    String str = "INSERT INTO cancellation values('"+passenger_no+"', '"+cancellation_no+"', '"+cancellation_date+"', '"+ticket_id+"', '"+flight_code+"')";
		
                    stat.executeUpdate(str);
                    JOptionPane.showMessageDialog(null,"Ticket Canceled");
                    setVisible(false);
						
		        }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
        );
			
	    setSize(860,500);
	    setVisible(true); // Displaying the GUI
        setLocation(400,200); //Coordinates of GUI
    }
}
