package shapes;

public class Square extends Rectangle{

    public Square(double side) {
        super(side, side);
//        super();
//        this.length = side;
//        this.width = side;
    }

    @Override
    public double getPerimeter() {
        double perimeter = this.length * 4;
        return perimeter;
    }

    public double getArea() {
        double area = Math.pow(this.length, 2);
        return area;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
