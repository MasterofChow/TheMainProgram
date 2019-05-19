//MaxChow

import java.io.*;
import java.util.*;

public class ReadingFile {
    public static void main(String[] args) throws IOException
    {
        File fileinput = new File("C:\\Users\\maxch\\IdeaProjects\\TheMainProgram\\src\\input");
        Scanner input = new Scanner(fileinput);
        int count = 0;
        while (input.hasNextLine())
        {
            String lines = input.nextLine();
            Scanner line = new Scanner(lines);
            System.out.println(lines);
            while (input.hasNext()) {
                if (line.hasNextInt()) {
                    int integer = line.nextInt();
                    System.out.println(integer);
                    count++;
                } else {
                    String integer = line.next();
                }
            }
        }
        System.out.println("There are " + count + " number");
    }
}
