import java.util.Scanner;
import java.lang.Thread;
public class RockPaperScissors {
	public static void main(String[] args) {

		boolean replay = false;

		while(!replay) {

			Scanner scan = new Scanner(System.in);
			int userIn = 0;
			boolean checkInput = false;

			System.out.println("Welcome to Rock Paper Scissors");

			while (!checkInput) {
				System.out.println("Choose your move (1, 2 or 3): " + "\n" +
						"1. Rock" + "\n" +
						"2. Paper" + "\n" +
						"3. Scissors");
				userIn = scan.nextInt();
				if (userIn >= 1 && userIn <= 3)
					checkInput = true;
				else
					System.out.println("Invalid Input, please enter a number displayed\n");
			}

			User user = new User(userIn);
			Opponent opponent = new Opponent();
			String outcome = "";

			if (user.getMove().equals(opponent.getMove()))
				outcome = "Tie! " + user.getMove() + " vs " + opponent.getMove();
			else {
				if (user.getMove().equals("Rock")) {
					if (opponent.getMove().equals("Scissors")) 
						outcome = "Rock beats Scissors, You win!";
					else
						outcome = "Paper beats Rock, You lose!";
					}
					else if (user.getMove().equals("Paper")) {
						if (opponent.getMove().equals("Rock")) 
							outcome = "Paper beats Rock, You win!";
						else
							outcome = "Scissors beats Paper, You lose!";
					}
					else if (user.getMove().equals("Scissors")) {
						if (opponent.getMove().equals("Paper")) 
							outcome = "Scissors beats Paper, You win!";
						else
							outcome = "Rock beats Scissors, You lose!";
					}
				}
			System.out.println(outcome);

			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}

			System.out.println("Would you like to play again? (Type in the number)" + "\n" +
								"1. Yes" + "\n" +
								"2. No");

			userIn = scan.nextInt();

			if (userIn == 2)
				replay = true;
		}
	}
}