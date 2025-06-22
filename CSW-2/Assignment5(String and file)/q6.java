import java.util.*;
public class q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        char[] charArray = inputString.toCharArray();
        System.out.println("Character Array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.print("Enter a character to search: ");
        char search = sc.next().charAt(0);
        int firstOccurrence = -1;
        int lastOccurrence = -1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == search) {
                if (firstOccurrence == -1) {
                    firstOccurrence = i;
                }
                lastOccurrence = i;
            }
        }
        if (firstOccurrence != -1) {
            System.out.println("First occurrence of '" + search + "': " + firstOccurrence);
            System.out.println("Last occurrence of '" + search + "': " + lastOccurrence);
        } else {
            System.out.println("Character '" + search + "' not found in the string.");
        }
        sc.close();
    }
}
/* output:-
   Enter a string: Welcome to the world of string
   Character Array: 
   W e l c o m e   t o   t h e   w o r l d   o f   s t r i n g 
*/