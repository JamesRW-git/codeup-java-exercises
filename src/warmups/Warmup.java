package warmups;

import util.Input;

import java.util.Scanner;

public class Warmup {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Do you live in Dallas? (y/n)");
//
//        String userLivesInDallas = scanner.next();
//        boolean livesInCity;
//
//        if (userLivesInDallas.equalsIgnoreCase("y")) {
//            livesInCity = true;
//        } else {
//            livesInCity = false;
//        }
//
//        System.out.println("Do you have transportation? (y/n)");
//
//        String userHasTransport = scanner.next();
//        boolean hasTransportation;
//
//        if (userHasTransport.equalsIgnoreCase("y")) {
//            hasTransportation = true;
//        } else {
//            hasTransportation = false;
//        }
//
//        boolean canComeInPerson = livesInCity && hasTransportation;
//
//        if (canComeInPerson) {
//            System.out.println("Yay, you can come to the potluck!");
//        } else {
//            System.out.println("Sorry, you're out of (pot)luck");
//        }

        boolean userContinue = true;
        do {
            String checkPalindrome = Input.getString("Enter a string to check if it is a palindrome: ");
            System.out.println("Is " + checkPalindrome + " a palindrome? It's " + isPalindrome(checkPalindrome));

            String userChoice = Input.getString("Would you like to check another word? (y/n)");
            if (userChoice.equalsIgnoreCase("y")) {
                userContinue = true;
            } else {
                userContinue = false;
            }
        } while (userContinue);
    }

    public static boolean isPalindrome(String word) {
        String reversed = "";
        char character;
        boolean palindrome;
        for (int i = 0; i < word.length(); i++) {
            character = word.charAt(i);
            reversed = character + reversed;
        }
        if (word.equalsIgnoreCase(reversed)) {
            palindrome = true;
        } else {
            palindrome = false;
        }
        return palindrome;
    }
}
