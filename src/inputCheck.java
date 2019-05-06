import java.util.*;

public class inputCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email;
        do{
            System.out.print("Please enter your email --> ");
            email = scan.next();
        } while (email.indexOf("@") < 0);

    }
}
