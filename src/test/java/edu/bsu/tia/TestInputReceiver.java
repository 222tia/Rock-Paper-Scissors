package edu.bsu.tia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import rock_paper_scissors.InputReceiver;

import java.io.ByteArrayInputStream;

public class TestInputReceiver extends InputReceiver {
    @Test
    public void testUserPlaysScissors(){
        final String input = "scissors";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        final String output = getUserPlay();
        Assertions.assertEquals("scissors", output);
    }

    @Test
    public void testUserPlaysRock(){
        final String input = "rock";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        final String output = getUserPlay();
        Assertions.assertEquals("rock", output);
    }

    @Test
    public void testUserPlaysPaper(){
        final String input = "paper";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        final String output = getUserPlay();
        Assertions.assertEquals("paper", output);
    }
}
