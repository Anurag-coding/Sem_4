public class q2 {
    public static void main(String[] args) {
        String s="Welcome to";
        System.out.println("Original Str : "+s);
        s.concat(" programming");
        System.out.println("After using concat(): "+s);
        s=s.concat(" programming");
        System.out.println("After proper usage of concat(): "+s);

        CharSequence c="Hello World";
        System.out.println("Length : "+c.length());
        System.out.println("Character at index 8: "+c.charAt(8));
        System.out.println("Subsequence : "+c.subSequence(4,c.length()));
    }
}
/* output:-
   Original Str : Welcome to
   After using concat(): Welcome to
   After proper usage of concat(): Welcome to programming
   Length : 11
   Character at index 8: r
   Subsequence : o World
*/