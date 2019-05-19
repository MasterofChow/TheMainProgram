//Max Chow

import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String check = "yes";
        double price = 0.00;
        int items = 0;
        do {
            System.out.println("What is the price of the item?");
            Double itemPrice = scanner.nextDouble();
            price = price + itemPrice;
            items = items + 1;

            System.out.println("Do you have another item? (yes or no)");
            check = scanner.next();
            check = check.toLowerCase();

            if (check == "yes" || check == "y") {
                check = "yes";
            }
            else if (check == "no"){
                check = "no";
            }

        } while(check.equalsIgnoreCase("yes"));

        price = price * 100;
        price = Math.round(price);
        price = price/100;
        System.out.println("You purchased " + items + " and the total is $" + price);
    }
}
