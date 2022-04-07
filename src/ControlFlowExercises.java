import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 5;

        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }

        int x = 100;
        System.out.println(x);
        do {
            System.out.println(x);
            x -= 5;
        } while (x >= -10);

        long y = 2;
        do {
            System.out.println(y);
            y = (long) Math.pow(y, 2);
        } while(y <= 1000000);

        for (int anotherNumber = 100; anotherNumber >= -10 ; anotherNumber -= 5) {
            System.out.println(anotherNumber);
        }

        System.out.println("Squaring Time Again");
        for (long j = 2; j <= 1000000; j *= j) {
            System.out.println(j);
        }

        for (int j = 0; j <= 100; j++) {
//            System.out.println(j);
            if((j % 5 == 0) && (j % 3 == 0) && j != 0) {
                System.out.println(j + " FizzBuzz");
            } else if ((j % 5) == 0 && j != 0){
                System.out.println(j + " Buzz");
            } else if ((j % 3) == 0 && j != 0) {
                System.out.println(j + " Fizz");
            }
        }

        boolean userContinue = true;

        do {
            System.out.println("Time for maths!");
            System.out.println("What number would you like to go up to?");
            int userChoice = scanner.nextInt();

            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            for (int j = 1; j <= userChoice; j++) {
                double userChoiceSquared = Math.pow(j, 2);
                double userChoiceCubed = Math.pow(j, 3);
                System.out.printf("%d" + "      |" + " %.0f" + "       |" + " %.0f%n", j, userChoiceSquared, userChoiceCubed);
            }

            System.out.println("Would you like to continue? (y/n)");
            String userContinues = scanner.next();
            if (userContinues.equalsIgnoreCase("y")) {
                userContinue = true;
            } else {
                userContinue = false;
                System.out.println("Goodbye! No more maths :-(");
            }
        } while (userContinue);

        boolean userContinueGrades = true;

        do {
            System.out.println("Enter a numerical grade (0-100):");
            int userGrade = scanner.nextInt();

            if (userGrade >= 88 && userGrade <= 100) {
                System.out.printf("%d is an A%n", userGrade);
            } else if (userGrade >= 80 && userGrade <= 87) {
                System.out.printf("%d is a B%n", userGrade);
            } else if (userGrade >= 67 && userGrade <= 79) {
                System.out.printf("%d is a C%n", userGrade);
            } else if (userGrade >= 60 && userGrade <= 66) {
                System.out.printf("%d is a D%n", userGrade);
            } else if (userGrade >= 1 && userGrade <= 59) {
                System.out.printf("%d is a F%n", userGrade);
            } else if (userGrade == 0) {
                System.out.printf("%d...you forgot to turn it in, didn't you?%n", userGrade);
            }

            System.out.println("Would you like to continue? (y/n)");
            String userContinues = scanner.next();
            if (userContinues.equalsIgnoreCase("y")) {
                userContinueGrades = true;
            } else {
                userContinueGrades = false;
            }

        } while (userContinueGrades);
    }
}
