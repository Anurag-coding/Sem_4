import java.io.*;
import java.time.LocalDateTime;
import java.util.Scanner;
public class q11 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		File file=new File("C:\\Users\\Anurag\\OneDrive\\Desktop\\Assignment5(String and file)\\Assign\\src\\q11.java");
		if(!file.exists()) {
			System.out.println("Diary doesn't exist");
		}
		try (BufferedWriter w=new BufferedWriter (new FileWriter(file,true))){
			System.out.println("Enter your diary Entry : ");
			String s=sc.nextLine();
			String timestamp=LocalDateTime.now().toString();
			w.write("\nDate "+timestamp+"\n"+s+"\n");
			System.out.println("New Entry Added Successfully");
		}
		catch(Exception e) {
			System.out.println("Error Appending to file : "+e.getMessage());
		}

	}

}
/* output:-
   Date 2025-06-22T13:11:47.894769800
   Enter your diary Entry : 
   Good Morning!!
   New Entry Added Successfully
*/

