//Max Chow
//Asks the user for a name and searches the file[:Names] for the requested word
//After the name it prints the numbers following from 1900 to 2000s

import java.util.*;
import java.io.*;

public class Java5TestA {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("C:\\Users\\maxch\\IdeaProjects\\TheMainProgram\\src\\Names");
        Scanner input = new Scanner(inputFile);
        Scanner userInput = new Scanner(System.in);

        System.out.print("What name are you looking for? ");
        String userName = userInput.next();

        while (input.hasNextLine()) {
            String nextName = input.nextLine();
            Scanner line = new Scanner(nextName);
            String words = line.nextLine();
            int space = words.indexOf(" ");
            String nameName = words.substring(0, space);
            String numbers = words.substring(space);

            if (userName.equals(nameName)) {
                System.out.print(nameName + " " + numbers);
                break;
            }
            else {
            }
        }
    }
}
