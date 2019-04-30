//Max Chow
//A simple calculator

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        double fp1, fp2;
        String operation;

        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULATOR");

        System.out.println("Give me first number: ");
        fp1 = scanner.nextDouble();
        System.out.println("Give me a second number");
        fp2 = scanner.nextDouble();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("\nWhat operation do you want: "
                + "\n\tAddition: '+' or ADD"
                + "\n\tSubtraction: '-' or SUB"
                + "\n\tMultiplication: '*' or MULT"
                + "\n\tDivision: '/' or DIV");

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Enter your selection: ");
        operation = scanner.next();
        operation = operation.toUpperCase();
        System.out.println();

        switch (operation) {
            case "ADD":
            case "+":
                System.out.printf("The sum is %.2f", (fp1 + fp2));
                break;

            case "SUB":
            case "-":
                System.out.printf("The difference is %.2f", (fp1 - fp2));
                break;

            case "MULT":
            case "*":
                System.out.printf("The product is %.2f", (fp1*fp2));
                break;

            case "DIV":
            case "/":
                if (fp2 == 0) {
                    System.out.println("Dividing by 0 is not allowed");
                }
                else {
                    System.out.println("The quotient is " + (fp1/fp2));
                }
                break;

            default:
                System.out.println(operation + " not valid");
        }
        System.out.println("The remainder is " + (fp1/fp2));
    }
}
