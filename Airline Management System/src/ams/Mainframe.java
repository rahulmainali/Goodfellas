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
    } // calling the constructor

    public Mainframe()
    {
        super("AIRLINE MANAGEMENT SYSTEM"); //Setting the title
        initialize(); // calling initialize methof
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
        //Creating a menu on top of the program

        JMenu AirlineSystem = new JMenu("AIRLINE SYSTEM");
        AirlineSystem.setForeground(Color.BLUE);
        menuBar.add(AirlineSystem);
        //Creating a dropdown menu on JMenuBar

        JMenuItem FlightDetails = new JMenuItem("FLIGHT INFO");
        AirlineSystem.add(FlightDetails);
        //adding flight info in dropdown menu

        JMenuItem ReservationDetails = new JMenuItem("ADD_CUSTOMER DETAILS");
        AirlineSystem.add(ReservationDetails);
        //adding reservation detail in dropdown menu

        JMenuItem PassengerDetails = new JMenuItem("JOURNEY DETAILS");
        AirlineSystem.add(PassengerDetails);
        //adding customer detail in dropdown menu

        JMenuItem Cancellation = new JMenuItem("CANCELLATION");
        AirlineSystem.add(Cancellation);
        //adding cancellation in dropdown menu

        FlightDetails.addActionListener(new ActionListener() //Calling flight info
                                        {
                                            public void actionPerformed(ActionEvent ae)
                                            {
                                                new Flight_Info();
                                            }
                                        }
        );
        ReservationDetails.addActionListener(new ActionListener() //Calling add customer details
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

        PassengerDetails.addActionListener(new ActionListener() //Calling Journey details
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



        Cancellation.addActionListener(new ActionListener() //Calling cancellation
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