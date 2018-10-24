
public class Kyte implements IFly {
	
	private String color;
	private double price;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if (price > 0)
			this.price = price;
	}
	
	public void fly(double velocity) {
		System.out.println("Kyte is flying at " + velocity + " mph");
	}
	
	public boolean land() {
		return true;
	}
	
}
