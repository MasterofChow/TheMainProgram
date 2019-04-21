//Max Chow
//This program seperates the first letter of the month
//the entire date in lowercase
//and the year

import java.util.*;

public class DateTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a date (in this format month dd, yyyy) > ");
        String date = scan.nextLine();

        //Completes the first task of printing the first letter of the month
        String firstLetter = date.substring(0,1);
        System.out.println(firstLetter);

        //Completes the second task of making the date all lowercase letters
        date = date.toLowerCase();
        System.out.println(date);

        //Completes the third task of finding the year
        int findComma = date.indexOf(",");
        String year = date.substring(findComma + 2);
        System.out.println(year);
    }
}
