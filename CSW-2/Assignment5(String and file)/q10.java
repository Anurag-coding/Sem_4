import java.io.*;
public class q10 {
    public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("C:\\Users\\Anurag\\OneDrive\\Desktop\\Assignment5(String and file)\\q10.java");
			int i;
			while((i=f.read())!=-1) {
				System.out.print((char)i);
			}
			f.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
/* output:-
   2025-06-22Welcome to programming
*/