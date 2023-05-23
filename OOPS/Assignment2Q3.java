package OOPS;
import  java.util.*;

class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
        int sum=totalDeposits+creditLimit;
        return  sum;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
        int sum=totalDeposits+fixedDepositAmount;
        return sum;
    }
}
public class Assignment2Q3 {
    public int totalCashInBank(ArrayList<Integer> cash){
        int totalAmouunt=0;
        for(int totalCash:cash){
            totalAmouunt=totalAmouunt+totalCash;
        }
        return totalAmouunt;
    }
    public int getCash(){
        return 0;
    }
    public static void main(String[] args) {
        CurrentAccount c1=new CurrentAccount();
        SavingsAccount s1=new SavingsAccount();
        Assignment2Q3 assign=new Assignment2Q3();
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(c1.getCash());
        arr.add(s1.getCash());
        System.out.println("Total cash in bank: "+assign.totalCashInBank(arr));
    }
}
