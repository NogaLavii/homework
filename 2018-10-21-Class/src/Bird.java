
public class Bird implements IFly {

	private String birdType;
	private int age;
	private String color;
	public String getBirdType() {
		return birdType;
	}
	public void setBirdType(String birdType) {
		this.birdType = birdType;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age >= 0)
			this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void fly(double velocity) {
		System.out.println("Bird is flying at " + velocity + " mph");
	}
	
	public boolean land() {
		return true;
	}
	
}
