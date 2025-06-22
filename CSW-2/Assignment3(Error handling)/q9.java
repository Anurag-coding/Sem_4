import java.util.*;
public class q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input Integer :");
        String s=sc.next();
        try{
            int x=Integer.parseInt(s);
            System.out.println("After Converting to Integer:"+x);
        }catch(InputMismatchException e){
            System.out.println(e);
        }
    }
}
/* output:-
   Input Integer :984
   After Converting to Integer:984
*/