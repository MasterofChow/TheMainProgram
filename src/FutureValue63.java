//Max Chow
//4/16/19
//This calculates the future value of a given interests rate and investment

import java.util.*;

public class FutureValue63 {
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);
        System.out.println("How much do you want to invest?");
        double investment = userScanner.nextDouble();
        investment = Math.abs(investment);
        System.out.println();

        System.out.println("Give a decimal number: ");
        double interestRate = userScanner.nextDouble();
        interestRate = Math.abs(interestRate);
        interestRate = interestRate*100;
        System.out.println();

        double percentageYear5 = Math.pow((1 + interestRate),5);
        double futureValue5Years = investment * percentageYear5;
        futureValue5Years = Math.round(futureValue5Years);
        System.out.println("After 5 years: " + futureValue5Years);

        double percentageYear10 = Math.pow((1 + interestRate),10);
        double futureValue10Years = investment * percentageYear10;
        futureValue10Years = Math.round(futureValue10Years);
        System.out.println("After 10 years: " + futureValue10Years);

        double percentageYear20 = Math.pow((1 + interestRate),20);
        double futureValue20Years = investment * percentageYear20;
        futureValue20Years = Math.round(futureValue20Years);
        System.out.println("After 20 years: " + futureValue20Years);
    }
}
