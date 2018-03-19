/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author hamma
 */
public class DatabaseConnection {
    
    
    public static Connection databaseconnection()
    {
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
    
    Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "", "");
     return c;
    
    }
    catch(Exception e)
    {
    JOptionPane.showMessageDialog(null,e);
    return null;
    }
    }
}
    
    
    

