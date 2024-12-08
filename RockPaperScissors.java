import java.util.Scanner;
public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Rock Paper Scissors" + "\n" + 
				"Choose your move(1, 2 or 3): " + "\n" +
				"1. Rock" + "\n" +
				"2. Paper" + "\n" +
				"3. Scissors");
		User user = new User(scan.nextInt());
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
	}
}
