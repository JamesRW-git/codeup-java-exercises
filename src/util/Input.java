package util;

import java.util.Scanner;

public class Input {
    //Field
    private static Scanner scanner;

    //Constructor
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    //Methods
    public static String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public static boolean yesNo(String prompt) {
        String yn = scanner.next();
        if (yn.equalsIgnoreCase("y") || yn.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public static int getInt(int min, int max) {
        System.out.println("Enter an integer between " + min + " and " + max);
        int userInput = scanner.nextInt();
        if(userInput < min || userInput > max) {
            return getInt(min, max);
        } else{
            return userInput;
        }
    }

    public static int getInt() {
        System.out.println("Enter an integer");
        int input = scanner.nextInt();
        return input;
    }

    public static double getDouble(double min, double max) {
        System.out.printf("Enter a double between %f and %f%n", min, max);
        double input = scanner.nextDouble();
        if(input < min || input > max) {
            return getDouble(min, max);
        } else {
            return input;
        }
    }

    public static double getDouble() {
        System.out.println("Enter a double");
        double input = scanner.nextDouble();
        return input;
    }
}
