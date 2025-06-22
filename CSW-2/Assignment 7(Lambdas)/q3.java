import java.util.*;
public class q3 { 
    public static void main(String[] args) { 
        List<String> strings = Arrays.asList("Java", "Python", "Lambda", "C++"); 
        strings.sort((s1, s2) -> Integer.compare(s2.length(), s1.length())); 
        System.out.println("Sorted Strings (by length, descending):"); 
        strings.forEach(System.out::println); 
    } 
} 
/* output:-
   Sorted Strings (by length, descending):
   Python
   Lambda
   Java
   C++
*/