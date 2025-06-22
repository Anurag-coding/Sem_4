class Buffer {
    private final int[] buffer = new int[5];
    private int count = 0;
    public synchronized void put(int value) throws InterruptedException {
        while (count == buffer.length) {
            wait(); // Buffer full, wait for space
        }
        buffer[count++] = value;
        System.out.println("Produced: " + value);
        notify(); // Notify consumer
    }
    public synchronized int get() throws InterruptedException {
        while (count == 0) {
            wait(); // Buffer empty, wait for data
        }
        int value = buffer[--count];
        System.out.println("Consumed: " + value);
        notify(); // Notify producer
        return value;
    }
}
class Producer extends Thread {
    private final Buffer buffer;
    Producer(Buffer buffer) {
        this.buffer = buffer;
    }
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.put(i);
                Thread.sleep(500); // Simulate production time
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
class Consumer extends Thread {
    private final Buffer buffer;
    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.get();
                Thread.sleep(800); // Simulate consumption time
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
public class q8 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        producer.start();
        consumer.start();
        try {
            producer.join();
            consumer.join();
            System.out.println("Producer and Consumer have completed their tasks.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
/* output:-
   Produced: 1
   Consumed: 1
   Produced: 2
   Consumed: 2
   Produced: 3
   Produced: 4
   Consumed: 4
   Produced: 5
   Consumed: 5
   Consumed: 3
   Producer and Consumer have completed their tasks
*/
