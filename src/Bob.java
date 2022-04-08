import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bobiverse69 has entered the chat!");
        boolean keepTalking = true;
        do {
            System.out.println("Go ahead and say something. Bob has video games to play.");

            String userBobInteraction = scanner.nextLine();

            if (userBobInteraction.endsWith("?")) {
                System.out.println("Bobiverse69: Sure.");
            } else if (userBobInteraction.endsWith("!")) {
                System.out.println("Bobiverse69: Whoa, chill out!");
            } else if (userBobInteraction.isEmpty()) {
                System.out.println("Bobiverse69: Fine. Be that way. Can I go now?");
            } else {
                System.out.println("Whatever. Can I go now?");
            }

            System.out.println("Would you like to continue speaking with Bob? (y/n)");
            String userContinue = scanner.nextLine();
            if (userContinue.equalsIgnoreCase("y")) {
                keepTalking = true;
            } else {
                keepTalking = false;
            }

        } while (keepTalking);
    }
}
