class Book {
    int bookId;
    String bookName;
    double price;
    public Book(int bookId, String bookName, double price) {
           this.bookId = bookId;
           this.bookName = bookName;
           this.price = price;
    }
    @Override
    public String toString() {
        return("Bookid:"+bookId+" "+"Name:"+bookName+" "+"Price:"+price);
    }
    @Override
    public boolean equals(Object o) {
        Book ob=(Book)o;
        if(this.price == ob.price) 
            return true;
        else 
            return false;
   }
   public class q2{
      public static void main(String[] args) {
          Book ob1 = new Book(1,"Treasure Trove",200);
          Book ob2 = new Book(3,"The King",199);
          System.out.println("Details :\n"+ob1.toString()+"\n"+ob2.toString());
          System.out.println("Is both the price same ? "+ob1.equals(ob2));
      }
   }
}
/* output:-
   Details :
   Bookid:1 Name:Treasure Trove Price:200.0
   Bookid:3 Name:The King Price:199.0
   Is both the price same ? false
*/

