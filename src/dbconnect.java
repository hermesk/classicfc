
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class dbconnect {
     Connection conn = null;
    
    public static Connection connecrDb()
    {
        try{ 
              // Class.forName("com.mysql.jdbc.Driver");
               Class.forName("org.sqlite.JDBC").newInstance();
               Connection conn = DriverManager.getConnection
        ("jdbc:sqlite:classicfc.sqlite");     

  //Connection conn = DriverManager.getConnection("jdbc:mysql:classicfc.sql","root","");     
               return conn;
           }
          catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
