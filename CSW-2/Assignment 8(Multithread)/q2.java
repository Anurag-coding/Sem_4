class Addition extends Thread {
    public void run() { 
        System.out.println("Addition:10 + 5 = " + (10 + 5)); 
    }
}
class Subtraction extends Thread {
    public void run() { 
        System.out.println("Subtraction:10 - 5 = " + (10 - 5)); 
    }
}
class Multiplication extends Thread {
    public void run() { 
        System.out.println("Multiplication:10 * 5 = " + (10 * 5)); 
    }
}
class Division extends Thread {
    public void run() { 
        System.out.println("Division:10 / 5 = " + (float)(10 / 5)); 
    }
}
public class q2 {
    public static void main(String[] args) {
        new Addition().start();
        new Subtraction().start();
        new Multiplication().start();
        new Division().start();
    }
}
/*output:-
  Addition:10 + 5 = 15
  Subtraction:10 - 5 = 5
  Multiplication:10 * 5 = 50
  Division:10 / 5 = 2.0
*/
