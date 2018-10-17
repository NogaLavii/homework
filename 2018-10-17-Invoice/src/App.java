import java.text.DecimalFormat;

public class App {

	public static void main(String[] args) {
		
		Invoice[] invoices = new Invoice[8];
		double amount;
		DecimalFormat df2 = new DecimalFormat(".##");
		
		for (int i = 0; i < invoices.length; i++) {
			amount = 80 + Math.random() * (100-80); // Random amount between 80-100
			invoices[i] = new Invoice(amount);
			System.out.println("Invoice #" + invoices[i].getInvoiceNr() + " for " + df2.format(invoices[i].getAmount()) + " ILS");
		}

		
	}

}
