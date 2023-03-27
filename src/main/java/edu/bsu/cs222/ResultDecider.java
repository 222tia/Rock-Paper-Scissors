package edu.bsu.cs222;

public class ResultDecider {
    public static boolean winCondition(String winningPlay, String losingPlay) {
        return (winningPlay.equals("rock") && losingPlay.equals("scissors")) ||
                (winningPlay.equals("scissors") && losingPlay.equals("paper")) ||
                (winningPlay.equals("paper") && losingPlay.equals("rock"));
    }

    public static void getRoundResult(String userPlay, String computerPlay){
        if (winCondition(computerPlay, userPlay)) {
            System.out.println("\ncomputer played " + computerPlay + ", you lose!");
        } else if (winCondition(userPlay, computerPlay)) {
            System.out.println("\ncomputer played " + computerPlay + ", you win!");
        } else {
            System.out.println("\ncomputer played " + computerPlay + ", tie!");
        }
    }

    public static void getGameResult(int userScore, int computerScore){
        if (ScoreKeeper.checkScore(userScore, computerScore)){
            System.out.println("\nGame over, you won!");
            System.exit(0);
        } else if (ScoreKeeper.checkScore(computerScore, userScore)){
            System.out.println("\nGame over, you lost!");
            System.exit(0);
        }
    }
}
