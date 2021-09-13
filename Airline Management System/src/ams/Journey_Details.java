//A program to record journey details

package ams;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Journey_Details extends JFrame
{

    JTable table;
    JLabel ReservationDetails,Pnrno,Ticketid,Fcode,Jnydate,Jnytime,Source,Destination,label,label1;
    JButton Show;

    public static void main(String[] args)
    {
        new Journey_Details();
    }