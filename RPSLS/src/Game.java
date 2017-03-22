import java.util.Scanner;
public class Game {
	
	private int computerWins;
	private int userWins;
	private boolean userQuits;
	private HandPosition computer;
	private HandPosition user;
	private Scanner input = new Scanner(System.in);
	
//-------------------------------------------------
	//Default Constructor;
	public Game() {
		user = new HandPosition();
		computer = new HandPosition();
		computerWins = 0;
		userWins = 0;
		userQuits = false;
		
	}

	public boolean isDone() {
		if (userWins == 5||computerWins == 5||userQuits == true) {
			return true;
			
		} else return false;
	}//End isDone;
	
	public void makeChoice() {
		computer.randomChoice();
		
	}
	
	public void getChoiceFromUser() {
		System.out.print("\nWhat is your choice? ");
		
		
		if (user.setChoice(input.next()) == false) {
			userQuits = true;
		}else userQuits = false;
		
		
	}
	
	public void displayRoundResult() {
		
		switch(user.compare(computer)) {
		case 1:
			System.out.println("You win: " + user.getName() + " beats " + computer.getName());
			userWins++;
			break;
		case 0: 
			System.out.println("Tie: both choose " + user.getName());
			break;
		case -1:
			System.out.println("You lose: " + computer.getName() + " beats " + user.getName());
			computerWins++;
			break;
		case 99:
			System.out.println("Thanks for playing!");
			break;
		default:
				System.out.print("Error");
		}
	
	}
	
	public void displayGameResults() {
		if(userWins == 5) {
			System.out.print("\nYou win the game, " + userWins + " to " + computerWins);
		}
		
		if(computerWins == 5) {
			System.out.print("\nYou lose the game, " + computerWins + " to " + userWins);
		}
	}

}//END Game;
