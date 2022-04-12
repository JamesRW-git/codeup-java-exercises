package warmups;

import java.util.Scanner;

public class Warmup {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you live in Dallas? (y/n)");

        String userLivesInDallas = scanner.next();
        boolean livesInCity;

        if (userLivesInDallas.equalsIgnoreCase("y")) {
            livesInCity = true;
        } else {
            livesInCity = false;
        }

        System.out.println("Do you have transportation? (y/n)");

        String userHasTransport = scanner.next();
        boolean hasTransportation;

        if (userHasTransport.equalsIgnoreCase("y")) {
            hasTransportation = true;
        } else {
            hasTransportation = false;
        }

        boolean canComeInPerson = livesInCity && hasTransportation;

        if (canComeInPerson) {
            System.out.println("Yay, you can come to the potluck!");
        } else {
            System.out.println("Sorry, you're out of (pot)luck");
        }
    }
}
