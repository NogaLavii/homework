import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		double total = 0.0;
		
		MovieSeat[][] seats = new MovieSeat[4][3];
		for(int iRow = 0; iRow < seats.length; iRow++) {
			for(int iCol = 0; iCol < seats[iRow].length; iCol++) {
				seats[iRow][iCol] = new MovieSeat();
			}
		}

		Scanner scan = new Scanner(System.in);
		System.out.print("How many tickets would you like to buy? ");
		int numOfTickets = scan.nextInt();
		
		for(int iTicket = 0; iTicket < numOfTickets; iTicket++) {
			System.out.println();
			System.out.println("Ticket #" + (iTicket+1));
			System.out.print("Row: ");
			int row = scan.nextInt();
			System.out.print("Seat: ");
			int seatNr = scan.nextInt();
			
			while(seats[row-1][seatNr-1].isOccupied) {
				System.out.println("This seat is taken... Try again:");
				System.out.print("Row: ");
				row = scan.nextInt();
				System.out.print("Seat: ");
				seatNr = scan.nextInt();
			}
			
			seats[row-1][seatNr-1].isOccupied = true;
			total += seats[row-1][seatNr-1].price;
		}
		scan.close();
		System.out.println();
		System.out.println("Total price is: " + total);
	}

}
