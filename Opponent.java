import java.util.Random;
public class Opponent {
	private String move;
	public Opponent() {
		Random random = new Random();
		int num = random.nextInt(3);	//Random number between 0 - 2
		if (num == 0)
			this.move = "Rock";
		else if (num == 1)
			this.move = "Paper";
		else if (num == 2)
			this.move = "Scissors";
	}

	public String getMove() {
		return move;
	}
}
