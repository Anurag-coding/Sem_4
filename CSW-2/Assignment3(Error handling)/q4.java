public class q4 {
	public static void checkNum(int n) throws ArithmeticException{
		if(n<1) {
			throw new ArithmeticException("No. is -ve");
		}else {
			System.out.println("Sq Root of "+n+" = "+(float)Math.sqrt(n));
		}
	}
    public static void main(String[] args) {
		try {
			checkNum(-3);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
    }
}
/* output:-
   java.lang.ArithmeticException: No. is -ve
*/