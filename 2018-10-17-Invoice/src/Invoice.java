
public class Invoice {
	
	private static int numInstances = 0;
	private final int invoiceNr;
	private final double amount;
	
	// Constructor
	public Invoice(double amount) {
		numInstances++;
		invoiceNr = numInstances;
		this.amount = amount;
	}
	
	// Getters
	public int getInvoiceNr() {
		return invoiceNr;
	}
	
	public double getAmount() {
		return amount;
	}
	
}
