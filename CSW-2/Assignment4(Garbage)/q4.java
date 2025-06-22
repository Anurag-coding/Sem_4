class AnonymousObject {
    private String name;
    public AnonymousObject(String name) {
        this.name = name;
        System.out.println("Object "+name+" created.");
    }
    @Override
    protected void finalize() {
        System.out.println("Garbage Collected: " + name);
    }
}
public class q4{
    public static void main(String[] args) {
    	new AnonymousObject("Temp");
        System.gc();
    }
}
/* output:-
   Object Temp created.
   Garbage Collected: Temp
*/