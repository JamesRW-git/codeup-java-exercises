import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        boolean gameOverMan = true;
        int randomNum = generateRandomNumber();
        int userGuess = guessANumber();
        do {
            if (randomNum == userGuess) {
                System.out.println("GOOD GUESS!");
                gameOverMan = false;
            } else if (randomNum < userGuess) {
                System.out.println("LOWER");
                userGuess = guessANumber();
            } else if (randomNum > userGuess) {
                System.out.println("HIGHER");
                userGuess = guessANumber();
            }
        } while (gameOverMan);
    }

    public static int generateRandomNumber() {
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range) + min;
        return rand;
    }

    public static int guessANumber() {
        boolean validateGuess = true;
        boolean gameOverMan = true;
        Scanner scanner = new Scanner(System.in);
        int userGuess;
        System.out.println("Guess what number I'm thinking of (1-100)");
        do {
            userGuess = scanner.nextInt();
            if (userGuess > 100 || userGuess < 1) {
                System.out.println("Please input a number between 1 and 100");
            } else {
                validateGuess = false;
            }
        } while (validateGuess);
        return userGuess;
    }
}