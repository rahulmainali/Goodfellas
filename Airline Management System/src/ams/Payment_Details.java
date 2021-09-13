//A program to record payment details

package ams;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class Payment_Details extends JFrame
{

    JTextField textField;
    JTable table;
    JLabel Sector;
    JLabel FlightCode, Capacity, Classcode, Classname, label;

    public static void main(String[] args)
    {
        new Payment_Details();
    }