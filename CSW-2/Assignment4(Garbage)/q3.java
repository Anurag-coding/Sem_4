class NullifiedReference{
    String name;
    public NullifiedReference(String name){
        this.name=name;
        System.out.println("Object "+name+" created.");
    }
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object "+name+" is Garbage Collected.");
	}
}
public class q3 {
    public static void main(String[] args) {
            NullifiedReference ob1=new NullifiedReference("Ankit");
            ob1=null;
            System.gc();
    }
}
/* output:-
   Object Ankit created.
   Object Ankit is Garbage Collected.
*/