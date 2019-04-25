import java.util.*;

public class SecretNumber {
    public static void main(String[] args) {
//        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        double randomNumber = Math.random()*1000;

        randomNumber = Math.round(randomNumber);

        randomNumber = randomNumber/100;

        for (int i = 1; i <= 5; i++) {
            System.out.println();
            System.out.println("Guess a number between 1.0 - 99.9.");
            System.out.print(i + " Guess: ");
            double userGuess = scanner.nextDouble();

            if (userGuess > 99.9 || userGuess < 1.0) {
                System.err.println("Guess Out of Bounds");
            }
            else if (Math.abs(userGuess-randomNumber) < .1) {
                System.out.println("Your a genius: CORRECT!");
            }
            else if (userGuess > randomNumber) {
                System.out.println("Too high");
            }
            else {
                System.out.println("Too low");
            }
        }

        System.out.println("The secret number is " + randomNumber);
    }
}