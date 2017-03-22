
public class Match {
	public static void main (String[] args) {

		Game newGame = new Game();

		System.out.println("Rock-Paper-Scissors-Lizard-Spock was created by"
		+ "\ninternet pioneer Sam Kass as an improvement on the classic game Rock-Paper-Scissors\n"
		+ "All hail Sam Kass.\n");
		System.out.print("Scissors cuts paper\n"
				+ "paper covers rock\n"
				+"rock crushes lizard\n"
				+"lizard poisons spock\n"
				+"Spock smashes scissors\n"
				+"Scissors decapitates lizard\n"
				+"lizard eats paper\n"
				+"paper disproves spock\n"
				+"Spock vaporizes rock\n"
				+"(and as it always has) rock crushes scissors\n\n");


	while(newGame.isDone() == false) {
				newGame.makeChoice();
				newGame.getChoiceFromUser();
				newGame.displayRoundResult();
		}//Loop to 5 wins;

				newGame.displayGameResults();
	}//Display results;
}
