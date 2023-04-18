package edu.bsu.cs222;

public class ScoreKeeper {

    public static int addUserScore(String computerPlay, String userPlay, int score){
        if (ResultDecider.winCondition(userPlay, computerPlay)) {
            score+=1;
        }
        return score;
    }

    public static int addComputerScore(String computerPlay, String userPlay, int score){
        if (ResultDecider.winCondition(computerPlay, userPlay)) {
            score+=1;
        }
        return score;
    }

    public static Boolean checkScore(int winningScore, int losingScore){
        return (winningScore == 2) && (losingScore <= 1);
    }
}
