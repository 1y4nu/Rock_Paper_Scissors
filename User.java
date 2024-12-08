public class User {
	private String move;
	public User(int select) {
		if (select == 1)
			this.move = "Rock";
		else if (select == 2)
			this.move = "Paper";
		else if (select == 3)
			this.move = "Scissors";
	}
	public String getMove() {
		return move;
	}
}
