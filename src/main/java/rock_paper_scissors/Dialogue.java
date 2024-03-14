package rock_paper_scissors;

public class Dialogue extends ResultDecider {

    public static void showWelcomeMessage(){
        System.out.println("""
                Rock, Paper, Scissors is a two player game where each simultaneously throws the shape
                of a rock, paper, or scissors with their hand. In this version, you will play through
                the terminal to a best of three.
                
                A) singleplayer
                B) multiplayer
                
                Type 'A' or 'B' to select a mode:""");
    }

    public static void showRules(String mode){
        System.out.println("\n\n\n" + mode + " SELECTED");
        System.out.println("""
                
                The winner of the round is determined by these rules:
                1. Rock beats Scissors
                2. Paper beats Rock
                3. Scissors beats Paper
                """);
    }
    public static void showUserPlayPrompt() {
        System.out.println("\nrock, paper, or scissors?: ");
    }

    public static void showRoundResult(String userPlay, String computerPlay){
        if (winCondition(computerPlay, userPlay)) {
            System.out.println("\ncomputer played " + computerPlay + ", you lose!");
        } else if (winCondition(userPlay, computerPlay)) {
            System.out.println("\ncomputer played " + computerPlay + ", you win!");
        } else {
            System.out.println("\ncomputer played " + computerPlay + ", tie!");
        }
    }

    public static void showGameResult(int userScore, int computerScore){
        if (ScoreKeeper.checkScore(userScore, computerScore)){
            System.out.println("\n/ / / GAME OVER / / / \n   player wins!");
            System.exit(0);
        } else if (ScoreKeeper.checkScore(computerScore, userScore)){
            System.out.println("\n/ / / GAME OVER / / / \n   computer wins!");
            System.exit(0);
        }
    }

    public static void showScore(int userScore, int computerScore) {
        System.out.println("\nYour score is: " + userScore + "\nComputer score is: " + computerScore);
    }

    public static void showRound(int round) {
        System.out.println("\n/ / / ROUND " + round + " / / /");
    }
}
