import java.util.PriorityQueue;
public class q11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 8, 7, 3, 4, 6, 5, 9};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.offer(num); 
        }
        System.out.println("Elements dequeued from the min-heap in sorted order:");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll()); 
        }
    }
}
/* output:-
   Elements dequeued from the min-heap in sorted order:
   1
   2
   3
   4
   5
   6
   7
   8
   9
   10
*/