class UnreachableObject{
	String name;
	public UnreachableObject(String name) {
		this.name=name;
		System.out.println("Object "+name+" is created");
	}
	
	public void display() {
		UnreachableObject ob1=new UnreachableObject("Sohan"); 
	}
	
	public void show() {
		UnreachableObject ob2=new UnreachableObject("Aditya"); 
		display();
	}
	
	@Override
	protected void finalize()throws Throwable{
		System.out.println("Object "+name+" is Garbage Collected");
	}
}
public class q1 {
    public static void main(String[] args) {
		UnreachableObject ob=new UnreachableObject("Main");
		ob.show();
		ob=null;
		System.gc(); 
    }
}
/* output:-
   Object Main is created
   Object Aditya is created
   Object Sohan is created
   Object Sohan is Garbage Collected
   Object Aditya is Garbage Collected
*/