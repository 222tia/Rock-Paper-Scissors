package edu.bsu.cs222;

public class ResultDecider {
    public static boolean winCondition(String winningPlay, String losingPlay) {
        return (winningPlay.equals("rock") && losingPlay.equals("scissors")) ||
                (winningPlay.equals("scissors") && losingPlay.equals("paper")) ||
                (winningPlay.equals("paper") && losingPlay.equals("rock"));
    }

}
