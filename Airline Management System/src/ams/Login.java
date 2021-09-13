//A class for login page in AMS

package ams;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{
    
    TextField t1,t2;
    Label l1,l2;
    Button b2,b3,b4;
    GridBagLayout gbl;  
    GridBagConstraints gbc; 
    Font f1,f2;
    
    public Login()
    {
        super("Login");
                
        setBackground(Color.WHITE); 
        f1 = new Font("TimesRoman",Font.BOLD,20);
        f2 = new Font("TimesRoman",Font.BOLD,15);
		
        gbl=new GridBagLayout(); 
	    gbc=new GridBagConstraints();
        setLayout(gbl); 
	
        l1 = new Label("Username");
        l1.setFont(f1);
	
        l2 = new Label("Password");
        l2.setFont(f1);

	
        t1 = new TextField(15); 
	    t2 = new TextField(15); 
        t2.setEchoChar('*');