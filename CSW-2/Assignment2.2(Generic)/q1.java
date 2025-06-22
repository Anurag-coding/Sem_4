class Pair<K, V> {
    private K key;
    private V value;
    public Pair(K key, V value) {
         this.key = key;
         this.value = value;
     }
    public K getKey() {
         return key;
     }
    public void setKey(K key) {
         this.key = key;
     }
    public V getValue() {
         return value;
     }
    public void setValue(V value) {
         this.value = value;
     }
    public void display() {
         System.out.println("Key: " + key + ", Value: " + value);
    }
    public class q1 {
         public static void main(String[] args) {
             Pair<String, Integer> pair1 = new Pair<>("Apple", 100);
             Pair<Integer, String> pair2 = new Pair<>(1, "First");
             Pair<Double, String> pair3 = new Pair<>(3.14, "Pi");
             pair1.display();
             pair2.display();
             pair3.display();
             pair1.setKey("Banana");
             pair1.setValue(200);
             pair1.display();
             pair2.setKey(2);
             pair2.setValue("Second");
             pair2.display();
         }
     }
}
/* output:-
   Key: Apple, Value: 100
   Key: 1, Value: First
   Key: 3.14, Value: Pi
   Key: Banana, Value: 200
   Key: 2, Value: Second
*/

 
 