class Hello implements Comparable <Hello>{
	String name;
	int rollNumber;
	double totalMark;
	public Hello(String name, int rollNumber, double totalMark) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.totalMark = totalMark;
	}
	public String toString() {
		 return("Name:"+name+" "+"Rollno.:"+rollNumber+" "+"Totalmarks:"+totalMark);
	}
	@Override
	public int compareTo(Hello o) {
		if(this.rollNumber==o.rollNumber)
			return 1;
		else
			return 0;
	}
}
public class q4 {
	public static void main(String[] args) {
		Hello[] ob = new Hello[2];
		ob[0] = new Hello("ABC",1245,789);
		ob[1] = new Hello("NHF",1289,567);
		Hello o = new Hello("HELLO",1267,745);
		for(int i=0;i<ob.length;i++) {
			if(ob[i].compareTo(o)==1) {
				System.out.println("Student found");
				System.out.println(o.toString());
			}
			else {
				System.out.println("Student not found");
			}
		}
	}
}
/* output:-
   Student not found
   Student not found
*/
