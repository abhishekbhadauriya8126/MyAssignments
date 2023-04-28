import java.util.Scanner;

class TaxAmount{
    public double calculateTaxAmount(int ctc){
        double res=0.0;
        if (ctc <= 180000) {
            res = 0.0;
        } else if (ctc > 180000 && ctc <= 300000) {
            res = 0.1 * (ctc - 180000);
        } else if (ctc > 300000 && ctc <= 500000) {
            res = 0.1 * (300000 - 180000) + 0.2 * (ctc - 300000);
        } else if (ctc > 500000 && ctc <= 1000000) {
            res = 0.1 * (300000 - 180000) + 0.2 * (500000 - 300000) + 0.3 * (ctc - 500000);
        }

        return res;
    }
}
public class Assignment1Q5 {
    public static void main(String args[]) {
        TaxAmount ta=new TaxAmount();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ctc");
        int n=sc.nextInt();
        System.out.println(ta.calculateTaxAmount(n));
    }
}