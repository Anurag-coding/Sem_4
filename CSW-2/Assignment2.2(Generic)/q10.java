import java.util.HashMap;
public class q10 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 1, 2, 8, 10, 4};
        int missingNumber = findSmallestMissingNumber(numbers);
        System.out.println("The smallest missing positive number is: " + missingNumber);
    }
     public static int findSmallestMissingNumber(int[] numbers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : numbers) {
            map.put(num, 1);
        }
        for (int i = 1; i <= 10; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        return 11;
    }
}
/* output:- 
   The smallest missing positive number is: 6
*/