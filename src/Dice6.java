//Max Chow
//This program takes a char from the user and determines wether or not it can be a possible identifier
//The restrictions for an identifier are:
// 1. Contains a space
// 2. Begins with a digit
// 3. No +, -, ', or &

import java.util.*;

public class Dice6 {
    public static void main(String[] args) {
        Random random = new Random();

        int diceNumber = random.nextInt(6)+1;

        switch(diceNumber) {
            case 1:
                System.out.println("-----");
                System.out.println("|   |");
                System.out.println("| * |");
                System.out.println("|   |");
                System.out.println("-----");
                break;

            case 2:
                System.out.println("-----");
                System.out.println("|  *|");
                System.out.println("|   |");
                System.out.println("|*  |");
                System.out.println("-----");
                break;

            case 3:
                System.out.println("-----");
                System.out.println("|  *|");
                System.out.println("| * |");
                System.out.println("|*  |");
                System.out.println("-----");
                break;

            case 4:
                System.out.println("-----");
                System.out.println("|* *|");
                System.out.println("|   |");
                System.out.println("|* *|");
                System.out.println("-----");
                break;

            case 5:
                System.out.println("-----");
                System.out.println("|* *|");
                System.out.println("| * |");
                System.out.println("|* *|");
                System.out.println("-----");

            case 6:
                System.out.println("-----");
                System.out.println("|* *|");
                System.out.println("|* *|");
                System.out.println("|* *|");
                System.out.println("-----");
                break;

        }
    }
}
