import java.io.*;
import java.util.Scanner;
import java.time.LocalDate;
public class q9 {
    public static void main(String[] args) {
		try {
			FileOutputStream ob=new FileOutputStream("C:\\Users\\Anurag\\OneDrive\\Desktop\\Assignment5(String and file)\\assign1\\src\\q9.java");
			Scanner sc=new Scanner(System.in);
			LocalDate dt=LocalDate.now();
			String s1=dt.toString();
			System.out.println(s1);
			byte b1[]=s1.getBytes();
			ob.write(b1);
			System.out.println("Input Content : ");
			String s=sc.nextLine();
			byte b[]=s.getBytes();
			ob.write(b);
			ob.close();
			System.out.println("File Saved Successfully");
		}
        catch(Exception e) {
			System.out.println(e.getMessage());
		}
    }
}
/* output:-
   2025-06-19
   Input Content : 
   welcome to programming
   File Saved Successfully
*/