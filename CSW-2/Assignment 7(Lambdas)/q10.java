import java.time.LocalDate; 
import java.time.temporal.ChronoUnit; 
import java.util.*; 
public class q10 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the start date (YYYY-MM-DD): "); 
        LocalDate startDate = LocalDate.parse(sc.nextLine()); 
        System.out.print("Enter the end date (YYYY-MM-DD): "); 
        LocalDate endDate = LocalDate.parse(sc.nextLine()); 
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate); 
        System.out.println("Number of days between the two dates: " + daysBetween); 
        sc.close(); 
    } 
} 
/* output:-
   Enter the start date (YYYY-MM-DD): 2024-11-30
   Enter the end date (YYYY-MM-DD): 2025-06-19
   Number of days between the two dates: 201
*/