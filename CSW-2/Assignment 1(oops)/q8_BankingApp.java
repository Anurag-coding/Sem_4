abstract class Account{
    private long accountNumber;
    private double balance;
    abstract void deposit(double amt);
    abstract void withdrawal(double amt);

    Account(long accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    double getBalance(){
        return balance;
    }
    long getAccountNum(){
        return accountNumber;
    }
    void setBalance(double balance){
        this.balance=balance;
    }
}
class SavingsAccount extends Account{
    float interestRate;
    SavingsAccount(long accountNumber,double balance,float interestRate){
        super(accountNumber,balance);
        this.interestRate=interestRate;
    }
    void deposit(double amt){
        double nd=getBalance()+amt+ ((amt*interestRate)/100);
        setBalance(nd);
        System.out.println("Rs "+amt+" deposited to your Ac "+getAccountNum()+". Avl Bal Rs "+nd);
    }
    void withdrawal(double amt){
        if(amt>getBalance()){
            System.out.println("Insufficient Balance");
        }else{
            setBalance(getBalance()-amt);
            System.out.println("Rs "+amt+" withdrawn from your Ac "+getAccountNum()+". Avl Bal Rs "+(getBalance()-amt));
        }
    }
}
class CurrentAccount extends Account{
   double overdraftLimit;
    CurrentAccount(long accountNumber,double balance,double overdraftLimit){
        super(accountNumber, balance);
        this.overdraftLimit=overdraftLimit;
    }
   void withdrawal(double amt){
    if(getBalance()+overdraftLimit>=amt){
        setBalance(getBalance() - amt);
        System.out.println("Rs "+amt+" withdrawn from your Ac "+getAccountNum()+" .Avl Bal Rs "+(getBalance()-amt));
    }else{
        System.out.println("Overdraft limit exceeded");
    }
   }
   void deposit(double amt){
        setBalance(getBalance() + amt);
        System.out.println("Rs "+amt+" deposited to your Ac "+getAccountNum()+".Avl Bal Rs "+(getBalance()+amt));
   }
 }
public class q8_BankingApp {
    public static void main(String[] args) {
        Account savAcc=new SavingsAccount(123456,3402,5);
        Account CurrAcc=new CurrentAccount(654321, 50000, 300);
        savAcc.deposit(20000);
        savAcc.withdrawal(500);
    }
}
/* output:-
   Rs 20000.0 deposited to your Ac 123456. Avl Bal Rs 24402.0
   Rs 500.0 withdrawn from your Ac 123456. Avl Bal Rs 23402.0
*/