public class q1 {
    public static void main(String[] args) {
		String s="St3r2i5ng";
		try {
			boolean num=false;
			System.out.print("Numeric Characters : ");
			for(int i=0;i<s.length();i++) {
				if(Character.isDigit(s.charAt(i))) {
					num=true;
					if(num==true) {
						System.out.print(s.charAt(i)+" ");
						
					}
				}
			}if(num==false) {
				System.out.println("Numeric char not found");
			}
		}
		catch(NullPointerException e) {
			System.out.println("Null String");
			System.out.println(e);
		}
    }
}
/* output:-
   Numeric Characters : 3 2 5 

   And if you store "String" in variable s then,
   Numeric Characters : Numeric char not found
*/