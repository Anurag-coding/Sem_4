class CustomCheckedException extends Exception {
    public CustomCheckedException(String msg) {
        super(msg);
    }
}
public class q8 {
    public static void checkAdmitCard(boolean hasAdmitCard) throws CustomCheckedException {
        if (!hasAdmitCard) {
            throw new CustomCheckedException("Admit card is missing");
        }
    }
    public static void main(String[] args) {
        boolean hasAdmitCard=false;
        try{
            checkAdmitCard(hasAdmitCard);
            System.out.println("Kid has taken Admit Card");
        }
        catch(CustomCheckedException e){
            System.out.println(e);
        }
    }
}
/* output:-
   CustomCheckedException: Admit card is missing
*/