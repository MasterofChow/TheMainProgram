//Max Chow

import java.util.*;
import java.io.*;

public class shoppingScan {
    public static void main(String[] args) throws FileNotFoundException {
        File fileInput = new File("C:\\Users\\maxch\\IdeaProjects\\TheMainProgram\\src\\Shopping");
        Scanner input = new Scanner(fileInput);
        double total = 0;
        int count = 0;

        while(input.hasNextLine()) {
            String lines = input.nextLine();
            Scanner lineBreaker = new Scanner(lines);
            String product = lineBreaker.next();
            while (lineBreaker.hasNextDouble()) {
                total = total + lineBreaker.nextDouble();
                count++;
            }
            System.out.printf("The average price of %-10s is $%.2f \n",product, total/count);
        }
    }
}
