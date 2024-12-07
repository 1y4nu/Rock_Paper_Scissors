import java.util.Scanner;
public class RockPaperScissors {
	public static void main(String[] args) {
		Opponent opponent = new Opponent();
		String userMove = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Rock Paper Scissors" + "\n" + 
				"Choose your move(1, 2 or 3): " + "\n" +
				"1. Rock" + "\n" +
				"2. Paper" + "\n" +
				"3. Scissors");
		int userIn = scan.nextInt();
	}
}
