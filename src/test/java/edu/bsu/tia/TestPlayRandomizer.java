package edu.bsu.tia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import rock_paper_scissors.PlayRandomizer;

import java.util.ArrayList;
import java.util.Arrays;

public class TestPlayRandomizer {
    private static final ArrayList<String> possiblePlays = new ArrayList<>(
            Arrays.asList("rock", "paper", "scissors"));
    @Test
    public void testPlayRandomizerOutput() {
        final String randomResult = PlayRandomizer.getRandomPlay();
        Assertions.assertTrue(possiblePlays.contains(randomResult));
    }
}
