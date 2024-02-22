package edu.bsu.tia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import rock_paper_scissors.ResultDecider;

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
