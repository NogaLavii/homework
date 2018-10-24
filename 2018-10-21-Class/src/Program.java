
public class Program {

	public static void main(String[] args) {
	
		IFly[] flyingThings = new IFly[10];
		for (int i = 0; i < flyingThings.length; i++) {
			flyingThings[i] = createIFly();
		}

		for (int i = 0; i < flyingThings.length; i++) {
			System.out.println();
			flyingThings[i].fly((double)(1000.0 * i+1));
			flyingThings[i].land();
			System.out.println();
		}
	}
	
	static public IFly createIFly() {
		int iRand = (int)(Math.random() * 2.0);
		IFly flyObj = new Bird(); //Probably a bad idea, but if not initialized outside switch it propts an error
		switch (iRand) {
		case 0: flyObj = new Bird();
				break;
		case 1: flyObj = new Airplane();
				break;
		case 2: flyObj = new Kyte();
				break;
		}
		return flyObj;
	}

}
