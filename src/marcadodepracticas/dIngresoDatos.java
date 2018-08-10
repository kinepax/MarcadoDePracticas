
package marcadodepracticas;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;


public class dIngresoDatos {
    
    public Date diaHoy;
    public Time horaEntrada;
    public Time horaSalida;
    public Time tiempoTotal;    

    public dIngresoDatos(Date diaHoy, Time horaEntrada, Time horaSalida, Time tiempoTotal) {
        this.diaHoy = diaHoy;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.tiempoTotal = tiempoTotal;
    }

    dIngresoDatos() {
        
    }

    public Date getDiaHoy() {
        return diaHoy;
    }

    public void setDiaHoy(Date diaHoy) {
        this.diaHoy = diaHoy;
    }

    public Time getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Time horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Time getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Time horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Time getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(Time tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }
    
    public void ingresarHora(){
        ConexionBd con = new ConexionBd();
            Connection conexion = con.conexion();
        try {
            
           //Se invoca el procedimiento almacenado
            CallableStatement sp= conexion.prepareCall("CALL spInsertarFechaEntrada(?,?)");
            
           sp.setDate(1, diaHoy);
           sp.setTime(2, horaEntrada);
           sp.execute();
           Statement stmt = conexion.createStatement();       
            
            ResultSet getKeyRs = stmt.executeQuery("SELECT LAST_INSERT_ID()");
            
                if (getKeyRs != null) {
                   if (getKeyRs.next()) {
                       int lastInsertedId=getKeyRs.getInt(1);
                       System.out.println(lastInsertedId);
                    }
                    getKeyRs.close();
                }
            
            conexion.close();
            
            
           
        } catch (SQLException ex) {
            Logger.getLogger(dIngresoDatos.class.getName()).log(Level.SEVERE, null, ex);
            //Comentario
        }
       
        
    }
    
    
    
    
    
}
