//Max Chow
//This is where all the methods and variables are created.
//Sets different methods, including: setting the dimensions, getting the dimensions, calculating the area,
//and calculating the volume

public class box{
    private int width;
    private int length;
    private int height;

    public void SetWidth(int width1) {
        width = width1;
    }

    public void SetLength(int length1) {
        length = length1;
    }

    public void SetHeight(int height1) {
        height = height1;
    }

    public int GetWidth() {
        return width;
    }

    public int GetLength() {
        return length;
    }

    public int GetHieght() { return height; }

    public void setDimensions(int width1, int length1, int height1) {
        width = width1;
        length = length1;
        height = height1;
    }


    public static double CalculateArea(box Width1, box Length1) {
        return Width1.width * Length1.length;
    }

    public static double CalculateVolume(box Width1, box Length1, box Height1) {
        return Width1.width * Length1.length * Height1.height;
    }
}
