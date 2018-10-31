
public class User {
	static final char[] availableChars = {'X','O'};
	static boolean[] isCharAvailable = {true,true};
	private char userChar;
	private int numOfWins;
	
	// Constructor
	public User(char userChar) {
		for(int i = 0; i < 2; i++) {
			if(userChar == User.availableChars[i] && User.isCharAvailable[i])
				this.userChar = userChar;
		}
		//numOfWins = 0; // Unnecessary, because it is the default value
	}

	// Getters
	public char getUserChar() {
		return userChar;
	}

	public int getNumOfWins() {
		return numOfWins;
	}

	public void addWin() {
		numOfWins++;
	}
}
