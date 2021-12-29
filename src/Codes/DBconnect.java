
package Codes;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class DBconnect 
{
    public static Connection connect()
    {
        Connection conn = null;
        
               try 
               {
                   Class.forName("com.mysql.jdbc.Driver");
                   conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/waterbotleorg","root","");
                } 
               
               catch (ClassNotFoundException | SQLException e) 
               {
                   JOptionPane.showMessageDialog(null, e);
                }
 
        
        
        
        return conn;
    }
    
    
}
