import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter; 
public class q8 { 
    public static void main(String[] args) { 
        LocalDateTime DateTime = LocalDateTime.of(2025, 5, 22, 1, 29, 45); 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); 
        String formattedDateTime = DateTime.format(formatter); 
        System.out.println("Formatted Date and Time: " + formattedDateTime); 
    } 
} 
/* output:-
   Formatted Date and Time: 2025-05-22 01:29:45
 */