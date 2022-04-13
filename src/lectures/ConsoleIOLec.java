package lectures;

import java.util.Scanner;

public class ConsoleIOLec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String name = "codeup";
//        System.out.printf("Hello there, %s. Nice to see you.%n", name);

//        String greeting = "Salutations";
//        String name = "codeup";
//        System.out.printf("%s, %s!", greeting, name);
        System.out.println("Please enter a city name: ");
        String city = scanner.nextLine();
        System.out.println("Please enter a state name: ");
        String state = scanner.nextLine();
        System.out.println("How long have you lived there?");
        int years = scanner.nextInt();

        System.out.printf("%s is the best city in %s.\n I've lived here for %d years.", city, state, years);


//        scanner.next() will only return oop.characters until a whitespace or newline is encountered
//        System.out.print("Enter something: ");
//        String userInput = scanner.next();

//        scanner.nextLine() will return the entire input on the current line as a String and advance the
//        scanner to the next line
//        System.out.print("Enter something: ");
//        String userInput = scanner.nextLine();

//        System.out.println("You entered: --> \"" + userInput + "\" <--");

    }
}
