class NumberPrinter {
    private int number = 1;
    private final int max;
    public NumberPrinter(int max) {
        this.max = max;
    }
    public synchronized void printOdd() {
        while (number <= max) {
            if (number % 2 == 0) {
                try {
                    wait(); // wait for even thread to notify
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            } else {
                System.out.println("Odd: " + number);
                number++;
                notify(); // notify even thread
            }
        }
    }
    public synchronized void printEven() {
        while (number <= max) {
            if (number % 2 != 0) {
                try {
                    wait(); // wait for odd thread to notify
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            } else {
                System.out.println("Even: " + number);
                number++;
                notify(); // notify odd thread
            }
        }
    }
}
public class q5 {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter(10); // Print numbers from 1 to 10
        Thread oddThread = new Thread(() -> printer.printOdd());
        Thread evenThread = new Thread(() -> printer.printEven());
        oddThread.start();
        evenThread.start();
    }
}
/*output:-
  Odd: 1
  Even: 2
  Odd: 3
  Even: 4
  Odd: 5
  Even: 6
  Odd: 7
  Even: 8
  Odd: 9
  Even: 10
*/
