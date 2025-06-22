import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String first = sc.nextLine();
        System.out.print("Enter the second string: ");
        String second = sc.nextLine();
        String firstLower = first.toLowerCase();
        String firstUpper = first.toUpperCase();
        String secondLower = second.toLowerCase();
        String secondUpper = second.toUpperCase();
        System.out.println("First string in lowercase: " + firstLower);
        System.out.println("First string in uppercase: " + firstUpper);
        System.out.println("Second string in lowercase: " + secondLower);
        System.out.println("Second string in uppercase: " + secondUpper);
        boolean EqualIgnore = first.equalsIgnoreCase(second);
        if (EqualIgnore) {
            System.out.println("The two strings are equal (case-insensitive).");
        } else {
            System.out.println("The two strings are not equal (case-insensitive).");
        }
        sc.close();
    }
}
/* output:-
   Enter the first string: This is csw
   Enter the second string: This is not Ad 
   First string in lowercase: this is csw
   First string in uppercase: THIS IS CSW
   Second string in lowercase: this is not ad
   Second string in uppercase: THIS IS NOT AD
   The two strings are not equal (case-insensitive).
*/