//Max Chow
//This is where all the methods and dimensions are defined from the box class
//Prints out the dimensions, area, and volume of both box1 and box2

public class boxClass {
    public static void main(String[] args) {
        //sets the dimensions of box1
        box box1 = new box();
        box1.SetWidth(2);
        box1.SetLength(4);
        box1.SetHeight(-3);

        //prints out the dimensions of box1
        System.out.println("The dimensions of box1[width:" + box1.GetWidth() + " length:" +
                box1.GetLength() + " height:" + box1.GetHieght());

        //sets the dimensions of box2
        box box2 = new box();
        box2.SetLength(1);
        box2.SetWidth(1);
        box2.SetHeight(1);

        //prints out the dimensions of box2
        System.out.println("The dimensions of box2[width:" + box2.GetWidth() + " length:" +
                box2.GetLength() + " height:" + box2.GetHieght());

        //prints out the area and volume, respectively, of box1
        System.out.println("The area of box1: " + box1.CalculateArea(box1, box1));
        System.out.println("The volume of box1: " + box1.CalculateVolume(box1, box1, box1));

        //prints out the area and volume, respectively, of box2
        System.out.println("The area of box2: " + box2.CalculateArea(box2, box2));
        System.out.println("The volume of box2: " + box2.CalculateVolume(box2, box2, box2));
    }
}
