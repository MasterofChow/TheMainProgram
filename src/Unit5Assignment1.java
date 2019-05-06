import java.util.*;
import java.io.*;

public class Unit5Assignment1 {
    public static void main(String[] args) {
        File inputFile = new File("C:\\Users\\maxch\\IdeaProjects\\TheMainProgram\\src\\Unit5Assignment1");
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double tempSum;
        int count = 0;

        while (scanner.hasNextInt()) {
            tempSum = scanner.nextInt();
            sum = sum + tempSum;
            count++;
        }

        double average = sum/count;
        System.out.print(sum);
    }
}
