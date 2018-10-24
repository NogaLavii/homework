
public class Airplane implements IFly {
	
	private String pilotName;
	private String airline;
	private String destination;
	
	public String getPilotName() {
		return pilotName;
	}

	public void setPilotName(String pilotName) {
		this.pilotName = pilotName;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void fly(double velocity) {
		System.out.println("Airplane is flying at " + velocity + " mph");
	}

	public boolean land() {
		return true;
	}
}
