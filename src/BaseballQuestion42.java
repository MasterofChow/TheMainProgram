//Max Chow
//This program takes two numbers:
// 1. the number of hits
// 2. the number of total swings
//And then calculates and compares the percentage to .300
//To see if the batter is eligibal to play in the All Stars Game

import java.util.*;

public class BaseballQuestion42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many balls did the hitter hit?");
        double NumberHits = scanner.nextDouble();

        System.out.println();

        System.out.println("How many times did the hitter swing?");
        double totalBalls = scanner.nextDouble();

        System.out.println();

        if (NumberHits <= totalBalls) {
            double percentage = NumberHits/totalBalls;
            if (percentage > .300) {
                System.out.println("The hitter is eligible for the All Stars Game");
            }
            else {
                System.out.println("The hitter is not eligible for the All Stars Game");
            }
        }
        else {
            System.out.println("The amount of balls exceeds the amount of swings");
        }
    }
}
