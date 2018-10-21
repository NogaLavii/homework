
public class Passenger extends Person {
	private int passportNr;
	
	public Passenger(String firstName, String lastName, int passpostNr) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPassportNr(passpostNr);
	}

	public int getPassportNr() {
		return passportNr;
	}

	public void setPassportNr(int passportNr) {
		if (passportNr >= 100000000)
			this.passportNr = passportNr;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Passport #: " + passportNr);
	}
	
}
