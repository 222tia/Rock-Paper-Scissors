package edu.bsu.cs222;

public class Game {
    private final static String userPlay = UserPlayReceiver.getUserPlay();
    private final static String computerPlay = PlayRandomizer.getRandomPlay();
    public static void main(String[] args) {

        ResultDecider.getResult(userPlay, computerPlay);

    }
}