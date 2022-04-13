package util;

import java.util.Scanner;

public class Input {
    //Field
    private Scanner scanner;

    //Constructor
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    //Methods
    public String getString() {
        System.out.println("Enter string");
       return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Yes or no?");
        String yn = scanner.nextLine();
        if (yn.equalsIgnoreCase("y")) {
            return true;
        } else if (yn.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter an integer between %d and %d%n", min, max);
        int input = scanner.nextInt();
        if(input > min && input < max) {
            return input;
        } else{
            getInt(min, max);
        } return input;
    }

    public int getInt() {
        System.out.println("Enter an integer");
        int input = scanner.nextInt();
        return input;
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a double between %f and %f%n", min, max);
        double input = scanner.nextDouble();
        if(input > min && input < max) {
            return input;
        } else {
            getDouble(min, max);
        } return input;
    }

    public double getDouble() {
        System.out.println("Enter a double");
        double input = scanner.nextDouble();
        return input;
    }
}
