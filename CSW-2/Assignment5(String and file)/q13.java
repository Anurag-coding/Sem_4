import java.io.*;
import java.util.*;
public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the file to delete:");
        String f = sc.nextLine();
        File file = new File("C:\\\\Users\\\\Anurag\\\\OneDrive\\\\Desktop\\\\Assignment5(String and file)\\\\Assign\\\\src\\\\q11.java" +f);
        if (file.exists()) {
        	if(file.delete()) {
                System.out.println("File "+f+" deleted successfully");
            }
        } else {
            System.out.println("File does not exist.");
        }
        
        sc.close();
    }
}