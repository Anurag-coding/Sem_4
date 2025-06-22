class Car{
	private String make;private String model;
	Car(String make,String model){
		this.make=make;
		this.model=model;
	}
	public void setter(String make,String model) {
		this.make=make;this.model=model;
	}
	public String toString() {
		return("Make: "+make+" Model: "+model);
	}
}
public class q1_CarTester{
	public static void main(String[] args) {
		Car car1=new Car("farari","xyz");
		Car car2 = new Car(null,null);
		System.out.println("Make and Model for car-1: "+car1.toString());
		System.out.println("Make and Model for car-2: "+car2.toString());
		car2.setter("bmw", "abc");
		System.out.println("Make and Model for car-2: "+car2.toString());
	}
}
/* output:-
   Make and Model for car-1: Make: farari Model: xyz
   Make and Model for car-2: Make: null Model: null
   Make and Model for car-2: Make: bmw Model: abc
*/