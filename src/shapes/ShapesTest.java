package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Square(5);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        Measurable myShapeTwo = new Rectangle(10, 5);
        System.out.println(myShapeTwo.getArea());
        System.out.println(myShapeTwo.getPerimeter());
    }
}
