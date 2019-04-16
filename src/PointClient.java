import com.sun.tools.javac.Main;

import java.awt.*;

public class PointClient {
    public static void main (String[] args)
    {
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();

        p1.SetX(-0);
        p1.SetY(5);
        p2.SetX(-2);
        p2.SetY(-1);
        p3.SetX(10);
        p3.SetY(-6);

        double distance = Point.distance(p1, p2);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println("The distance is "+distance);

        System.out.println(p1.isVertical(p2));
        System.out.println(p1.slope(p2));

        System.out.println(p1.manhattanDistance(p2));

        System.out.println("The point is collinear: " + p1.isCollinear(p2,p3));
    }
}
