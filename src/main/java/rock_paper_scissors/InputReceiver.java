package rock_paper_scissors;

import java.util.Scanner;

public class InputReceiver {
    public static String getUserPlay() {
        Scanner userPlayScanner = new Scanner(System.in);
        String userPlay = userPlayScanner.nextLine().toLowerCase();

        if (!userPlay.matches("rock|paper|scissors")) {
            System.err.println("invalid input (check spelling)");
        }
        return userPlay;
    }

    public static String getModeSelection() {
        Scanner selectionScanner = new Scanner(System.in);
        String mode = selectionScanner.nextLine().toLowerCase();

        if (!mode.matches("[ab]")) {
            System.err.println("invalid input (check spelling)");
        }
        return mode;
    }
}
