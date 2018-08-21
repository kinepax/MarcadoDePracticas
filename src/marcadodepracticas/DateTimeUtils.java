
package marcadodepracticas;
//import java.time.LocalDate;
import java.sql.Date;
import java.sql.Time;
import java.time.Duration;
import java.time.LocalDateTime; //Para tener la hora y fecha actual
import java.time.LocalTime; //Para ver la hora actual
import java.time.temporal.ChronoUnit; //Para medir el tiempo 
import java.time.LocalDate; //Para la fecha Actual


public class DateTimeUtils {

    public static LocalTime getInitialTime() {
        return initialTime;
    }

    public static LocalTime getFinalTime() {
        return finalTime;
    }



public static LocalTime initialTime;
public static LocalTime finalTime;

public static LocalDateTime prueba;
public static LocalDate diadehoy;
dIngresoDatos ingreso = new dIngresoDatos();

    

    public static void main(String[] args) {
		//LocalDateTime today = LocalDateTime.now();
		//System.out.println("Current DateTime="+today);
                
                
               //  initialTime = LocalTime.now();
 
//                 finalTime = LocalTime.now();
                
              
		
	}

    public DateTimeUtils() {
    }
    
    public void tomarFecha(){
        
        diadehoy= LocalDate.now(); //Esta funcion hace tomar el dia de hoy
        //System.out.println(diadehoy);
        ingreso.diaHoy=Date.valueOf(diadehoy);
        System.out.println(ingreso.diaHoy);
       
        
    }
    public void iniciarTiempo(){
        
        initialTime = LocalTime.now(); //Toma la hora del momento de ser llamada
       // System.out.println(initialTime);
        ingreso.setHoraEntrada(Time.valueOf(initialTime));
        System.out.println(initialTime);
        ingreso.ingresarHora();
        //prueba= LocalDateTime.now();
    }
    public void finTiempo(){
        finalTime = LocalTime.now(); //Toma la hora al momento de ser llamada
        System.out.println(finalTime);
        ingreso.setHoraSalida(Time.valueOf(finalTime));
        
          int hours = ((int) ChronoUnit.HOURS.between(initialTime, finalTime));
          //La diferencia de horas entre el final y el inicial
          int minutos= ((int) ChronoUnit.MINUTES.between(initialTime, finalTime));
          //La diferencia de Minutos de la hora final a la hora inicial
          int segundos= ((int) ChronoUnit.SECONDS.between(initialTime, finalTime));
          //La diferencia de segundos hora inicial y final
          // Termina impriendo en pantalla
          String total="00"+":"+String.valueOf(minutos)+":"+"00";
          ingreso.setTiempoTotal(Time.valueOf(total));
                //System.out.println(hours);
                System.out.println(minutos);
                
           
                
                
                //System.out.println(segundos);
                ingreso.ingresarSalida();
             //   System.out.println(prueba);
          
    }
    public LocalDate fechaHoy(){
        LocalDate e = LocalDate.now();
       return e; 
    }


    
       

	


 
    
        
        
}
