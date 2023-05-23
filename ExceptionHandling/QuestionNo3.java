package ExceptionHandling;

import java.util.Scanner;

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String res){
        super(res);
    }

}
class IllegalBankTransactionException extends Exception{
    public IllegalBankTransactionException(String res){
        super(res);
    }

}

class SavingAccount{
    private long id;
    private double balance;

    public SavingAccount(long id,double balance){
        this.id=id;
        this.balance=balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public  double withdraw(double amount) throws InsufficientBalanceException,IllegalBankTransactionException{
        if(amount<0){
            throw new IllegalBankTransactionException("Amount cant not be negative");
        }
        else  if(balance==0 || amount>balance){
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        else {
            balance=balance-amount;
            return  balance;
        }
    }
    public  double deposite(double amount){
        balance=balance-amount;
        return  balance;
    }
}
public class QuestionNo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id");
        long id=sc.nextLong();
        System.out.println("Enter the balance");
        double balance=sc.nextDouble();
        SavingAccount sa=new SavingAccount(id,balance);
        while(true){
            System.out.println("Choose the option");
            System.out.println("1 Deposit Money");
            System.out.println("2 Withdraw Money");
            System.out.println("3 Exit");
            int choice=sc.nextInt();
            if (choice==1){
                System.out.println("Enter the amount");
                balance=sa.deposite(sc.nextDouble());
                System.out.println("Added Successfully "+ balance);
            }
            else  if(choice==2){
                try{
                    System.out.println("Enter the amount");
                    balance=sa.withdraw(sc.nextDouble());
                }
                catch (IllegalBankTransactionException | InsufficientBalanceException ex){
                    System.out.println(ex.getMessage());
                }
            }
            else {
                System.out.println("Have a nice day");
                break;
            }
        }
    }
}
