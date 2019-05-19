import java.util.*;

public class GroceryCashier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = 0.00;
        int items = 0;
            System.out.println("Do you have an item to scan? (yes or no)");
            String userAnswer = scanner.next();
            userAnswer = userAnswer.toLowerCase();
            while (userAnswer.equalsIgnoreCase("yes")||userAnswer.equalsIgnoreCase("y")) {
                System.out.println("What is the price of the item?");
                double itemPrice = scanner.nextDouble();
                price = price + itemPrice;
                items = items + 1;

                System.out.println();

                System.out.print("Do you have an item to scan? (yes or no)");
                userAnswer = scanner.next();
                userAnswer = userAnswer.toLowerCase();

                System.out.println();
            }

        price = price * 100;
        price = Math.round(price);
        price = price/100;
        System.out.println("Your total is "+ price);
        System.out.println("You bought " + items + " items");
    }
}
