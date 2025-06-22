import java.util.HashSet;
public class q9 {
	public static void main(String[] args) {
		HashSet<Integer>ob = new HashSet<>();
		HashSet<Integer>ob1 = new HashSet<>();
		    int x[]= {1,1,2,3,4,5,3,5};
		    for(Integer i:x) {
			   if(!ob.contains(x[i]))
				  ob.add(x[i]);
			   else
				  ob1.add(x[i]);
		    }
		    System.out.println("Details of repeating integers: "+ob1);
		}
}
/* output:- 
   Details of repeating integers: [1, 3, 5]
*/