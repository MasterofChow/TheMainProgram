//Max Chow
//4/16/19
//Creates a Gangsta name

import java.util.*;

public class GangstaName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");

        String userName = scanner.nextLine();
        String firstInitial = userName.substring(0,1);
        firstInitial = firstInitial.toUpperCase();

        int space = userName.indexOf(" ");

        String firstName = userName.substring(0,space);

        String lastName = userName.substring(space);
        lastName = lastName.toUpperCase();

        System.out.print(firstInitial + ". ");
        System.out.print("Diddy " + lastName + " ");
        System.out.print(firstName + "-izzle");
    }
}
