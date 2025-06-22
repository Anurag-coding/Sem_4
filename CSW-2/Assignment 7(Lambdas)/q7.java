import java.time.LocalDate; 
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter; 
public class q7 { 
    public static void main(String[] args) { 
        LocalDateTime currentDateTime = LocalDateTime.now(); 
        System.out.println("Current Date and Time: " + currentDateTime); 
        LocalDate futureDate = LocalDate.now().plusWeeks(2); 
        System.out.println("Date after 2 weeks: " + futureDate); 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy"); 
        String formattedDate = LocalDate.now().format(formatter); 
        System.out.println("Formatted Current Date: " + formattedDate); 
    } 
}
/* output:-
   Current Date and Time: 2025-05-22T01:08:53.101893700
   Date after 2 weeks: 2025-06-05
   Formatted Current Date: 05/22/2025
*/