import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int playerScore = 0;
        int computerScore = 0;
        int roundNumber = 0;

        System.out.println("=== ROCK PAPER SCISSORS ===");
        System.out.println("First one to get 3 points wins!");

        // loop until someone reaches 3 points
        while (playerScore < 3 && computerScore < 3) {
            roundNumber = roundNumber + 1;

            System.out.println();
            System.out.println("Round " + roundNumber);
            System.out.println("1 - Rock");
            System.out.println("2 - Paper");
            System.out.println("3 - Scissors");
            System.out.print("Your choice: ");
            int player = input.nextInt();

            if (player < 1 || player > 3) {
                System.out.println("Wrong choice. Please type 1, 2 or 3.");
                roundNumber = roundNumber - 1;
                continue;
            }

            int computer = random.nextInt(3) + 1;

            // show what the computer picked
            String computerName = "";
            if (computer == 1) {
                computerName = "Rock";
            } else if (computer == 2) {
                computerName = "Paper";
            } else {
                computerName = "Scissors";
            }
            System.out.println("Computer chose: " + computerName);

            // check who wins the round
            if (player == computer) {
                System.out.println("It is a tie!");
            } else if (player == 1 && computer == 3) {
                System.out.println("Rock beats Scissors. You get a point!");
                playerScore = playerScore + 1;
            } else if (player == 2 && computer == 1) {
                System.out.println("Paper beats Rock. You get a point!");
                playerScore = playerScore + 1;
            } else if (player == 3 && computer == 2) {
                System.out.println("Scissors beats Paper. You get a point!");
                playerScore = playerScore + 1;
            } else {
                System.out.println("The computer wins this round.");
                computerScore = computerScore + 1;
            }

            System.out.println("Score - You: " + playerScore + " | Computer: " + computerScore);
        }

        // show the final winner
        System.out.println();
        if (playerScore == 3) {
            System.out.println("Congratulations! You won the game!");
        } else {
            System.out.println("Sorry, the computer won the game.");
        }

        input.close();
    }
}
