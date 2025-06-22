import java.util.*;
public class q3 {
	public static void fun() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input String :");
		String s=sc.next();
		int x=Integer.parseInt(s);
		System.out.println(x);
	}
	public static void main(String[] args) {
		try {
			fun();
		}
		catch(NumberFormatException e) {
			System.out.println("Enter a valid Numeric Value");
			fun();
		}
    }
}
/* output:-
   Input String :str34g9h
   Enter a valid Numeric Value
   Input String :25489
   25489
*/
