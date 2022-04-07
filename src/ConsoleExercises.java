import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;

//        Prints full floating point number
//        System.out.printf("The value of pi is approximately %f%n", pi);
//        %.2f limits the floating point number to 2 decimal places
//        System.out.format("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int userInt = scanner.nextInt();
//        Exception error if input is not an integer

//        System.out.println("Enter three words: ");

//        Takes words separated by spaces
//        String wordOne = scanner.next();
//        String wordTwo = scanner.next();
//        String wordThree = scanner.next();

//        Takes words as three separate inputs
//        String wordOne = scanner.nextLine();
//        String wordTwo = scanner.nextLine();
//        String wordThree = scanner.nextLine();

//        System.out.printf("Your words were:%n%s%n%s%n%s", wordOne, wordTwo, wordThree);

//        System.out.println("Please enter a sentence: ");

//        Will print only the first word of the sentence
//        String userSentence = scanner.next();
//        System.out.printf("%s", userSentence);

//        Will print the entire sentence
//        String userSentence = scanner.nextLine();
//        System.out.printf("%s", userSentence);

//        System.out.println("What is the length of your room (in feet)?");
//        String roomLength = scanner.nextLine();
//        int convertedRoomLength = Integer.parseInt(roomLength);
//
//        System.out.println("What is the width of your room (in feet)?");
//        String roomWidth = scanner.nextLine();
//        int convertedRoomWidth = Integer.parseInt(roomWidth);
//
//        int roomArea = convertedRoomWidth * convertedRoomLength;
//        int roomPerimeter = (convertedRoomLength * 2) + (convertedRoomWidth * 2);
//
//        System.out.printf("Your room's area is %d%nYour room's perimeter is %d%n", roomArea, roomPerimeter);

//        Bonus
        System.out.println("What is the length of your room (in feet, decimals accepted)?");
        String roomLength = scanner.nextLine();
        float convertedRoomLength = Float.parseFloat(roomLength);

        System.out.println("What is the width of your room (in feet, decimals accepted)?");
        String roomWidth = scanner.nextLine();
        float convertedRoomWidth = Float.parseFloat(roomWidth);

        System.out.println("What is the height of your room (in feet, decimals accepted)?");
        String roomHeight = scanner.nextLine();
        float convertedRoomHeight = Float.parseFloat(roomHeight);

        float roomArea = convertedRoomWidth * convertedRoomLength;
        float roomPerimeter = (convertedRoomLength * 2) + (convertedRoomWidth * 2);
        float roomVolume = convertedRoomHeight * convertedRoomWidth * convertedRoomLength;

        System.out.printf("Your room's area is %.2f square feet%nYour room's perimeter is %.2f feet%nYour room's volume is %.2f cubic feet%n", roomArea, roomPerimeter, roomVolume);

    }
}
