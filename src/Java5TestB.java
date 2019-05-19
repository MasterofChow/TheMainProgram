//Max Chow
//Prints the name and averages the numbers following

import java.io.*;
import java.util.*;

public class Java5TestB {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("C:\\Users\\maxch\\IdeaProjects\\TheMainProgram\\src\\Names");
        Scanner input = new Scanner(inputFile);



        while (input.hasNextLine()) {
            int amountOfNumbers = 0;
            int addedTotal = 0;

            String nextName = input.nextLine();
            Scanner line = new Scanner(nextName);

            String words = line.nextLine();
            int space = words.indexOf(" ");
            String nameName = words.substring(0, space);

            while (input.hasNext()) {
                if (line.hasNextInt()) {
                    int integer = line.nextInt();
                    addedTotal = addedTotal + integer;
                    amountOfNumbers++;
                } else {
                    String integer = line.next();
                }
            }
            int average = addedTotal/amountOfNumbers;
            System.out.println("The average amount of babies named "+ nameName + " is " + average);
        }
    }
}
