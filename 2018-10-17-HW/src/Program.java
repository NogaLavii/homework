
public class Program {

	public static void main(String[] args) {
		
		Person[] personsArr = new Person[4];
		
		personsArr[0] = new Pilot("John", "David", 10095, 12);
		personsArr[1] = new FlightAttendant("Alice", "Newman", 2, "Ireland", "Business");
		personsArr[2] = new AirportAttendant("Bob", "Harris", 5, "USA", "Security");
		personsArr[3] = new Passenger("Noga", "Lavi", 180074822);
		
		for (int i = 0; i < personsArr.length; i++) {
			System.out.println();
			personsArr[i].print();
			System.out.println();
		}

	}

}
