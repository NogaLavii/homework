
public class MovieSeat {
	
	double price;
	boolean isOccupied;
	
	public MovieSeat() {
		price = 70 + Math.random() * (90-70); // Random price between 70-90
		isOccupied = false;
	}
}
