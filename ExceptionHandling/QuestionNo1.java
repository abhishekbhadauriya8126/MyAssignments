package ExceptionHandling;

import java.util.Scanner;

public class QuestionNo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the Second number");
        int num2=sc.nextInt();
        try{
            System.out.println("result: "+ num1/num2);
        }
        catch (ArithmeticException e){
            System.out.println("Denominator can not be 0");
            System.out.println("Message -> "+ e.getMessage());
        }
    }
}
