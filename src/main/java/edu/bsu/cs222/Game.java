package edu.bsu.cs222;

public class Game {

    public static void main(String[] args) {

        int userScore = 0;
        int computerScore = 0;
        int round = 1;

        Dialogue.welcomeMessage();

        while (userScore< 3 || computerScore < 3) {

            Dialogue.showRound(round);
            Dialogue.userPlayPrompt();

            String userPlay = UserPlayReceiver.getUserPlay();
            String computerPlay = PlayRandomizer.getRandomPlay();

            Dialogue.showRoundResult(userPlay, computerPlay);

            userScore = ScoreKeeper.addUserScore(computerPlay, userPlay, userScore);
            computerScore = ScoreKeeper.addComputerScore(computerPlay, userPlay, computerScore);

            Dialogue.showScore(userScore, computerScore);
            Dialogue.showGameResult(userScore, computerScore);

            round+=1;

        }
    }
}