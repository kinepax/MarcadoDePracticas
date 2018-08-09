
package marcadodepracticas;
//import java.time.LocalDate;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;


public class DateTimeUtils {

public static LocalTime initialTime;
public static LocalTime finalTime;

public static LocalDateTime prueba;
public static LocalDate diahoy;
    
    
    public static void main(String[] args) {
		//LocalDateTime today = LocalDateTime.now();
		//System.out.println("Current DateTime="+today);
                
                
               //  initialTime = LocalTime.now();
 
//                 finalTime = LocalTime.now();
                
              
		
	}

    public DateTimeUtils() {
    }
    
    public void tomarFecha(){
        
        diahoy= LocalDate.now();
        System.out.println(diahoy);
        
    }
    public void iniciarTiempo(){
        
        initialTime = LocalTime.now();
        System.out.println(initialTime);
        //prueba= LocalDateTime.now();
    }
    public void finTiempo(){
        finalTime = LocalTime.now();
        System.out.println(finalTime);
          int hours = (int) ChronoUnit.HOURS.between(finalTime, initialTime);
          int minutos= (int) ChronoUnit.MINUTES.between(finalTime, initialTime);
          int segundos= (int) ChronoUnit.SECONDS.between(initialTime, finalTime);      
                System.out.println(hours);
                System.out.println(minutos);
                System.out.println(segundos);
                
             //   System.out.println(prueba);
          
    }


    
       

	


 
    
        
        
}
