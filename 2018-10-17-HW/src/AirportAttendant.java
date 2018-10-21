
public class AirportAttendant extends Person {

	private int seniority;
	private String countryOfOrigin;
	private String airportPosition;
	
	public AirportAttendant(String firstName, String lastName, int seniority, String countryOfOrigin, String airportPosition) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setSeniority(seniority);
		this.setCountryOfOrigin(countryOfOrigin);
		this.setAirportPosition(airportPosition);
	}

	public int getSeniority() {
		return seniority;
	}

	public void setSeniority(int seniority) {
		if(seniority >= 0)
			this.seniority = seniority;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getAirportPosition() {
		return airportPosition;
	}

	public void setAirportPosition(String airportPosition) {
		this.airportPosition = airportPosition;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Seniority: " + seniority + ", Country of Origin: " 
							+ countryOfOrigin + ", Airport Position: " + airportPosition);
	}

}
