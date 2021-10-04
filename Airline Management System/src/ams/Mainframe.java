//The main menu of the project

package ams;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Mainframe extends JFrame
{
    public static void main(String args[])
    {
        new Mainframe().setVisible(true);
    }

    public Mainframe()
    {
        super("AIRLINE MANAGEMENT SYSTEM");
        initialize();
    }

    private void initialize()
    {
	
        setForeground(Color.CYAN);
        setLayout(null); 

        JLabel NewLabel = new JLabel("");
	    NewLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("ams/Images/Lobby.jpg")));
	    NewLabel.setBounds(0, 0, 1920, 990); 
	    add(NewLabel); 
        
        JLabel AirlineManagementSystem = new JLabel("WELCOME TO AIRLINES SERVICES");
	    AirlineManagementSystem.setForeground(Color.BLUE);
        AirlineManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 36));
	    AirlineManagementSystem.setBounds(700, 60, 1000, 55);
	    NewLabel.add(AirlineManagementSystem);
		
        JMenuBar menuBar = new JMenuBar();
	    setJMenuBar(menuBar);
		
        JMenu AirlineSystem = new JMenu("AIRLINE SYSTEM");
        AirlineSystem.setForeground(Color.BLUE);
	    menuBar.add(AirlineSystem);
		
        JMenuItem FlightDetails = new JMenuItem("FLIGHT INFO");
	    AirlineSystem.add(FlightDetails);
		
	    JMenuItem ReservationDetails = new JMenuItem("ADD_CUSTOMER DETAILS");
	    AirlineSystem.add(ReservationDetails);
		
	    JMenuItem PassengerDetails = new JMenuItem("JOURNEY DETAILS");
	    AirlineSystem.add(PassengerDetails);
		
	    JMenuItem SectorDetails_1 = new JMenuItem("PAYMENT DETAILS");
	    AirlineSystem.add(SectorDetails_1);
		
	    JMenuItem Cancellation = new JMenuItem("CANCELLATION");
	    AirlineSystem.add(Cancellation);
        
	    FlightDetails.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new Flight_Info();
            }
        }
        );
        ReservationDetails.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try 
                {
                    new Add_Customer();
                } 
                catch (Exception e) 
                {
                    e.printStackTrace();
		        } 
            }
        }
        );
		
        PassengerDetails.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try 
                {
                    new Journey_Details();
                } 
                catch (Exception e) 
                {
                    e.printStackTrace();
                }
            }
        }
        );
		
        SectorDetails_1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try 
                {
                    new Payment_Details();
                } 
                catch (Exception e) 
                {
                    e.printStackTrace();
		        }
            }
        }
        );
		
        Cancellation.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new Cancel();
            }
        }
        );
		
        setSize(1950,1090);
	    setVisible(true);
    }
}