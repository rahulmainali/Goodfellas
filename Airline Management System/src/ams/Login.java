//A class for login page in AMS

package ams;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener // Using the interface of action listener
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
        // Creating row and column coordinates within the GUI
	
        l1 = new Label("Username");
        l1.setFont(f1);
	
        l2 = new Label("Password");
        l2.setFont(f1);

	
        t1 = new TextField(15); 
	    t2 = new TextField(15); 
        t2.setEchoChar('*');
	
	    b2 = new Button("Reset");
        b2.setFont(f2);
		
        b3 = new Button("Submit");
        b3.setFont(f2);
		
        b4 = new Button("Close");
	    b4.setFont(f2);
		
        gbc.gridx=0;
	    gbc.gridy=0; 
        gbl.setConstraints(l1,gbc);
	    add(l1);
	    //setting the coordinates of username label
        
	    gbc.gridx=2;
        gbc.gridy=0;
	    gbl.setConstraints(t1,gbc);
        add(t1);
        //setting the coordinates of username textfield
		
	    gbc.gridx=0;
        gbc.gridy=2;
	    gbl.setConstraints(l2,gbc);
        add(l2);
        //setting the coordinates of password label

	    gbc.gridx=2;
        gbc.gridy=2;
        gbl.setConstraints(t2,gbc);
	    add(t2);
        //setting the coordinates of password textfield
	
	    gbc.gridx=0;
        gbc.gridy=8;
	    gbl.setConstraints(b2,gbc);
        add(b2);
        //setting the coordinates of Reset button

        gbc.gridx=2;
	    gbc.gridy=8;
        gbl.setConstraints(b3,gbc);
	    add(b3);
        //setting the coordinates of Submit button
	
        gbc.gridx=4;
	    gbc.gridy=8;
        gbl.setConstraints(b4,gbc);
	    add(b4);
        //setting the coordinates of Close button

        b2.addActionListener(this);
        b3.addActionListener(this);
	    b4.addActionListener(this);
	    //Clicking the buttons for respective actions to be performed
                
        setVisible(true);   
        setSize(400,250); 
        setLocation(400,200);   
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b2)
        {
          
            t1.setText("");  
            t2.setText(""); 
        }
        
        if(ae.getSource()==b4)
        {
            System.exit(0); 
        }
        
        if(ae.getSource()==b3)
        {
            try
            {
                Connection conn;
                Statement stat;
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ams", "root", "root");
                stat=conn.createStatement();
                
                String s1 = t1.getText();
                String s2 = t2.getText();
            
                String str = "select * from login where username = '"+s1+"' and password = '"+s2+"'";
                ResultSet rs = stat.executeQuery(str);  
                
                if(rs.next())
                {
                    new Mainframe();
                    setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Invalid Login");
                    setVisible(false); 
                }
            
            }
            catch(Exception e)
            {

            }
        }
    }        
    
    public static void main(String[] args)
    {
        new Login();
    } //calling the constructor
}