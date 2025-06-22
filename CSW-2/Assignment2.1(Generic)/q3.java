class Car implements Comparable<Car>{
	String model;
	String color;
	int speed;
	public Car(String model,String color,int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	public String toString() {
		 return("Model:"+model+" "+"Color:"+color+" "+"Speed:"+speed);
	}
	@Override
	public int compareTo(Car o) {
		if(this.speed == o.speed)
			return 0;
		else if(this.speed > o.speed)
			return 1;
		else
			return -1;
	}
}
public class q3 {
	public static void main(String[] args) {
		Car ob1 = new Car("Thar","Black",80);
		Car ob2 = new Car("Scorpio","White",95);
		System.out.println("Details :\n"+ob1.toString()+"\n"+ob2.toString());
		if(ob1.compareTo(ob2)==0)
			System.out.println("both car has the same speed");
		else if(ob1.compareTo(ob2)==1)
			System.out.println("car 1 has more speed than car 2");
		else
			System.out.println("car 2 has more speed than car 1");
	}
}
/* output:-
   Details :
   Model:Thar Color:Black Speed:80
   Model:Scorpio Color:White Speed:95
   car 2 has more speed than car 1
*/
