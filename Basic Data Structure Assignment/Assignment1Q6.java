import java.util.*;
class Login{
    String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass) {
        String res="";
        int count=0;

        if (userId.equals(user) && password.equals(pass)) {
            res = "Welcome Ajay";
        } else if (userId.equals(user) && !password.equals(pass) || password.equals(pass) && !userId.equals(user) || !userId.equals(user) && !password.equals(pass)) {
            res = "You have entered wrong credentials ,please enter the right credentials.";
            count = count+1;
        }
        return res;
    }

}
public class Assignment1Q6 {
    public static void main(String[] args) {
        Login login = new Login();
        Scanner sc = new Scanner(System.in);

        int count = 0;
        boolean f=true;

        while (f==true)
        {
            if (count == 3)
            {
                System.out.println("You have entered wrong credentials 3 times");
                System.out.println("Contact Admin");
                f=false;
            }
            else
            {
                System.out.println("Enter the user id");
                String userId = sc.nextLine();
                System.out.println("Enter the password");
                String pass = sc.nextLine();

                String output = login.loginUser(userId, pass);

                if (output.equals("Welcome Ajay"))
                {
                    System.out.println(output);
                    break;
                } else
                {
                    count += 1;
                    if(count !=3) {
                        System.out.println(output);
                    }
                }

        }
    }



    }
}