//Max Chow
//This is where all the methods and variables are created.
//Sets different methods, including: setting the dimensions, getting the dimensions, calculating the area,
//and calculating the volume

public class box{
    //sets variables
    private int width;
    private int length;
    private int height;

    //allows for change on another variable and not the original
    public void SetWidth(int width1) {
        width = width1;
    }
    public void SetLength(int length1) {
        length = length1;
    }
    public void SetHeight(int height1) {
        height = height1;
    }

    //These class is used to print out the dimensions of each bo
    public int GetWidth() {
        return width;
    }
    public int GetLength() {
        return length;
    }
    public int GetHieght() { return height; }

    //Calculates the area of the given box
    public static double CalculateArea(box Width1, box Length1) {
        return Width1.width * Length1.length;
    }

    //Calculates the volume of the chosen box
    public static double CalculateVolume(box Width1, box Length1, box Height1) {
        return Width1.width * Length1.length * Height1.height;
    }
}
