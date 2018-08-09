
package marcadodepracticas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConexionBd {
   
Connection conn= null;
 public  Connection  conexion(){
     try {
     //El problema que teniamos era por el utc de la bd
     // SET GLOBAL time_zone = '-5:00'
    conn =
       DriverManager.getConnection("jdbc:mysql://localhost/test?"+ 
                                   "user=root&password="
               );

    // Do something with the Connection
         System.out.println("Conexion realizada correctamente");
         
         //Enviamos la Conexion para despues usasrla 
         return conn;


} catch (SQLException ex) {
    // handle any errors
    //Para que nos dia que error hemos tenido 
    System.out.println("SQLException: " + ex.getMessage());
    System.out.println("SQLState: " + ex.getSQLState());
    System.out.println("VendorError: " + ex.getErrorCode());
     return null;
}   
    }
    public static void main(String[] args) {
        ConexionBd x = new ConexionBd();
        x.conexion();
    }
  
    
    
}