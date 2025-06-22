class SeatBooking {
    private int availableSeats = 10;
    // Method for booking seats
    public void book(String customer, int seatsRequested) {
        System.out.println(customer + " is trying to book " + seatsRequested + " seat(s).");
        synchronized (this) {
            if (seatsRequested <= availableSeats) {
                System.out.println("Seats available. Booking in progress for " + customer);
                try {
                    Thread.sleep(1000); // Simulate time taken for booking
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                availableSeats -= seatsRequested;
                System.out.println("Booking successful for " + customer + ". Seats left: " + availableSeats);
            } else {
                System.out.println("Booking failed for " + customer + ". Not enough seats available.");
            }
        }
    }
}
class CustomerThread extends Thread {
    private SeatBooking bookingSystem;
    private String customerName;
    private int seatsToBook;
    public CustomerThread(SeatBooking bookingSystem, String customerName, int seatsToBook) {
        this.bookingSystem = bookingSystem;
        this.customerName = customerName;
        this.seatsToBook = seatsToBook;
    }
public void run() {
        bookingSystem.book(customerName, seatsToBook);
    }
}
public class q6 {
    public static void main(String[] args) {
        SeatBooking bookingSystem = new SeatBooking();
        // Create customer threads
        CustomerThread c1 = new CustomerThread(bookingSystem, "Alice", 4);
        CustomerThread c2 = new CustomerThread(bookingSystem, "Bob", 5);
        CustomerThread c3 = new CustomerThread(bookingSystem, "Charlie", 3);
        c1.start();
        c2.start();
        c3.start();
    }
}
/* output:-
   Alice is trying to book 4 seat(s).
   Charlie is trying to book 3 seat(s).
   Bob is trying to book 5 seat(s).
   Seats available. Booking in progress for Alice
   Booking successful for Alice. Seats left: 6
   Seats available. Booking in progress for Bob
   Booking successful for Bob. Seats left: 1
   Booking failed for Charlie. Not enough seats available.
*/
