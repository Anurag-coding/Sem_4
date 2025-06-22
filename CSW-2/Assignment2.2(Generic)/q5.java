import java.util.*;
class Book{
	 private String id,name,author;
	 private int quantity;
	 public Book(String id, String name, String author, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", quantity=" + quantity + "]";
	}
}
public class q5 {
	public static void main(String[] args) {
		Book b1 = new Book("a001","abc","qwe",26);
		Book b2 = new Book("a002","def","qwe",34);
		Book b3 = new Book("a003","xyz","qwe",12);
		HashMap<Integer,Book> obj = new HashMap <>();
		obj.put(1,b1);
		obj.put(2,b2);
		obj.put(3,b3);
		System.out.println(obj);
		Book x = (Book)obj.get(2);
		if(x.getName()==b2.getName())
			System.out.println("found : "+x);
		else
			System.out.println("not found");
		obj.remove(3);
		System.out.println(obj);
	}
}
/* output:-
   {1=Book [id=a001, name=abc, author=qwe, quantity=26], 2=Book [id=a002, name=def, author=qwe, quantity=34], 3=Book [id=a003, name=xyz, author=qwe, quantity=12]}
   found : Book [id=a002, name=def, author=qwe, quantity=34]
   {1=Book [id=a001, name=abc, author=qwe, quantity=26], 2=Book [id=a002, name=def, author=qwe, quantity=34]}
*/