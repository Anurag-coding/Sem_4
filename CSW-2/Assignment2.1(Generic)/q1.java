class Student<T> {
	String name;
	int rollnumber;
	int age;
	public Student(String name,int rollnumber,int age) {
		this.name = name;
		this.rollnumber = rollnumber;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollnumber);
        System.out.println("Age: " + age);
    }
}
public class q1{
	public static void main(String[] args) {
		Student<Integer>ob = new Student<>("Anurag",12131,20);
		Student<String>ob1 = new Student<>("Sohan",12146,19);
		ob.displayDetails();
		ob1.displayDetails();
	}
}
/* output:-
   Name: Anurag
   Roll Number: 12131
   Age: 20
   Name: Sohan
   Roll Number: 12146
   Age: 19
*/