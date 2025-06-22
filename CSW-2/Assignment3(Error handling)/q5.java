public class q5 {
    public static void main(String[] args) {
		try{
			String s="314.9";
			int x=Integer.parseInt(s);
			System.out.println(x); 
			
			try{
				System.out.println(3/0);
			}
			catch(ArithmeticException e){
				System.out.println(e);
			}
		}
        catch(NumberFormatException e) {
			System.out.println(e);
		}
    }
}
/* output:-
   java.lang.NumberFormatException: For input string: "314.9"
 */