import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;
class Student{
	String name;
	int age;
	double mark;
	public Student(String name, int age, double mark) {
		this.name = name;
		this.age = age;
		this.mark = mark;
	}
    public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}
    public int getAge() {
		return age;
	}
    public void setAge(int age) {
		this.age = age;
	}
    public double getMark() {
		return mark;
	}
    public void setMark(double mark) {
		this.mark = mark;
	}
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Double.doubleToLongBits(mark) == Double.doubleToLongBits(other.mark)
				&& Objects.equals(name, other.name);
	}
}
public class q4 {
    public static void main(String[] args) {
		LinkedList<Student> l = new LinkedList<>();
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter number of input :");
		int n = sc.nextInt();
		System.out.println("Enter value in ArrayList :");
		for(int i = 0;i < n;i++) {
			l.add(new Student(sc.next(),sc.nextInt(),sc.nextDouble()));
		}
		System.out.println("Using Advance For Loop");
		for(Student ob: l) {
			System.out.println("Name : "+ob.name+", Age: "+ob.age);
		}
		System.out.println("");
		Iterator it = l.iterator();
		System.out.println("Using Iterator Class");
		while(it.hasNext()) {
			Student ob = (Student) it.next();	
			System.out.println("Name : "+ob.name+", Age: "+ob.age);
		}
		System.out.println();
		System.out.println("\nEnter name and age of user to search:");
	    String searchName = sc.next();
	    int searchAge = sc.nextInt();
	    double searchMark = sc.nextDouble();	   
	    Student searchUser = new Student(searchName, searchAge,searchMark);
	    boolean found = false;
        for (Student user : l) {
            if (user.equals(searchUser)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("User found in the list!");
        } else {
            System.out.println("User not found.");
        }
		sc.close();
    }
}