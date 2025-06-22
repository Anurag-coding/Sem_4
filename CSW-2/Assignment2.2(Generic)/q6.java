import java.util.*;
public class q6{
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("TreeSet Elements: " + numbers);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's present in the TreeSet: ");
        int checkNumber = sc.nextInt();
        if (numbers.contains(checkNumber)) {
            System.out.println(checkNumber + " is present in the TreeSet.");
        } else {
            System.out.println(checkNumber + " is not present in the TreeSet.");
        }
        System.out.print("Enter a number to remove from the TreeSet: ");
        int removeNumber = sc.nextInt();
        
        if (numbers.remove(removeNumber)) {
            System.out.println(removeNumber + " has been removed.");
        } else {
            System.out.println(removeNumber + " was not found in the TreeSet.");
        }
        System.out.println("Updated TreeSet: " + numbers);
        sc.close();
    }
}
/* output:-
   TreeSet Elements: [10, 20, 30, 40, 50]
   Enter a number to check if it's present in the TreeSet: 30
   30 is present in the TreeSet.
*/
