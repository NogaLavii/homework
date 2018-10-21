
public class FlightAttendant extends Person {
	private int seniority;
	private String countryOfOrigin;
	private String classType;
	
	public FlightAttendant(String firstName, String lastName, int seniority, String countryOfOrigin, String classType) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setSeniority(seniority);
		this.setCountryOfOrigin(countryOfOrigin);
		this.setClassType(classType);
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

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		switch (classType) {
		case "First":
		case "Business":
		case "Economy":
			this.classType = classType;
		}
		
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Seniority: " + seniority + ", Country of Origin: " 
							+ countryOfOrigin + ", Class: " + classType);
	}
}
