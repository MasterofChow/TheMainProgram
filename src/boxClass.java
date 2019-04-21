public class boxClass {
    public static void main(String[] args) {
        box box1 = new box();
        box1.SetWidth(1);
        box1.SetLength(2);
        box1.SetHeight(3);

        box box2 = new box();
        box2.SetLength(1);
        box2.SetWidth(1);
        box2.SetHeight(1);

        System.out.println("The area of box1: " + box1.CalculateArea(box1, box1));

        System.out.println("The volume of box1: " + box1.CalculateVolume(box1, box1, box1));

        System.out.println("The area of box2: " + box2.CalculateArea(box2, box2));

        System.out.println("The volume of box2: " + box2.CalculateVolume(box2, box2, box2));
    }
}
