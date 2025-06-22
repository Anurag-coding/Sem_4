public class q3 {
    public static void main(String[] args) {
    int num1 = 10;
    int num2 = 5;
    Thread addThread = new Thread(() -> {
        System.out.println("Addition: " + num1 + " + " + num2 + " = " +(num1 + num2));
    });
    Thread subtractThread = new Thread(() -> {
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " +(num1 - num2));
    });
    Thread multiplyThread = new Thread(() -> {
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = "+ (num1 * num2));
    });
    Thread divideThread = new Thread(() -> {
    if (num2 != 0) {
        System.out.println("Division: " + num1 + " / " + num2 + " = " +(num1 / num2));
    } else {
        System.out.println("Division by zero is not allowed.");
    }
    });
    addThread.start();
    subtractThread.start();
    multiplyThread.start();
    divideThread.start();
    }
   }
/* output:-
   Addition:10 + 5 = 15
   Subtraction:10 - 5 = 5
   Multiplication:10 * 5 = 50
   Division:10 / 5 = 2
*/
