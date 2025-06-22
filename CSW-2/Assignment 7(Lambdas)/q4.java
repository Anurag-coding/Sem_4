 interface Shape { 
    double area(); 
    default void printArea() { 
        System.out.println("Area: " + area()); 
    } 
} 
public class q4 { 
    public static void main(String[] args) { 
        double radius = 5; 
        Shape circle = () -> Math.PI * radius * radius; 
        System.out.print("Circle: "); 
        circle.printArea(); 
        double side = 3; 
        Shape square = () -> side * side; 
        System.out.print("Square: "); 
        square.printArea(); 
        double length = 9; 
        double width = 6; 
        Shape rectangle = () -> length * width; 
        System.out.print("Rectangle: "); 
        rectangle.printArea(); 
    } 
} 
/* output:-
   Circle: Area: 78.53981633974483
   Square: Area: 9.0
   Rectangle: Area: 54.0
*/