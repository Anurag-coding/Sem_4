class ReassigningReference {
	String name;
	public ReassigningReference(String name) {
		this.name=name;
		System.out.println("Object "+name+" created.");
	}
	public void display() {
		System.out.println("Hii Object "+name);
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object "+name+" is Garbage Collected.");
	}
}
public class q2 {
    public static void main(String[] args) {
		ReassigningReference ob1=new ReassigningReference("Rakesh");
		ReassigningReference ob2=new ReassigningReference("Somaya");
		ob1=ob2;
		System.gc();
		ob1.display();
		ob2.display();
    }
}
/* otput:-
   Object Rakesh created.
   Object Somaya created.
   Object Rakesh is Garbage Collected.
   Hii Object Somaya
   Hii Object Somaya
*/