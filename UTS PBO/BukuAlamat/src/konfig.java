

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
        
public class konfig {
    
    private static Connection MySQLConfig;
    
    public static Connection configDB() throws SQLException{
        
        try{
            
            String url = "jdbc:mysql://localhost:3306/latihanbukualamat";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url, user, pass); 
        }catch (SQLException e ){
            System.out.println("Koneksi kedatabase gagal"+ e.getMessage());
        }
        
        return MySQLConfig;
    }
   
    
    
}
