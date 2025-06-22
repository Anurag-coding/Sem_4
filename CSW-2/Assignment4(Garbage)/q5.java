class MyClass {
	private int intValue;
    private double doubleValue;
    public MyClass(int intValue, double doubleValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
    }
    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }
    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }
    public void updateValues(int intValue, double doubleValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
    }
    public void display() {
        System.out.println("Integer Value: " + intValue + ", Double Value: " + doubleValue);
    }
}
public class q5 {
	public static void main(String[] args) {
		 Runtime runtime = Runtime.getRuntime();
		 MyClass obj1 = new MyClass(10, 20.5);
		 MyClass obj2 = new MyClass(30, 40.7);
		 obj1.updateValues(15, 25.5);
		 obj2.setIntValue(35);
		 obj1.display();
		 obj2.display();
		 System.out.println("\nMemory after object creation:");
		 System.out.println("Total Memory: " + runtime.totalMemory());
		 System.out.println("Free Memory: " + runtime.freeMemory());
		 obj1 = null;
		 obj2 = null;
		 System.gc();
		 System.out.println("\nMemory after GC:");
		 System.out.println("Total Memory: " + runtime.totalMemory());
		 System.out.println("Free Memory: " + runtime.freeMemory());
    }
}
/* output:-
   Integer Value: 15, Double Value: 25.5
   Integer Value: 35, Double Value: 40.7

   Memory after object creation:
   Total Memory: 260046848
   Free Memory: 256101896

   Memory after GC:
   Total Memory: 14680064
   Free Memory: 13067856
*/