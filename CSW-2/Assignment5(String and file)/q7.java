import java.util.*;
public class q7 {
    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String originalSentence = sc.nextLine();
	        System.out.print("Enter the word to search for: ");
	        String searchWord = sc.nextLine();
	        System.out.print("Enter the word to replace with: ");
	        String replaceWord = sc.nextLine();
	        int index = originalSentence.indexOf(searchWord);
	        if (index != -1) {
	          String modifiedSentence = originalSentence.substring(0, index) +  replaceWord + 
	                                      originalSentence.substring(index + searchWord.length());
	          System.out.println("Original Sentence: " + originalSentence);
	          System.out.println("Modified Sentence: " + modifiedSentence);
	        } else {
	            System.out.println("The word '" + searchWord + "' was not found in the sentence.");
	        }
	        sc.close();
	}
}
/* output:-
   Enter a sentence: This is the program of string in csw
   Enter the word to search for: csw
   Enter the word to replace with: ad 
   Original Sentence: This is the program of string in csw
   Modified Sentence: This is the program of string in ad
*/