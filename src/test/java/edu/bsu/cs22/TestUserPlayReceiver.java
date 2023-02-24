package edu.bsu.cs22;

import edu.bsu.cs222.UserPlayReceiver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

public class TestUserPlayReceiver extends UserPlayReceiver {
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
