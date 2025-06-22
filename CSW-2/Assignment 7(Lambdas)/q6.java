import java.util.function.Function; 
public class q6 { 
    static Function<Integer, Integer> getFactorial() { 
        return n -> { 
            if (n < 0) { 
                throw new IllegalArgumentException("Factorial is not defined for negative numbers."); 
            } 
            int result = 1; 
            for (int i = 2; i <= n; i++) { 
                result *= i; 
            } 
            return result; 
        }; 
    } 
    public static void main(String[] args) { 
        Function<Integer, Integer> factorial = getFactorial(); 
        int[] numbers = {0, 3, 5, -7}; 
        for (int num : numbers) { 
            System.out.println("Factorial of " + num + " is " + factorial.apply(num)); 
        } 
    } 
}
/* output:-
   Factorial of 0 is 1
   Factorial of 3 is 6
   Factorial of 5 is 120
   Exception in thread "main" java.lang.IllegalArgumentException: Factorial is not defined for negative numbers.
*/