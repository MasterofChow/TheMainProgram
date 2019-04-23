import java.util.*;

public class SmallestNumber {
    public static void FindingSmallest() {
        double number1;
        double number2;
        double number3;
        double smallestNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number: ");
        number1 = scanner.nextDouble();
        System.out.println("Give me a number: ");
        number2 = scanner.nextDouble();
        System.out.println("Give me a number: ");
        number3 = scanner.nextDouble();

        if (number1 < number2) {
            smallestNumber = number1;
        }
        else {
            smallestNumber = number2;
        }

        if (number3 < smallestNumber) {
            smallestNumber = number3
        }
        System.out.println("The smallest number is " + smallestNumber);
    }
}
