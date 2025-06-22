class Animal{
	String name;
	String color;
	String type;
	public Animal(String name,String color,String type) {
		this.color = color;
		this.name = name;
		this.type = type;
	}
	public int hashCode() {
		int x =(int) Math.floor(100+(Math.random()*1000));
		return x;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
public class q6 {
	public static void main(String[] args) {
		Animal[] obj = new Animal[3];
		obj[0] = new Animal("Dog","Black","Labrador");
		obj[1] = new Animal("Cat","Brown","Persian Cat");
		obj[2] = new Animal("Cow","White","Yadav Ji");
		int i = 1;
		for(Animal a : obj) {
			System.out.println("Hash Code of Animal"+(i++)+" is "+a.hashCode()+".");
		}
	}
}
/* output:-
   Hash Code of Animal1 is 666.
   Hash Code of Animal2 is 448.
   Hash Code of Animal3 is 1063.
*/
