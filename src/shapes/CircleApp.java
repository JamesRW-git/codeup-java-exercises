package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Enter your circle's radius");
        double radius = input.getDouble();
        Circle myCircle  = new Circle(radius);
        System.out.println(myCircle.getArea());
        System.out.println(myCircle.getCircumference());
    }
}
