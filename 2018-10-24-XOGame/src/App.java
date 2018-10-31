import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean playAgain;
		String playAgainAns;
		do {
			// Create game object
			Game myGame = new Game();
			myGame.printMatrix();
		
			// Create users
			User[] players = new User[2];
			players[0] = new User('X');
			players[1] = new User('O');

			boolean idxUser = true, isMovePlayed;
			int idxUserInt = 1;
			
			int linearIdx;
			
			while(!myGame.isOver()) {
				
				isMovePlayed = false;
				idxUser = !idxUser;
				idxUserInt = (idxUser ? 1 : 0);
				
				do {
					System.out.println("Player " + players[idxUserInt].getUserChar() + " enter your number: ");
					linearIdx = scan.nextInt();
					if(linearIdx >= 1 && linearIdx <= 9 && myGame.playMove(linearIdx, players[idxUserInt])) 
						isMovePlayed = true;
					else
						System.out.println("Invalid move. Please try again.");
				} while(!isMovePlayed);
				
				
				System.out.println();
				myGame.printMatrix();
			}
			
			if (myGame.isWin()) {
				System.out.println("Player " + players[idxUserInt].getUserChar() + ", congratulations! You win!");
				System.out.println(players[idxUserInt].getNumOfWins() + " out of " + Game.numOfGamesPlayed + " is not bad!");
			}
			
			System.out.println("\nPlay again? (1/0)");
			playAgain = scan.nextInt() == 1;
		} while(playAgain);
		System.out.println("Bye-bye!");
		scan.close();
	}

}
