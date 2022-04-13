package shapes;

public class Rectangle {
    //Properties
    protected double length;
    protected double width;

    //Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {

    }

    //Getters and Setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //Methods
    public double getPerimeter() {
        double perimeter = (this.length * 2) + (this.width *2);
        return perimeter;
    }

    public double getArea() {
        double area = this.length * this.width;
        return area;
    }
}
