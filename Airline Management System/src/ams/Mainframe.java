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