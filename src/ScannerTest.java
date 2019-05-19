//Max Chow
//This program scans the username and displays your name is [user name].

import java.util.*;

public class ScannerTest {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scanner.nextLine();
        System.out.println("Your name is " + userName);

    }

}
