import java.lang.ref.Cleaner;
import Student.CleanupTask;
class Student{
	private String name;
	private int rollno;
	private static final Cleaner cleaner = Cleaner.create();
	private final Cleaner.Cleanable cleanable;
	public Student(String name,int rollno) {
		this.name=name;
		this.rollno=rollno;
		this.cleanable=cleaner.register(this,new CleanupTask(name));
	}
	public void display() {
		System.out.println("Name: "+name+"\n"+"Rollno: "+rollno+"\n");
	}
	private static class CleanupTask implements Runnable{
		private final String name;
		CleanupTask(String name){
			this.name=name;
		}
		@Override
		public void run() {
			System.out.println("Cleanup: "+name);
		}
    }
}
public class cleaner {
	public static void main(String[] args) {
		Student s1 = new Student("Anurag",101);
		Student s2 = new Student("Sohan",201);
		s1.display();
		s2.display();
		s1=null;
		s2=null;
		System.gc();
	}
}
/* output:-
   Name: Anurag
   Rollno: 101

   Name: Sohan
   Rollno: 201
*/