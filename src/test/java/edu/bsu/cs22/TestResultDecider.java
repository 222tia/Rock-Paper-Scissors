package edu.bsu.cs22;

import edu.bsu.cs222.ResultDecider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestResultDecider {
    @Test
    public void testUserWinConditionPaper() {
        final String userPlay = "paper";
        final String computerPlay = "rock";
        Assertions.assertTrue(ResultDecider.winCondition(userPlay,computerPlay));
    }

    @Test
    public void testUserWinConditionRock() {
        final String userPlay = "rock";
        final String computerPlay = "scissors";
        Assertions.assertTrue(ResultDecider.winCondition(userPlay,computerPlay));
    }

    @Test
    public void testUserWinConditionScissors() {
        final String userPlay = "scissors";
        final String computerPlay = "paper";
        Assertions.assertTrue(ResultDecider.winCondition(userPlay,computerPlay));
    }

    @Test
    public void testUserLoseConditionPaper() {
        final String userPlay = "paper";
        final String computerPlay = "scissors";
        Assertions.assertFalse(ResultDecider.winCondition(userPlay,computerPlay));
    }

    @Test
    public void testUserLoseConditionRock() {
        final String userPlay = "rock";
        final String computerPlay = "paper";
        Assertions.assertFalse(ResultDecider.winCondition(userPlay,computerPlay));
    }

    @Test
    public void testUserLoseConditionScissors() {
        final String userPlay = "scissors";
        final String computerPlay = "rock";
        Assertions.assertFalse(ResultDecider.winCondition(userPlay,computerPlay));
    }
}
