import java.util.function.Function; 
public class q5 { 
    static Function<Integer, Integer> getSquare() { 
        return x -> x * x; 
    } 
    public static void main(String[] args) { 
        Function<Integer, Integer> square = getSquare(); 
        int[] numbers = {2, 7, 14, -6}; 
        for (int num : numbers) { 
            int result = square.apply(num); 
            System.out.println("Square of " + num + " is " + result); 
        } 
    } 
}
/* output:-
   Square of 2 is 4
   Square of 7 is 49
   Square of 14 is 196
   Square of -6 is 36
*/ 