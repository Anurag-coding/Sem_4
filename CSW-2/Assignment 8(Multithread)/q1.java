class SumThread extends Thread {
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            sum = sum+i;
        }
        System.out.println("Sum of first 100 natural numbers: " + sum);
    }
}
class TableThread extends Thread {
    int number;
    TableThread(int number) { 
        this.number = number; 
    }
    public void run() {
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++)
            System.out.println(number + " x " + i + " = " + (number * i));
    }
}
public class q1 {
    public static void main(String[] args) {
        new SumThread().start();
        new TableThread(17).start();
    }
}
/* output:-
   Sum of first 100 natural numbers: 5050
   Multiplication Table of 17:
   17 x 1 = 17
   17 x 2 = 34
   17 x 3 = 51
   17 x 4 = 68
   17 x 5 = 85
   17 x 6 = 102
   17 x 7 = 119
   17 x 8 = 136
   17 x 9 = 153
   17 x 10 = 170
*/

