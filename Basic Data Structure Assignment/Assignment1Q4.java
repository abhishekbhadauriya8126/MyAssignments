import java.util.Scanner;

class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
        String res="";

        if(subject1Marks > 60 && subject2Marks > 60 && subject3Marks > 60){
            res += "Passed";
        }
        else if(subject1Marks >60 && subject2Marks>60 || subject1Marks>60 && subject3Marks > 60 || subject2Marks >60 && subject3Marks>60){
            res += "Pramoted";
        }
        else if(subject1Marks>60 && subject2Marks<60 &&subject3Marks<60 || subject2Marks>60 && subject1Marks<60 && subject3Marks<60 || subject3Marks>60 &&subject2Marks<60 &&subject1Marks<60) {
            res +="fail";
        }
        return  res;
    }
    }
public class Assignment1Q4 {
    public static void main(String[] args) {

        ResultDeclaration rd = new ResultDeclaration();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the subject 1 marks");
        int s1=sc.nextInt();
        System.out.println("Enter the subject 2 marks");
        int s2=sc.nextInt();
        System.out.println("Enter the subject 3 marks");
        int s3=sc.nextInt();

        System.out.println(rd.declareResults(s1,s2,s3));

    }
}
