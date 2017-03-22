import java.util.Random;

public class HandPosition {

	private int choice;
	private Random rnd;
//---------------------
	//Default Constructor;
	public HandPosition() {
		choice = 0;
		rnd = new Random();
	}
	
	public void randomChoice() {
		
		choice = rnd.nextInt(5); 
		
	}//END randomChoice;
	
	public boolean setChoice(String set) {
		
		switch(set) {
		case "rock":
			choice = 0;
			return true;
			
		case "paper":
			choice = 1;
			return true;
			
		case "scissors":
			choice = 2;
			return true;
			
		case "spock":
			choice = 3;
			return true;
			
		case "lizard":
			choice = 4;
			return true;
		
		case "quit":
			choice = 99;
			return false;
			
		default:
			return false;
			
		}
	}// End setChoice;
		
	public String choices() {
		return "Rock, Paper, Scissors, Lizard, Spock";
	}//END choices;
		
	public int compare(HandPosition op) {
		int m = ( 5 + this.choice - op.choice) % 5; 
		
		if(this.choice == 99){
			return 99;
			
		} else if ( m == 1 || m == 3) {
			return 1;
			
		} else if (m == 2 || m == 4) {
			return -1;
			
		} else if (m == 0) { 
			return 0;
			
		} else return 0;
		
	}//END compare;
	
	public String getName() {
		switch(choice) {
		case 0:
			return "rock";
		case 1: 
			return "paper";
		case 2:
			return "scissors";
		case 3:
			return "spock";
		case 4:
			return "lizard";
		case 99:
			return " ";
		default:
			return "unknown";
		}
	}//END getName;
	
	
}