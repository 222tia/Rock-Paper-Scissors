package rock_paper_scissors;

public class PlayRPS {

    public static void main(String[] args) {

        Dialogue.showWelcomeMessage();

        String modeSelection = InputReceiver.getModeSelection();

        if (modeSelection.equals("a")) {
            playSingleplayer();
        } else {
            playMultiplayer();
        }

    }

    public static void playSingleplayer() {
        int userScore = 0;
        int computerScore = 0;
        int round = 1;

        Dialogue.showRules("SINGLEPLAYER");

        while (userScore< 3 || computerScore < 3) {

            Dialogue.showRound(round);
            Dialogue.showUserPlayPrompt();

            String userPlay = InputReceiver.getUserPlay();
            String computerPlay = PlayRandomizer.getRandomPlay();

            Dialogue.showRoundResult(userPlay, computerPlay);

            userScore = ScoreKeeper.addUserScore(computerPlay, userPlay, userScore);
            computerScore = ScoreKeeper.addComputerScore(computerPlay, userPlay, computerScore);

            Dialogue.showScore(userScore, computerScore);
            Dialogue.showGameResult(userScore, computerScore);

            round+=1;

        }
    }

    private static void playMultiplayer() {
    }
}