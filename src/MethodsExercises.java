import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("Added stuff: " + addStuff(5,10));
        System.out.println("Subtracted Stuff: " + subtractStuff(10,5));
        System.out.println("Multiplied stuff: " + multiplyStuff(5, 20));
        System.out.println("Divided stuff: " + divideStuff(500, 100));
        System.out.println("Modulused stuff: " + modulusStuff(50, 7));
        getInteger(1,10);
        factorialize();
        customDi();

    }

    public static int addStuff(int a, int b) {
        return a+b;
    }

    public static int subtractStuff(int a, int b) {
        return a-b;
    }

    public static int multiplyStuff(int a, int b) {
        return a*b;
    }

    public static int divideStuff(int a, int b) {
        return a/b;
    }

    public static int modulusStuff(int a, int b) {
        return a%b;
    }

    public static void getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: %n", min, max);
        int userInput = scanner.nextInt();
        if (userInput < max && userInput > min) {
            System.out.printf("%d is between %d and %d%n", userInput, min, max);
        } else if (userInput > max || userInput < min) {
            getInteger(min, max);
        }
    }

    public static void factorialize() {
        boolean userContinue = true;
        do {
            Scanner scanner = new Scanner(System.in);
            Scanner scan = new Scanner(System.in);
            System.out.printf("Enter a number between 1 and 10 to factorialize: ");
            int num = scanner.nextInt();
            long fact = 1;
            for (int i = 1; i <= num; i++){
                fact = fact * i;
            }
            System.out.println("Factorial of " + num + " is: " + fact);
            System.out.println("Do you want to input another number? (y/n)");
            String userContinues = scan.nextLine();
            if (userContinues.equalsIgnoreCase("y")) {
                userContinue = true;
            } else {
                userContinue = false;
            }
        } while (userContinue);
    }

    public static void customDi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many sides your di has: ");
        int numSides = scanner.nextInt();
        System.out.println("Enter how many dice you want to roll: ");
        int numDice = scanner.nextInt();
        int min = 1;
        int range = numSides - min + 1;
        int numRolls = 0;
        for (int i = 0; i < numDice; i++) {
                numRolls++;
                int rand = (int) (Math.random() * range) + min;
                System.out.printf("Di %d Rolled a %d%n", numRolls, rand);
                if(rand == numSides) {
                    System.out.println("Critical success!");
                } else if (rand == 1) {
                    System.out.println("Critical failure!");
                }
        }
    }
    }


