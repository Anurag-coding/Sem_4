import java.util.*;	
class User implements Comparable<User>{
	private String name;
	private int age;
	public User(String name, int age) {
		this.name = name;
		this.age = age;
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
	public String toString() {
		return "Name :"+getName()+", Age: "+getAge();
	}
    public int compareTo(User o) {
		if(this.age==o.age) {
			return 0;
		}else if(this.age>o.age) {
			return 1;
		}else {
			return -1;
		}
	}
}
public class q2 {
    public static void main(String[] args) {
		ArrayList<User>al=new ArrayList<>();
		al.add(new User("Anurag",23));
		al.add(new User("Piyush",19));
		al.add(new User("Somaya",56));
		for(User i:al) {
			System.out.println(i);
		}
        //Sorting users based on age :
		Collections.sort(al);
		System.out.println("\nSorting Users based on Age : ");
		for(User i:al) {
			System.out.println(i);
		}
	}
}
/* output:-
   Name :Anurag, Age: 23
   Name :Piyush, Age: 19
   Name :Somaya, Age: 56

   Sorting Users based on Age :
   Name :Piyush, Age: 19
   Name :Anurag, Age: 23
   Name :Somaya, Age: 56
*/