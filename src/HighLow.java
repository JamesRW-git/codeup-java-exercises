import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        boolean gameOverMan = true;
        int randomNum = generateRandomNumber();
        int userGuess = guessANumber();
        int numGuesses = 1;
        int guessLimit = 9;
        do {
            if (randomNum == userGuess) {
                System.out.println("GOOD GUESS!");
                System.out.printf("You made %d guesses!", numGuesses);
                gameOverMan = false;
            } else if (randomNum < userGuess && numGuesses < 10) {
                System.out.println("LOWER");
                System.out.printf("You have made %d guesses%n", numGuesses);
                System.out.printf("You have %d guesses remaining%n", guessLimit);
                guessLimit--;
                numGuesses++;
                userGuess = guessANumber();
            } else if (randomNum > userGuess && numGuesses < 10) {
                System.out.println("HIGHER");
                System.out.printf("You have made %d guesses%n", numGuesses);
                System.out.printf("You have %d guesses remaining%n", guessLimit);
                guessLimit--;
                numGuesses++;
                userGuess = guessANumber();
            } else if (randomNum != userGuess && numGuesses >= 10) {
                System.out.println("YOU ARE OUT OF GUESSES");
                gameOverMan = false;
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