
public class Pilot extends Person {
	private int licenseNr;
	private int seniority;
	
	public Pilot(String firstName, String lastName, int licenseNr, int seniority) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setLicenseNr(licenseNr);
		this.setSeniority(seniority);
	}

	public int getLisenceNr() {
		return licenseNr;
	}

	public void setLicenseNr(int licenseNr) {
		if (licenseNr >= 10000)
			this.licenseNr = licenseNr;
	}

	public int getSeniority() {
		return seniority;
	}

	public void setSeniority(int seniority) {
		if (seniority >= 0)
			this.seniority = seniority;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("License #: " + licenseNr + ", Seniority: " + seniority);
	}
	
	
}
