class CustomNullPointerException extends Exception{
	public CustomNullPointerException(String s) {
		super(s);
	}
}
public class q2 {
	public static void show(String s)  throws CustomNullPointerException{
	if(s==null) {
		throw new CustomNullPointerException("String is null");
	}else {
		System.out.println(s);
	}
}
public static void main(String[] args) {
		try {
			show("abc");
			show(null);
		}catch(CustomNullPointerException e) {
			System.out.println(e);
		}
    }
}
/* output:-
   abc
   CustomNullPointerException: String is null
 */