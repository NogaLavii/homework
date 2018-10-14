
public class Pizza {
	private double diameter;
	private int slices;
	private int toppings;
	
	// Constructors
	public Pizza() {
		setDiameter(15.0);
		setToppings(0);
		setSlices(8);
	}
	
	public Pizza(double diameter, int slices, int toppings) {
		setDiameter(diameter);
		setSlices(slices);
		setToppings(toppings);
	}
	
	// Getters/Setters
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		if(diameter < 10 || diameter > 50)
			return;
		this.diameter = diameter;
	}
	public int getSlices() {
		return slices;
	}
	public void setSlices(int slices) {
		if(slices < 1 || slices > 8)
			return;
		this.slices = slices;
	}
	public int getToppings() {
		return toppings;
	}
	public void setToppings(int toppings) {
		if(toppings < 0 || toppings > 5)
			return;
		this.toppings = toppings;
	}
	
	// Methods
	public boolean isBasicPizza() {
		return toppings == 0;
	}
	
	public void print() {
		System.out.println("Pizza info:");
		System.out.println("Diameter: " + diameter + ", Slices: " + slices + ", Toppings: " + toppings);
	}
}
