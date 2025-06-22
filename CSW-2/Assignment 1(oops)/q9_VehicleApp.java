interface Vehicle {
	void accelerate(int val); 
    void brake();
}
class Car1 implements Vehicle {
    int speed; 
    @Override
    public void accelerate(int val) {
        speed += val;
        System.out.println("Car accelerated by " + val + " km/h. Current speed: " + speed + " km/h.");
        if (speed >= 120) {
            System.out.println("Warning: Speed is over 120 km/h. Please slow down.");
        }
    }
    //Method Overloading
    public void accelerate(int speed, int duration) {
        System.out.println("Car accelerated to " + speed + " km/h for " + duration + " minutes.");
    }
    @Override
    public void brake() {
        if (speed > 0) {
            speed -= 5; 
            System.out.println("Car braked. Current speed: " + speed + " km/h.");
        } else {
            System.out.println("Car is already stopped.");
        }
    }
}
class Bicycle implements Vehicle {
    int speed;
    @Override
    public void accelerate(int val) {
        speed += val; 
        System.out.println("Bicycle accelerated by " + val + " km/h. Current speed: " + speed + " km/h.");
    }
    public void accelerate(int speed, int duration) {
        System.out.println("Bicycle accelerated to " + speed + " km/h for " + duration + " minutes.");
    }
    @Override
    public void brake() {
        if (speed > 0) {
            speed -= 2; 
            System.out.println("Bicycle braked. Current speed: " + speed + " km/h.");
        } else {
            System.out.println("Bicycle is already stopped.");
        }
    }
}
public class q9_VehicleApp {
    public static void main(String[] args) {
    	    Vehicle myCar = new Car1();
        Vehicle myBicycle = new Bicycle();
        
        myCar.accelerate(50); 
        myCar.brake(); 

        myBicycle.accelerate(15); 
        myBicycle.brake();

       
        ((Car1) myCar).accelerate(100, 10); 
        ((Bicycle) myBicycle).accelerate(25, 5); 
    }
}
/* output:-
   Car accelerated by 50 km/h. Current speed: 50 km/h.
   Car braked. Current speed: 45 km/h.
   Bicycle accelerated by 15 km/h. Current speed: 15 km/h.
   Bicycle braked. Current speed: 13 km/h.
   Car accelerated to 100 km/h for 10 minutes.
   Bicycle accelerated to 25 km/h for 5 minutes.
*/