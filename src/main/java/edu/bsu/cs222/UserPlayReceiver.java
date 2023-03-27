package edu.bsu.cs222;

import java.util.Scanner;

public class UserPlayReceiver {
    public static String getUserPlay() {
        Scanner userPlayScanner = new Scanner(System.in);
        String userPlay = userPlayScanner.nextLine().toLowerCase();

        if (!userPlay.matches("rock|paper|scissors")) {
            System.err.println("invalid input (check spelling)");
        }
        return userPlay;
    }
}
