public class Point {
    private int x;
    private int y;

    public void SetX(int x1) {
        x = x1;
    }

    public void SetY(int y1) {
        y = y1;
    }

    public int GetX()
    {
        return x;
    }
    public int GetY()
    {
        return y;
    }
    public void setLocation(int x1, int y1) {
        x = x1;
        y = y1;
    }
    public String toString()
    {
        return ("Point = ("+x+","+y+").");
    }
    public static double distance(Point p1, Point p2) {
        double VarX = Math.pow(p1.x - p2.x,2);
        double VarY = Math.pow(p1.y - p2.y,2);
        return Math.round(Math.sqrt(VarX + VarY));
    }
    public boolean isVertical(Point other) {
        if (x == other.x) {
            return true;
        }
        else {
            return false;
        }
    }
    public double slope(Point other) {
        return (other.y - y)/(other.x - x);
    }
    public int manhattanDistance(Point other) {
        int absX = Math.abs(other.x - x);
        int absY = Math.abs(other.y - y);
        int totalDistance = absX + absY;
        return totalDistance;
    }
//    public boolean isCollinear(Point p1, Point p2) {
//    }

}
