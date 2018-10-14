
public class Program {

	public static void main(String[] args) {
		
		Pizza[] pizzas = new Pizza[5];
		int totalToppings = 0;
		for (int i = 0; i < pizzas.length; i++) {
			pizzas[i] = new Pizza(10.0*(i+1), i+2, i);
			
			System.out.println();
			System.out.println("Pizza number " + (i+1) + ":");
			if (pizzas[i].isBasicPizza())
				System.out.println("Basic");
			else
				System.out.println("Not basic");
			pizzas[i].print();
			totalToppings += pizzas[i].getToppings();
		}
		
		System.out.println();
		System.out.println("Total toppings: " + totalToppings);

	}

}
