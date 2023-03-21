package edu.bsu.cs222;

public class ScoreKeeper {

    public static int addScore(String computerPlay, String userPlay, int userScore){
        if (ResultDecider.winCondition(userPlay, computerPlay)) {
            userScore+=1;
        }
        return userScore;
    }
}
