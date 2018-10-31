
public class Game {

	static int numOfGamesPlayed = 0;
	private char[][] matrix = new char[3][3]; // = {'1','2','3';'4','5','6';'7';

	// Constructor
	public Game() {
		initMatrix();
		numOfGamesPlayed++;
	}
	
	// Initialize the matrix
	private void initMatrix() {
		int asciiFor1 = 49;
		int count = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matrix[i][j] = (char)(asciiFor1 + count);
				count++;
			}
		}
	}
	
	public boolean playMove(int linearIdx, User player) {
		boolean isPlayed;
		int i,j;
		// Get row index
		i = (linearIdx + 1) / 3;
		i = (linearIdx > i*3 ? i : i-1);
		// Get column index
		j = linearIdx % 3;
		j = (j > 0 ? j : 3);
		j--; // Start index from 0
		// Check if index is valid
		if (linearIdx < 1 || linearIdx > 9 || matrix[i][j] == 'X' || matrix[i][j] == 'O')
		{
			isPlayed = false;
			return isPlayed;
		}else {
			// Set value in matrix
			matrix[i][j] = player.getUserChar();
			if (isWin()) {
				player.addWin();
			}
			isPlayed = true;
			return isPlayed;
		}
	}
	
	public boolean isWin() {
		boolean ret = false;
		for(int i = 0; i < 3; i++) {
			if(matrix[i][0] == matrix[i][1] && matrix[i][1] == matrix[i][2]) {
				return true;
			}
		}
		for(int j = 0; j < 3; j++) {
			if(matrix[0][j] == matrix[1][j] && matrix[1][j] == matrix[2][j]) {
				return true;
			}
		}
		if(matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2] ||
			matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0])
			return true;
			
		return ret;
	}
	
	public char getWinningChar() {
		char ret = '$';
		for(int i = 0; i < 3; i++) {
			if(matrix[i][0] == matrix[i][1] && matrix[i][1] == matrix[i][2]) {
				return matrix[i][0];
			}
		}
		for(int j = 0; j < 3; j++) {
			if(matrix[0][j] == matrix[1][j] && matrix[1][j] == matrix[2][j]) {
				return matrix[0][j];
			}
		}
		if(matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2] ||
			matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0])
			return matrix[1][1];
			
		return ret;
	}
	
	public boolean isOver() {
		// Check if there's a win
		if(isWin())
			return true;
		// Check if matrix is filled
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(matrix[i][j] != 'X' && matrix[i][j] != 'O')
					return false;
			}
		}
		// Otherwise, game is not over
		return false;
	}
	
	public void printMatrix() {
		System.out.println();
		for(int k = 1; k <= 13; k++)
			System.out.print('-');
		System.out.println();  //System.out.print("\n");
		
		for (int i = 0; i < 3; i++) {
			
			System.out.print('|');
			
			for ( int j = 0; j < 3; j++)
				System.out.print(" " + matrix[i][j] + " |");
			System.out.println();  //System.out.print("\n");
			
			for(int k = 1; k <= 13; k++)
				System.out.print('-');
			System.out.println();  //System.out.print("\n");

		}
	}
}

