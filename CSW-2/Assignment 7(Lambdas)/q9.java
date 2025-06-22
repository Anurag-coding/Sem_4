import java.time.LocalDate; 
import java.time.temporal.ChronoUnit; 
import java.util.*; 
public class q9 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the start date (yyyy-MM-dd): "); 
        LocalDate startDate = LocalDate.parse(sc.nextLine()); 
        LocalDate currentDate = LocalDate.now(); 
        long daysBetween = ChronoUnit.DAYS.between(startDate, currentDate); 
        System.out.print("Enter the initial amount: "); 
        double principal = sc.nextDouble(); 
        double intRate = 8.0; 
        double timeInYears = daysBetween / 365.0; 
        double interest = (principal * intRate * timeInYears) / 100; 
        double totalAmount = principal + interest; 
        System.out.println("Interest accrued: "+interest); 
        System.out.println("Total amount after interest: "+totalAmount); 
        sc.close(); 
    } 
} 
/* output:-
   Enter the start date (yyyy-MM-dd): 2024-10-14
   Enter the initial amount: 5000
   Interest accrued: 241.10
   Total amount after interest: 5241.10
*/