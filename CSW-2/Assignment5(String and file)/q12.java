import java.io.*;
public class q12 {
	public static void searchFile(File f[],String ext) {
		ext=".java";
		if(f!=null) {
			for(File i:f) {
				if(i.isFile()&& i.getName().endsWith(ext)) { //to search a particular type of file (Eg. .txt , .java , etc) 
					System.out.println(i.getName());
				}
			}
		}
	}
    public static void main(String[] args) {
		File f=new File("C:\\Users\\Anurag");
		if(!f.exists()||!f.isDirectory()) {
			System.out.println("Doesn't Exist");
		}
		File arr[]=f.listFiles();
		if(arr!=null) {
            for(File i:arr){
                if(i.isFile()){
						System.out.println("The file name is"+i.getName());
					}
					else if(i.isDirectory()){
						System.out.println("The file name is"+i.getName());
					}
				}
			}
        System.out.println("\nAll Java Files are as Follows : ");
		searchFile(arr,".java");
	}
}
/* output:-
   The file name isCSW1_Assignment_bitwise (2).pdf
   The file name isCSW1_Assignment_bitwise.pdf
   The file name isCSW1_Assignment_Bootstrap (2).pdf
   The file name isCSW1_Assignment_Bootstrap.pdf
   The file name isCSW1_Assignment_jQuery.pdf
   The file name isCSW1_Assignment_Wrapper.pdf

   All Java Files are as Follows : 
   abs_Q2.java
   ClearBit.java
   encap_Q1.java
   Implementation.java
   InheritQ1.java
*/