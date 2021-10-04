//Flight information

package ams;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Flight_Info extends JFrame
{

    private JTable table;
    private JTextField textField;
    public static void main(String[] args)
    {		 
	new Flight_Info().setVisible(true);    
    }
    
    public Flight_Info()
    {
        
        getContentPane().setBackground(Color.WHITE);
        getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(860,523);
	    setLayout(null);
	    setVisible(true);
		
	    JLabel Fcode = new JLabel("FLIGHT CODE");
	    Fcode.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Fcode.setBounds(50, 100, 200, 30);
	    add(Fcode);
	
		
	    JLabel FlightDetails = new JLabel("FLIGHT INFORMATION");
	    FlightDetails.setFont(new Font("Tahoma", Font.PLAIN, 31));
	    FlightDetails.setForeground(new Color(100, 149, 237));
	    FlightDetails.setBounds(50, 20, 570, 35);
	    add(FlightDetails);
		
	    JButton btnShow = new JButton("SHOW");
	    btnShow.setFont(new Font("Tahoma", Font.PLAIN, 20));
	
        btnShow.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae) 
            {
                String code = textField.getText();
                
                try 
                {
                    connection c = new connection();
                    String str = "select f_code,f_name,src,dst,capacity,class_code,class_name from flight,sector where f_code = '"+code+"'";
                    ResultSet rs = c.stat.executeQuery(str);
                    
                }
                catch(SQLException e)
                {
                    e.printStackTrace();
                }
            }
        }
        );