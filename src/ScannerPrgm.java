import java.util.*;

public class ScannerPrgm {
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);
        System.out.println("Type a low number: ");
        int low = userScanner.nextInt();
        System.out.println("Type a high number: ");
        int high = userScanner.nextInt();
        int sum = 0;
        for (int i = low; i <= high; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
