package edu.bsu.cs22;

import edu.bsu.cs222.PlayRandomizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
