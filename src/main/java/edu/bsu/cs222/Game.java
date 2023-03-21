package edu.bsu.cs222;

public class Game {

    public static void main(String[] args) {

        int userScore = 0;
        int computerScore = 0;

        while (userScore< 3 || computerScore < 3) {

            String userPlay = UserPlayReceiver.getUserPlay();
            String computerPlay = PlayRandomizer.getRandomPlay();

            ResultDecider.getResult(userPlay, computerPlay);

            userScore = ScoreKeeper.addUserScore(computerPlay, userPlay, userScore);
            computerScore = ScoreKeeper.addComputerScore(computerPlay, userPlay, computerScore);

            System.out.println("\nYour score is: " + userScore + "\nComputer score is: " + computerScore);
        }
    }
}