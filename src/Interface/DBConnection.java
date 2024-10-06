/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author moin2
 */

 
public class DBConnection {
   
    public static Connection connect()
    {
        
        Connection conn=null;
        try {
            
        
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/newstationary","root","");
            JOptionPane.showMessageDialog(null, "connection success");
        } catch (Exception e) {
    
        }
        return conn;
        }
}
    
               
            
            

