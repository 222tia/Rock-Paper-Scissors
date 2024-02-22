package edu.bsu.tia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import rock_paper_scissors.ScoreKeeper;

public class TestScoreKeeper {

    @Test
    public void testUserScoreGainFrom0() {
        final String userPlay = "paper";
        final String computerPlay = "rock";
        final int userScore = 0;
        Assertions.assertEquals(1, ScoreKeeper.addUserScore(computerPlay, userPlay, userScore));
    }

    @Test
    public void testUserScoreGainFrom1() {
        final String userPlay = "scissors";
        final String computerPlay = "paper";
        final int userScore = 1;
        Assertions.assertEquals(2, ScoreKeeper.addUserScore(computerPlay, userPlay, userScore));
    }

    @Test
    public void testUserScoreGainFrom2() {
        final String userPlay = "rock";
        final String computerPlay = "scissors";
        final int userScore = 2;
        Assertions.assertEquals(3, ScoreKeeper.addUserScore(computerPlay, userPlay, userScore));
    }

    @Test
    public void testNoUserScoreRock() {
        final String userPlay = "rock";
        final String computerPlay = "paper";
        final int userScore = 0;
        Assertions.assertEquals(0, ScoreKeeper.addUserScore(computerPlay, userPlay, userScore));
    }

    @Test
    public void testNoUserScoreGainPaper() {
        final String userPlay = "paper";
        final String computerPlay = "scissors";
        final int userScore = 0;
        Assertions.assertEquals(0, ScoreKeeper.addUserScore(computerPlay, userPlay, userScore));
    }

    @Test
    public void testNoUserScoreGainScissors() {
        final String userPlay = "scissors";
        final String computerPlay = "rock";
        final int userScore = 0;
        Assertions.assertEquals(0, ScoreKeeper.addUserScore(computerPlay, userPlay, userScore));
    }

    @Test
    public void testComputerScoreGainFrom0() {
        final String userPlay = "rock";
        final String computerPlay = "paper";
        final int computerScore = 0;
        Assertions.assertEquals(1, ScoreKeeper.addComputerScore(computerPlay, userPlay, computerScore));
    }

    @Test
    public void testComputerScoreGainFrom1() {
        final String userPlay = "paper";
        final String computerPlay = "scissors";
        final int computerScore = 1;
        Assertions.assertEquals(2, ScoreKeeper.addComputerScore(computerPlay, userPlay, computerScore));
    }

    @Test
    public void testComputerScoreGainFrom2() {
        final String userPlay = "scissors";
        final String computerPlay = "rock";
        final int computerScore = 2;
        Assertions.assertEquals(3, ScoreKeeper.addComputerScore(computerPlay, userPlay, computerScore));
    }

    @Test
    public void testComputerScoreRock() {
        final String userPlay = "paper";
        final String computerPlay = "rock";
        final int computerScore = 0;
        Assertions.assertEquals(0, ScoreKeeper.addComputerScore(computerPlay, userPlay, computerScore));
    }

    @Test
    public void testComputerScoreGainPaper() {
        final String userPlay = "scissors";
        final String computerPlay = "paper";
        final int computerScore = 0;
        Assertions.assertEquals(0, ScoreKeeper.addComputerScore(computerPlay, userPlay, computerScore));
    }

    @Test
    public void testNoComputerScoreGainScissors() {
        final String userPlay = "rock";
        final String computerPlay = "scissors";
        final int computerScore = 0;
        Assertions.assertEquals(0, ScoreKeeper.addComputerScore(computerPlay, userPlay, computerScore));
    }
}
