//A java connection file to connect to MySQL

package ams;

import java.sql.*;

public class connection
{
    Connection conn;
    Statement stat;

    public connection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ams", "root", "root");
            stat=conn.createStatement();
        }
        catch(Exception expt)
        {
            System.out.println(expt);
        }
    }
}