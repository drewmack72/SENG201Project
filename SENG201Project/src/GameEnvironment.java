import java.util.Scanner;

public class GameEnvironment {
	Scanner input;
	String username;
	int difficultiy;
	GameEnvironment () {
		//TODO add set up for game
		input = new Scanner(System.in);
		username = getValueFromUser("username");
		difficultiy = Integer.parseInt(getValueFromUser("difficultiy"));
	}
	
	private String getValueFromUser(String valueName) {
		String value;
		String confirmationString;
		do {
			System.out.println("Enter " + valueName);
			value = input.nextLine();  // Read user input
			System.out.println(valueName+" is: " + value + " is this correct (y/n)");  // Output user input
			confirmationString = input.nextLine();
		} while ( !confirmationString.contentEquals("y") );
		return value;
	} 
	
	public void run() {
		
	}
	
	public static void main(String[] args) {
		GameEnvironment game = new GameEnvironment();
		while (true) {
			game.run();
		}
	}
}
