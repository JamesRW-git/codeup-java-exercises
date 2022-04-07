package lectures;
import java.util.Scanner;

public class ControlStatementsLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int x = 5;
//        System.out.println(x != 5);
//
////        IF/ELSE IF/ELSE
//
//        int userAccessLevel = 0;
//
//        if(userAccessLevel == 0) {
//            System.out.println("User is Admin");
//        } else if (userAccessLevel == 1) {
//            System.out.println("User does not have Admin privileges");
//        } else {
//            System.out.println("User is a visitor");
//        }
//
////        SWITCH/DO WHILE
//
//        boolean continueRunningApp = true;
//
//        System.out.println("Welcome to The Danger Zone");
//
//        do {
//            System.out.println("--------------------------");
//            System.out.println("What would you like to do?");
//            System.out.println("1: See some stuff");
//            System.out.println("2: Do some stuff");
//            System.out.println("3: Exit");
//
//            int userResponse = scanner.nextInt();
//
//            switch (userResponse) {
//                case 1:
//                    System.out.println("You're now seeing some stuff");
//                    break;
//                case 2:
//                    System.out.println("You're now doing stuff");
//                    break;
//                case 3:
//                    System.out.println("Goodbye!");
//                    continueRunningApp = false;
//                    break;
//                default:
//                    System.out.println("That is not an option");
//                    System.out.println("Make a valid selection");
//            }
//        } while (continueRunningApp);
//
//        System.out.println("Exiting loop");

//        WHILE

//        int inTransaction = 0;
//        int walletBalance = 150;
//        int transactionAmount = 10;
//
////        inTransaction must be 0 to start
//
//        if (inTransaction == 0) {
//
////            Continue loop while wallet balance is more than five
//            while(walletBalance > 5) {
//                System.out.println("Making transaction...");
//                System.out.println("Wallet balance before transaction $" + walletBalance);
//                walletBalance -= transactionAmount;
//                System.out.println("Wallet balance after transaction $" + walletBalance);
//            }
//        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }
}
