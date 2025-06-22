interface Calculator { 
    double operate(double a, double b); 
} 
public class q2 { 
    public static void main(String[] args) { 
        Calculator addition = (a, b) -> a + b; 
        Calculator subtraction = (a, b) -> a - b; 
        Calculator multiplication = (a, b) -> a * b; 
        Calculator division = (a, b) -> b != 0 ? a / b : Double.NaN; 
        double x = 14; 
        double y = 3; 
        System.out.println("Addition: " + addition.operate(x, y)); 
        System.out.println("Subtraction: " + subtraction.operate(x, y)); 
        System.out.println("Multiplication: " + multiplication.operate(x, y)); 
        System.out.println("Division: " + division.operate(x, y)); 
    } 
} 
/* output:-
   Addition: 17.0
   Subtraction: 11.0
   Multiplication: 42.0
   Division: 4.666666666666667
*/