//Max Chow
//This program takes a char from the user and determines wether or not it can be a possible identifier
//The restrictions for an identifier are:
// 1. Contains a space
// 2. Begins with a digit
// 3. No +, -, ', or &

import java.util.*;

public class PossibleIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me an ID: ");

        String IDtest = scanner.nextLine();

        int IDLength = IDtest.length();

        if (IDLength >= 11 || IDLength < 6) {
            System.out.println("Not a possible ID");
        }
        else {
            System.out.println("A possible ID");
        }
    }
}
