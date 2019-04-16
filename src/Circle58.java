//Max Chow
//4/16/19
//This program calculates the area and circumference of a circle from the given radius

import java.util.*;

public class Circle58 {
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);
        System.out.println("Give me a number: ");
        double r = userScanner.nextDouble();
        System.out.println();

        double area = Math.PI * Math.pow(r,2);
        area = area*1000;
        area = Math.round(area);
        area = area/1000;
        System.out.println("The area of the circle: "+area);
        System.out.println();

        double circumference = 2 * Math.PI * r;
        circumference = circumference*1000;
        circumference = Math.round(circumference);
        circumference = circumference/1000;
        System.out.println("The circumference of the circle: " +circumference);
    }
}
