import java.util.*;
public class q8 {
	public static void main(String[] args) {
        String str1 = "listen",str2 = "silent";
        boolean result = areAnagrams(str1, str2);
        if (result) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) - 1);
                if (charCountMap.get(c) == 0)
                    charCountMap.remove(c);
            }else
                return false;
        }
        return charCountMap.isEmpty();
    }
}
/* output:-
   listen and silent are anagrams.
*/