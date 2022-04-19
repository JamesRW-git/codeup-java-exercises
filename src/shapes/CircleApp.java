package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        double radius = input.getDouble("Enter your circle's radius");
        Circle myCircle  = new Circle(radius);
        System.out.println(myCircle.getArea());
        System.out.println(myCircle.getCircumference());
    }
}
