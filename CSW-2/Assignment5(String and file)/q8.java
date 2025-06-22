import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userString = scanner.nextLine();
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Convert to lowercase");
            System.out.println("2. Convert to uppercase");
            System.out.println("3. Search for a character");
            System.out.println("4. Search for an index");
            System.out.println("5. Concatenate with another string");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Lowercase: " + userString.toLowerCase());
                    break;
                case 2:
                    System.out.println("Uppercase: " + userString.toUpperCase());
                    break;
                case 3:
                    System.out.print("Enter a character to search for: ");
                    char searchChar = scanner.nextLine().charAt(0);
                    if (userString.indexOf(searchChar) != -1) {
                        System.out.println("Character '" + searchChar + "' found in the string.");
                    } else {
                        System.out.println("Character '" + searchChar + "' not found in the string.");
                    }
                    break;
                case 4:
                    System.out.print("Enter an index to search for: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < userString.length()) {
                        System.out.println("Character at index " + index + ": " + userString.charAt(index));
                    } else {
                        System.out.println("Index out of bounds.");
                    }
                    break;
                case 5:
                    System.out.print("Enter another string to concatenate: ");
                    String anotherString = scanner.nextLine();
                    String concatenatedString = userString + anotherString;
                    System.out.println("Concatenated String: " + concatenatedString);
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
/* output:-
   Enter a string: Welcome to switch-case

   Choose an operation:
   1. Convert to lowercase
   2. Convert to uppercase
   3. Search for a character
   4. Search for an index
   5. Concatenate with another string
   6. Exit
   Enter your choice (1-6): 2
   Uppercase: WELCOME TO SWITCH-CASE

   Choose an operation:
   1. Convert to lowercase
   2. Convert to uppercase
   3. Search for a character
   4. Search for an index
   5. Concatenate with another string
   6. Exit
   Enter your choice (1-6): 5
   Enter another string to concatenate: program
   Concatenated String:  Welcome to switch-caseprogram
*/    
    