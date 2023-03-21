package edu.bsu.cs22;

import edu.bsu.cs222.ScoreKeeper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestScoreKeeper {

    @Test
    public void testScoreGainFrom0() {
        final String userPlay = "paper";
        final String computerPlay = "rock";
        final int userScore = 0;
        Assertions.assertEquals(1, ScoreKeeper.addScore(computerPlay, userPlay, userScore));
    }

    @Test
    public void testScoreGainFrom1() {
        final String userPlay = "scissors";
        final String computerPlay = "paper";
        final int userScore = 1;
        Assertions.assertEquals(2, ScoreKeeper.addScore(computerPlay, userPlay, userScore));
    }

    @Test
    public void testScoreGainFrom2() {
        final String userPlay = "rock";
        final String computerPlay = "scissors";
        final int userScore = 2;
        Assertions.assertEquals(3, ScoreKeeper.addScore(computerPlay, userPlay, userScore));
    }

    @Test
    public void testNoScoreGainUserPlaysRock() {
        final String userPlay = "rock";
        final String computerPlay = "paper";
        final int userScore = 0;
        Assertions.assertEquals(0, ScoreKeeper.addScore(computerPlay, userPlay, userScore));
    }

    @Test
    public void testNoScoreGainUserPlaysPaper() {
        final String userPlay = "paper";
        final String computerPlay = "scissors";
        final int userScore = 0;
        Assertions.assertEquals(0, ScoreKeeper.addScore(computerPlay, userPlay, userScore));
    }

    @Test
    public void testNoScoreGainUserPlaysScissors() {
        final String userPlay = "scissors";
        final String computerPlay = "rock";
        final int userScore = 0;
        Assertions.assertEquals(0, ScoreKeeper.addScore(computerPlay, userPlay, userScore));
    }
}
